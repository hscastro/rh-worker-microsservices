package com.hscastro.rhuser;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class RhUserApplication implements CommandLineRunner {
	
	//@Autowired
	//private BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(RhUserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Bcrypt = "+passwordEncoder.encode("qwe123"));
	}
}
