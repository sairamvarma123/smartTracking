package com.dhanush.services;

import java.sql.SQLException;
import java.util.List;
import com.dhanush.domain.EquipmentType;
import com.dhanush.domain.Facility;
import com.dhanush.domain.User;
import com.dhanush.domain.UserRegistration;
public interface UserService {
public void insertData(User user);
public List<User> getUserList();
//  public void deleteData(String id);
public User getUser(String id);
// public void updateData(User user);
public List<EquipmentType> getEquipmentTypeList();
public List<Facility> getFacilityMasterList();
public void Registration(UserRegistration registartion);
public List<UserRegistration> isValidUser(String Email_Id);

}
