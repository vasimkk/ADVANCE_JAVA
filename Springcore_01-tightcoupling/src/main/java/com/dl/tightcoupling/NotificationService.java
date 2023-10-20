package com.dl.tightcoupling;

public class NotificationService {
	EmailServices services= new EmailServices ();
	public void notificationService(String message) {
		services.sendEmail(message);
		
		
	}
	public static void main(String[] args) {
		NotificationService notificationService= new NotificationService();
		notificationService.notificationService ("HELLO");
		
	}
}
