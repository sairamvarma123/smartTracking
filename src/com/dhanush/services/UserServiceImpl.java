package com.dhanush.services;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.dhanush.dao.UserDao;
import com.dhanush.domain.EquipmentType;
import com.dhanush.domain.Facility;
import com.dhanush.domain.User;
import com.dhanush.domain.UserRegistration;


public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;
	
	public UserServiceImpl(UserDao userDao) {
		// TODO Auto-generated constructor stub
		this.userdao = userDao;
	}

	@Override
	public void insertData(User user) {
		userdao.insertData(user);
	}

	@Override
	public List<User> getUserList() {
		return userdao.getUserList();
	}
	@Override
	public List<EquipmentType> getEquipmentTypeList() {
		return userdao.getEquipmentTypeList();
	}

	/*@Override
	public void deleteData(String id) {
		userdao.deleteData(id);
		
	}*/

	@Override
	public User getUser(String id) {
		return userdao.getUser(id);
	}

/*	@Override
	public void updateData(User user) {
		userdao.updateData(user);
		
	}*/

	/*@Override
	public void insertEquipment(EquipmentMaster em) {
		userdao.insertEquipment(em);
		
	}*/
	@Override
	public List<Facility> getFacilityMasterList() {
		// TODO Auto-generated method stub
		 return userdao.getFacilityMasterList();
	}

	@Override
	public void Registration(UserRegistration registartion) {
		 userdao.Registration(registartion);
	}

	@Override
	public List<UserRegistration> isValidUser(String Email_Id) {
		// TODO Auto-generated method stub
		return userdao.isValidUser(Email_Id);
	}

}
