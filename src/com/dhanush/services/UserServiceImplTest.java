package com.dhanush.services;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;

import com.dhanush.dao.UserDao;
import com.dhanush.dao.UserDaoImpl;
import com.dhanush.domain.User;
import com.dhanush.domain.UserRegistration;

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration({"classpath*:spring-servlet.xml"})


public class UserServiceImplTest {
	
	@Autowired
	private UserService userService;
	@Autowired 
	private  UserDao userdao;
	
	@Mock
	@Autowired
	private DataSource dataSource;
	@Mock 
	JdbcTemplate  jdbcTemplate;
	@InjectMocks
	private UserDaoImpl userdaoimpl;
    @Mock 
	private User user;
    private UserServiceImpl userserviceimpl;
	private User User;
	private UserRegistration registration;
	private String Email_Id;
    
    public void setJdbcTemplate(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
	@Test
	public void testInsertData() {
		
		dataSource = new DriverManagerDataSource();
        System.out.println("connection Area");
        
        userdao = new UserDaoImpl(dataSource, jdbcTemplate);
        userserviceimpl = new UserServiceImpl(userdao);
        
        user = new User();
        Date d=new Date(2014/03/01);
        user.setEquipment_Id(101);
        user.setEquipment_Type_Name("ac");
        user.setEquipment_Name("Samsung Dao");
        user.setS_NO(10);
        user.setDescription("test");
        user.setReg_No(12);
        user.setStart_Date(d);
        user.setEnd_Date(d);
        
        User userone = new User();
        userdaoimpl.insertData(userone);
         assertEquals("","");
         
	}

	@Test
	public void testGetUserList() {
		
		dataSource = new DriverManagerDataSource();
        System.out.println("connection Area");
        
        userdao = new UserDaoImpl(dataSource, jdbcTemplate);
        userserviceimpl = new UserServiceImpl(userdao);
        
        user = new User();
        Date d=new Date(2014/03/01);
        user.setEquipment_Id(101);
        user.setEquipment_Type_Name("ac");
        user.setEquipment_Name("Samsung Dao");
        user.setS_NO(10);
        user.setDescription("test");
        user.setReg_No(12);
        user.setStart_Date(d);
        user.setEnd_Date(d);
        
        List userList1 = new ArrayList();
        List<User> userone = new ArrayList();
        Mockito.when(userdao.getUserList( )).thenReturn(userone);
        userList1 = userserviceimpl.getUserList();
        assertEquals(userList1,userone);
        
	}

	@Test
	public void testRegistration() {
		dataSource = new DriverManagerDataSource();
		System.out.println("connection Area");
		
		userdao = new UserDaoImpl(dataSource, jdbcTemplate);
		userserviceimpl = new UserServiceImpl(userdao);
		
		registration  = new UserRegistration();
		registration.setUser_Id("Rasmitha");
		registration.setPassword("ras@123");
		registration.setEmail_Id("rasmitha@gmail.com");
		registration.setMobile_No("8520820601");
		
		UserRegistration  reg = new UserRegistration();
        userdaoimpl.Registration(registration);
         assertEquals("","");
	}

	@Test
	public void testIsValidUser() {
		dataSource = new DriverManagerDataSource();
		System.out.println("connection Area");
		
		userdao = new UserDaoImpl(dataSource, jdbcTemplate);
		userserviceimpl = new UserServiceImpl(userdao);
		
		registration  = new UserRegistration();
		registration.setEmail_Id("rasmitha@gmail.com");
		
		List userList1 = new ArrayList();
		List<UserRegistration> reg = new ArrayList();
		Mockito.when(userdao.isValidUser(Email_Id)).thenReturn(reg);
        
        userList1 = userserviceimpl.isValidUser(Email_Id);
        assertEquals(userList1,reg);
		
	}

}
