package com.dhanush.domain;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

public class EquipmentTypeTest {
	
	EquipmentType card=new EquipmentType();
	
	@Test
	public void testGetEquipment_Type_Id() {
		card.setEquipment_Type_Id(10);
		assertEquals("Equipment_Type_Id",10, card.getEquipment_Type_Id());		
	}

	@Test
	public void testSetEquipment_Type_Id() {
		card.setEquipment_Type_Id(10);
		
	}

	@Test
	public void testGetNAME() {
		card.setNAME("AirConditioner");
		assertEquals("NAME","AirConditioner", card.getNAME());
	}

	@Test
	public void testSetNAME() {
		card.setNAME("AirConditioner");
		
	}

	@Test
	public void testGetDate() {
		Date tempDate = new Date(2014/03/01);	
		card.setDate(tempDate);	
		assertEquals(card.getDate(),tempDate);	
	}

	@Test
	public void testSetDate() {
		Date tempDate = new Date(2014/03/01);	
		card.setDate(tempDate);	
			
	}

	@Test
	public void testGetMobility_Status() {
		card.setMobility_Status("Active");
		assertEquals("Mobility_Status","Active", card.getMobility_Status());
	}

	@Test
	public void testSetMobility_Status() {
		card.setMobility_Status("Active");
		
	}

}
