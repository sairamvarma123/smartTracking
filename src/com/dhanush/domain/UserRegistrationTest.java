package com.dhanush.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationTest {
 
	UserRegistration reg = new UserRegistration();
 
 @Test
 public void testGetUser_Id() {
  reg.setUser_Id("Rasmitha");
  assertEquals("User_Id","Rasmitha",reg.getUser_Id());
 }

 @Test
 public void testSetUser_Id() {
  reg.setUser_Id("Rasmitha");
 }

 @Test
 public void testGetPassword() {
  reg.setPassword("ras@123");
  assertEquals("Password","ras@123",reg.getPassword());
 }

 @Test
 public void testSetPassword() {
  reg.setPassword("ras@123");
 }

 @Test
 public void testGetEmail_Id() {
  reg.setEmail_Id("rasmitha@gmail.com");
  assertEquals("Email_Id","rasmitha@gmail.com",reg.getEmail_Id());
 }

 @Test
 public void testSetEmail_Id() {
  reg.setEmail_Id("rasmitha@gmail.com");
 }

 @Test
 public void testGetMobile_No() {
  reg.setMobile_No("8520820601");
  assertEquals("Mobile_No","8520820601",reg.getMobile_No());
 }

 @Test
 public void testSetMobile_No() {
  reg.setMobile_No("8520820601");
 }

}