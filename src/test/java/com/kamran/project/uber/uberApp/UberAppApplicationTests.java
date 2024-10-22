package com.kamran.project.uber.uberApp;

import com.kamran.project.uber.uberApp.services.EmailSenderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UberAppApplicationTests {

	@Autowired
	private EmailSenderService emailSenderService;

	@Test
	void contextLoads() {
		emailSenderService.sendEmail(
				"repat69529@abaot.com",
				"This is the testing email",
				"Body of my mail"
		);
	}

	@Test
	void sendEmailMultiple() {
		String emails[] = {
				"mailtoshababanwar@gmail.com",
				"syedasad079@gmail.com",
				"khankamranalwi@gmail.com",
		};
		emailSenderService.sendEmail(emails, "UBER Application - MAIL TESTING",
				"Hey buddy, imagine you’re building the brains of a ride-hailing app like Uber! The app needs to know who the riders and drivers are, so it keeps track of them when they sign up. When a rider wants a ride, the app finds a nearby driver and connects them. As the driver moves, the app follows their location in real time, like magic! It also figures out how much the trip costs based on how far they go, and then helps the rider pay the driver. All this happens while the app keeps everything safe and sends little alerts to both the driver and rider so they know what’s happening during the ride. Cool, right?"
		+ "  Please provide feedback which mail article was better 1st or 2nd. Wait for the reply my friends! ❤️"
		);
	}

}
