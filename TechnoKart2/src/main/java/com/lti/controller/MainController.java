package com.lti.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.CustomerEntity;
import com.lti.entity.FilePojo;
import com.lti.entity.ProductEntity;
import com.lti.entity.RetailerEntity;
import com.lti.mail.SendMail;
import com.lti.service.AdminService;
import com.lti.service.CartService;
import com.lti.service.CustomerService;
import com.lti.service.RetailerService;
import com.lti.service.WishlistService;

@Controller
public class MainController {
	@Autowired
	private CustomerService customerService;

	@Autowired
	private RetailerService retailerService;

	
	@Autowired
	private AdminService adminService;

	@Autowired
	private CartService cartService;

	@Autowired
	private WishlistService wishlistService;

	@RequestMapping(path = "/login.lti", method = RequestMethod.POST)
	public String customerGet(@RequestParam("u_email") String u_email, @RequestParam("u_pass") String u_pass,
			HttpServletRequest request, HttpSession session, Map model) {
		System.out.println("now im here");
		CustomerEntity customerEntity = (CustomerEntity) customerService.get(u_email);
		System.out.println("abcd");
		String s = customerEntity.getU_pass();
		String s1 = customerEntity.getU_name();
		if (s.equals(u_pass)) {
			// session.setAttribute("u_email", u_email);
			System.out.println(s1);
			session = request.getSession();
			session.setAttribute("u_name", s1);
			session.setAttribute("u_id", customerEntity.getU_id());
			System.out.println("session created" + session.getAttribute("u_id"));
			return "uIndex.jsp";
		} else {
			return "firstLogin.jsp";
		}
	}

	@RequestMapping(path = "/signup.lti", method = RequestMethod.POST)
	public String customerRegister(CustomerEntity customerEntity, Map model) {
		System.out.println("hii1");
		customerService.register(customerEntity);
		System.out.println("hiiiiiiiii1");
		return "homePage.jsp";
	}

	@RequestMapping(path = "/addProduct.lti", method = RequestMethod.POST)
	public String productRegister(ProductEntity productEntity, @RequestParam("p_name") String pname, Map model,
			HttpSession session) {
		System.out.println("hello1");

		String p_name = pname;
		session.setAttribute("p_name", p_name);
		retailerService.register(productEntity);
		// productEntity.setP_img(getBinaryStream(p_img));
		System.out.println("hellooo1");
		return "addImage.jsp";
	}

