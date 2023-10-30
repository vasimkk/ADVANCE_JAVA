package com.dl.loosecoupling;

public class NotificationService {

	// has a relationship
	private EmailService emailService;

	public EmailService getEmailService() {
		return emailService;
	}

	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	public void display(String message) {

		emailService.sendMessage(message);
	}

	public static void main(String[] args) {

//		EmailService emailService2 = new EmailService();
//		emailService2.sendMessage("Hello");

		NotificationService notificationService = new NotificationService();
		notificationService.setEmailService(new EmailService());
		notificationService.display("Sai Kiran ");
	}

}

