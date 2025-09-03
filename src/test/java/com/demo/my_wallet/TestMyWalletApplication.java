package com.demo.my_wallet;

import org.springframework.boot.SpringApplication;

public class TestMyWalletApplication {

	public static void main(String[] args) {
		SpringApplication.from(MyWalletApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