	@RequestMapping(path = "/addImg.lti", method = RequestMethod.POST)
	public String save(@ModelAttribute("uploadForm") FilePojo filePojo, Model map, HttpSession session) {

		List<MultipartFile> files = filePojo.getFiles();
		String imagetolink = null;
		ProductEntity productEntity = new ProductEntity();
		List<String> fileNames = new ArrayList<String>();
		try {
			if (files != null && files.size() > 0) {
				for (MultipartFile multipartFile : files) {

					String fileName = multipartFile.getOriginalFilename();
					imagetolink = fileName;
					File file1 = new File(
							"D:\\ProjectGladiator\\TechnoKart2\\src\\main\\webapp\\resources\\images\\" + fileName);
					multipartFile.transferTo(file1);
					fileNames.add(fileName);
					// Handle file content -
					multipartFile.getInputStream();

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		map.addAttribute("files", fileNames);
		String pname = (String) session.getAttribute("p_name");
		retailerService.addImg(pname, imagetolink);
		System.out.println(imagetolink);
		System.out.println(pname);
		return "homePage.jsp";
	}

	@RequestMapping(path = "/addRetailer.lti", method = RequestMethod.POST)
	public String register(RetailerEntity retailerEntity, Map model, HttpSession session) {
		System.out.println("hello1");
		session.setAttribute("r_email",retailerEntity.getR_email());
		session.setAttribute("r_pass", retailerEntity.getR_pass());
		adminService.register(retailerEntity);
		 session.setAttribute("r_email",retailerEntity.getR_email());
		session.setAttribute("r_pass", retailerEntity.getR_pass());
		SendMail sendMail = new SendMail();
		sendMail.passMail((String)session.getAttribute("r_email"),(String)session.getAttribute("r_pass") );
		System.out.println("hellooo1");
		return "adminFirst.jsp";
	}

	@RequestMapping(value = "/showRetailer.lti", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		try {
			System.out.println("delete mdhe ");
			mv.setViewName("retDetails.jsp");
			List<RetailerEntity> rl = null;
			rl = retailerService.getRetailer();
			System.out.println(rl);
			mv.addObject("rl", rl);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}

	@RequestMapping(path = "/removeRetailer.lti")
	public String removeRetailer(@RequestParam("id") int r_id) {
		System.out.println("hello1");
		retailerService.remove(r_id);
		System.out.println("hellooo1");
		return "adminFirst.jsp";
	}

	@RequestMapping(path = "/adminLogin.lti", method = RequestMethod.POST)
	public String adminGet(@RequestParam("a_email") String a_email, @RequestParam("a_pass") String a_pass) {
		System.out.println("now im here");
		List c1 = adminService.get(a_email);
		Iterator i = c1.iterator();

		String s = (String) i.next();
		if (a_pass.equals(s)) {
			return "adminFirst.jsp";
		} else {
			return "firstLogin.jsp";
		}
	}

	@RequestMapping(path = "/retLogin.lti", method = RequestMethod.POST)
	public String retailerGet(@RequestParam("r_email") String r_email, @RequestParam("r_pass") String r_pass) {
		System.out.println("now im here");
		List c1 = retailerService.get(r_email);
		Iterator i = c1.iterator();
		String s = (String) i.next();
		if (r_pass.equals(s)) {
			return "homePage.jsp";
		} else {
			return "firstLogin.jsp";
		}
	}

	@RequestMapping(path = "/uReset.lti", method = RequestMethod.POST)
	public String userReset(@RequestParam("old_pass") String oldPass, @RequestParam("new_pass") String newPass) {
		String s1 = customerService.reset(oldPass, newPass);
		System.out.println(s1);
		if (s1.equalsIgnoreCase("success"))
			return "uIndex.jsp";
		else
			return "uPassReset.jsp";
	}

	@RequestMapping(path = "/rReset.lti", method = RequestMethod.POST)
	public String retailerReset(@RequestParam("old_pass") String oldPass, @RequestParam("new_pass") String newPass) {
		String s1 = retailerService.reset(oldPass, newPass);
		System.out.println(s1);
		if (s1.equalsIgnoreCase("success"))
			return "homePage.jsp";
		else
			return "rPassReset.jsp";
	}

	@RequestMapping(path = "/aReset.lti", method = RequestMethod.POST)
	public String adminReset(@RequestParam("old_pass") String oldPass, @RequestParam("new_pass") String newPass) {
		String s1 = adminService.reset(oldPass, newPass);
		System.out.println(s1);
		if (s1.equalsIgnoreCase("success"))
			return "homePage.jsp";
		else
			return "aPassReset.jsp";
	}

	@RequestMapping(path = "/prodToCart.lti", method = RequestMethod.POST)
	public String addProd(HttpSession session, HttpServletRequest request) {
		if (session == null) {
			return "firstLogin.jsp";
		} else {
			int u_id = (int) session.getAttribute("u_id");
			session.setAttribute("p_id", request.getAttribute("p_id"));
			int p_id = (int) session.getAttribute("p_id");
			String s1 = cartService.addProd(p_id, u_id);
			System.out.println(s1);
			return "homePage.jsp";
		}
	}

	@RequestMapping(path = "/prodToWish.lti", method = RequestMethod.POST)
	public String addWish(HttpSession session, HttpServletRequest request) {
		if (session == null) {
			return "firstLogin.jsp";
		} else {
			int u_id = (int) session.getAttribute("u_id");
			session.setAttribute("p_id", request.getAttribute("p_id"));
			int p_id = (int) session.getAttribute("p_id");
			String s1 = wishlistService.addProd(p_id, u_id);
			System.out.println(s1);
			return "homePage.jsp";
		}
	}

	@RequestMapping(path = "/newPass.lti", method = RequestMethod.POST)
	public String forgotPass(@RequestParam("u_email") String u_email) {
		System.out.println("In controller" + u_email);
		SendMail sendmail = new SendMail(u_email);
		return "firstLogin.jsp";
	}

	@RequestMapping(path = "/forPass.lti", method = RequestMethod.POST)
	public String userReset(@RequestParam("u_add") String u_add, @RequestParam("u_pass") String u_pass,
			@RequestParam("u_pass1") String u_pass1) {

		if (u_pass1.equals(u_pass)) {
			String s1 = customerService.change(u_add, u_pass);
			System.out.println("password changed");
			return "homePage.jsp";

		} else
			return "forgotPass.jsp";
	}

	@RequestMapping(value = "/logout.lti", method = RequestMethod.GET)
	public String logout() {
		return "homePage.jsp";
	}

	@RequestMapping(value = "/showProd.lti", method = RequestMethod.GET)
	public ModelAndView showProd(HttpServletRequest request,HttpSession session) {
		ModelAndView mv = new ModelAndView();
		
		//String projpath = request.getServletContext().getRealPath("/") + "images";
		//String path = ".webapp/resources/images/";
		try {
			System.out.println("inside try");
			mv.setViewName("prodTrail.jsp");
		List<ProductEntity> pl = null;
		pl = retailerService.getProd();
		mv.addObject("pl", pl);
		session.setAttribute("product", pl);
		System.out.println("session object"+session.getAttribute("product"));
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return mv;
	}

}
