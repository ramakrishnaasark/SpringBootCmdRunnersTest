package com.twitter.app;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM RUNNER");
		System.out.println(args);
		System.out.println(Arrays.asList(args));
	}

}
