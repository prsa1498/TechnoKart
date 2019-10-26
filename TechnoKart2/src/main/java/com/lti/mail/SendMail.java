package com.lti.mail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



import javax.activation.*;

public class SendMail {
		SendMail sendmail;
		private String email;
		
		
		public SendMail() {
			super();
		}
		
		public SendMail(String receiverEmail) {
			System.out.println("In sendmail "+receiverEmail);
			final String from = "techno.kart.psvm@gmail.com";
			String to = receiverEmail;
			final String password = "psvm@123";
			String host =  "smtp.gmail.com";
			String port = "587";
			
			Properties props = new Properties();
			props.put("mail.smtp.host", host);
			props.put("mail.smtp.socketFactory.port", "465");
			
			
			
	props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", port);
			Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from,password);
				}
			});
			// compose message
			try {
				MimeMessage message = new MimeMessage(session);
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
				message.setSubject("Reset password link");
				message.setText("http://localhost:8088/TechnoKart/forgotPass.jsp");
				// send message
				Transport.send(message);
				System.out.println("message sent successfully");
			} catch (MessagingException e) {
				System.out.println(e);
			}
		}
		
		public void passMail(String receiverEmail, String pass) {
			System.out.println("In sendmail "+receiverEmail);
			final String from = "techno.kart.psvm@gmail.com";
			String to = receiverEmail;
			final String password = "psvm@123";
			String host =  "smtp.gmail.com";
			String port = "587";
			
			Properties props = new Properties();
			props.put("mail.smtp.host", host);
			props.put("mail.smtp.socketFactory.port", "465");
			
			
			
	props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", port);
			Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from,password);
				}
			});
			// compose message
			try {
				MimeMessage message = new MimeMessage(session);
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
				message.setSubject("Your login password");
				
				message.setText("Your default password is: "+ pass +" \n You can change this after completing sign in process.");
				// send message
				Transport.send(message);
				System.out.println("message sent successfully");
			} catch (MessagingException e) {
				System.out.println(e);
			}
		}

		
		
		
		
}