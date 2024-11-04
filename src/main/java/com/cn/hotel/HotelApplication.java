package com.cn.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);
	}
      //Up to now we learn generation of the token
      // Perform authentication mechanism
      // now we need to small modification on security config to bind the auth.login  Api to perform authentication
}
