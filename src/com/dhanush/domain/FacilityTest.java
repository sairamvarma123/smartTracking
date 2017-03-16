package com.dhanush.domain;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class FacilityTest {
	Facility facility=new Facility();

	@Test
	public void testGetFaciltiy_id() {
		facility.setFaciltiy_id(0001);
		System.out.println(facility.getFaciltiy_id());
		assertEquals(0001,facility.getFaciltiy_id());
		
	}

	@Test
	public void testGetFaciltiy_Manager_id() {
	facility.setFaciltiy_Manager_id(10001);
	System.out.println(facility.getFaciltiy_Manager_id());
	assertEquals(10001,facility.getFaciltiy_Manager_id());
	System.out.println(facility.getFaciltiy_Manager_id());
		
	}

	@Test
	public void testGetArea_Manager_id()
	{
		facility.setArea_Manager_id(20002);
		assertEquals(20002,facility.getArea_Manager_id());
		
	}

	@Test
	public void testGetEquipment_Name() 
	{
		facility.setEquipment_Name("Monitor");
		assertEquals("Monitor",facility.getEquipment_Name());
	}

	@Test
	public void testGetCreate_Date()
	{
	Date d = new Date(2014/03/01);
	facility.setCreate_Date(d);
	assertEquals(d,facility.getCreate_Date());
	}

	@Test
	public void testGetLatitude()
	{
		facility.setLatitude(1.2f);
		assertTrue(facility.getLatitude()==1.2f);
	}

	@Test
	public void testGetLongitude() {
	facility.setLongitude(1.3f);
	assertTrue(facility.getLongitude()==1.3f);
	}

}

