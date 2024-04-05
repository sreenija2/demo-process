package com.digitalgoldwallet.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class DigitalGoldWalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalGoldWalletApplication.class, args);
	}

}
