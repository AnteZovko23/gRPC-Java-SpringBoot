package com.client.client1;

import com.github.antezovko23.clientlibrary.ServerConnection;

import com.github.antezovko23.clientlibrary.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Client implements ApplicationRunner {

	@Autowired
	ServerConnection serverConnection;

	@Autowired
	DynamicIncrement dynamicIncrement;


	

	public static void main(String[] args)  {
		SpringApplication.run(Client.class, args);
		
	}


	@Override
    public void run(ApplicationArguments args) {
	

			System.out.println(serverConnection.connectToServer("Test", 2, 4));

			// System.out.print(dynamicIncrement.increment(4, 2));


		
		
		


    }

}
