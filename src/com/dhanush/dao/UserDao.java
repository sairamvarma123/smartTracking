package com.dhanush.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dhanush.domain.EquipmentType;
import com.dhanush.domain.Facility;
import com.dhanush.domain.User;
import com.dhanush.domain.UserRegistration;

public interface UserDao {
	public void insertData(User user);
    public List<User> getUserList();
    //public void updateData(User user);
   //public void deleteData(String id);
    public User getUser(String id);
	public List<EquipmentType> getEquipmentTypeList();
	public List<Facility> getFacilityMasterList();
    public void Registration(UserRegistration registartion);
    public List<UserRegistration> isValidUser(String Email_Id);
 
  

}
