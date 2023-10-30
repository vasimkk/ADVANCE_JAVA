package com.dl.loosecoupling;

public class EmailService implements MessageService {

	public void sendMessage(String message) {

		 System.out.println("Sending Message: " + message);
	}

}

