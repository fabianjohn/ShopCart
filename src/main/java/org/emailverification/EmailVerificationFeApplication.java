package org.emailverification;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailVerificationFeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailVerificationFeApplication.class, args);
		
		
		Scanner scan = new Scanner(System.in);
		 Date date = new Date();
		 System.out.println(date);
		 
		 Random random = new Random();
			int randomCode = random.nextInt(100000);
			System.out.print(randomCode);
	}

	
	 
}
