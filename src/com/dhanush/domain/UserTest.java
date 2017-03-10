package com.dhanush.domain;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class UserTest {
	User user=new User();
	@Test
	public void testGetEquipment_Id() 
	{
		user.setEquipment_Id(1002);
		 assertEquals(1002,user.getEquipment_Id());
	}

	
	@Test
	public void testGetEquipment_Type_Name()
	
	{
		user.setEquipment_Type_Name("Electrics");
		assertTrue(user.getEquipment_Type_Name()=="Electrics");
	}

	@Test
	public void testSetEquipment_Type_Name() {
		user.setEquipment_Type_Name("Electrics");
	
	}

	@Test
	public void testGetEquipment_Name() {
		user.setEquipment_Name("AC");
		assertEquals(user.getEquipment_Name(),"AC");
	}

	

	@Test
	public void testGetS_NO() {
		user.setS_NO(121);
		assertTrue(user.getS_NO()==121);
		
	}



	@Test
	public void testGetDescription() {
		
user.setDescription("testing");
assertTrue(user.getDescription()=="testing");

	}

	

	@Test
	public void testGetReg_No() {
		user.setReg_No(203);
		assertTrue(user.getReg_No()==203);
	}

	

	@Test
	public void testGetStart_Date() {
		 Date tempDate = new Date(2014/03/01);
			user.setStart_Date(tempDate);
			assertEquals(user.getStart_Date(),tempDate);
	}

	

	@Test
	public void testGetEnd_Date() {
		 Date tempDate = new Date(2014/03/01);
		user.setEnd_Date(tempDate);
		assertEquals(user.getEnd_Date(),tempDate);
	}

	

	@Test
	public void testGetFacility_Name() {
		user.setFacility_Name("Cooling");
		assertTrue(user.getFacility_Name()=="Cooling");

	}

	

	
}
