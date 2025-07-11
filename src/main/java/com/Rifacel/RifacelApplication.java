package com.Rifacel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.Rifacel.config.RsaKeyProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class RifacelApplication {

	public static void main(String[] args) {
		SpringApplication.run(RifacelApplication.class, args);
	}

}
