/*
 * Copyright 2018 Codesaaz Inc.
 * @author Rahat Ali
 *
 */

package com.codesaaz.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ApplicationStartup {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStartup.class, args);
	}

}
