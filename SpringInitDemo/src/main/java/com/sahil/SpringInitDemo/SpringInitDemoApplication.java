package com.sahil.SpringInitDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInitDemoApplication {

	public static void main(String[] args) {

		ApplicationContext  applicationContext = SpringApplication.run(SpringInitDemoApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		boolean result =  binarySearch.binarySearch(new int[]{1,2,3},3);
		System.out.println(result);
	}

}
