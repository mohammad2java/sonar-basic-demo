package com.amir.sonarbasic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SonarBasicApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("ignore");
	}
	
	@Test
	public void testMain() {
		SonarBasicApplication sonarBasicApplication = new SonarBasicApplication();
		String[] args = {"amir"};
		sonarBasicApplication.main(args );
	}
	

}
