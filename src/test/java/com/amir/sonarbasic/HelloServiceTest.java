package com.amir.sonarbasic;

import org.junit.jupiter.api.Test;

class HelloServiceTest {

	@Test
	void testHello() {
		new HelloService().hello();
	}

}
