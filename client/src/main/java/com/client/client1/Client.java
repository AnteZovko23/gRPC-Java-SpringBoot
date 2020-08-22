package com.client.client1;

import com.github.antezovko23.clientlibrary.ServerConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Client implements ApplicationRunner {

	@Autowired
	ServerConnection serverConnection;

	// @Autowired 
	// PresetIncrement presetIncrement;

	// @Autowired
	// DynamicIncrement dynamicIncrement;

	// @Autowired
	// ConstantIncrement constantIncrement;
	

	public static void main(String[] args)  {
		SpringApplication.run(Client.class, args);
		
	}


	@Override
    public void run(ApplicationArguments args) throws Exception {
	

			System.out.println(serverConnection.connectToServer("Test", 2, 4));

			// // System.out.println(dynamicIncrement.increment(3, 6));

			// // System.out.println(presetIncrement.incrementByTen(2));

			// constantIncrement.incrementConstantly(4, 2);


		
		
		


    }

}
