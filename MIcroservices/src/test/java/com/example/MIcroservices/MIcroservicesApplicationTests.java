package com.example.MIcroservices;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.MIcroservices.controller.MicroservicesController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MIcroservicesApplicationTests {

	@Test
	public void contextLoads() {
		MicroservicesController msC=new MicroservicesController();
		assertNotNull(msC.ExternalAllocRequest());
		assertNull(msC.ExternalAllocApproval());
		assertNotNull(msC.FundsAlloc());
	}

}
