package com.dhanush.dao;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import com.dhanush.domain.User;
import com.dhanush.domain.UserRegistration;
import com.dhanush.jdbc.RegistrationRowMapper;
import com.dhanush.jdbc.UserRowMapper;
      @RunWith(MockitoJUnitRunner.class)
      @ContextConfiguration(locations = {"/spring-servlet.xml"})
      //@ContextConfiguration({"classpath*:spring-servlet.xml"})

	 public class UserDaoImplTest {
	 	@Autowired 
	 	  	  
	  private UserDao userdao;
	 	  private User user;
	 		 @Mock
	   @Autowired
	    private DataSource dataSource;
	   @Mock 
	  JdbcTemplate  jdbcTemplate;
	     @InjectMocks
	    private UserDaoImpl userdaoimpl;
	     @Mock
	      private UserRegistration  registration ;
	 	 public void setJdbcTemplate(DataSource dataSource) {
	          this.jdbcTemplate = new JdbcTemplate(dataSource);
	      }
	     @Test
	     public void testGetRegesterationData(){
	    	 dataSource = new DriverManagerDataSource();
	    	 registration = new UserRegistration ();
		        
	          registration.setUser_Id("101");
	          registration.setPassword("12345");
	          registration.setEmail_Id("dfg@gmail.com");
	          registration.setMobile_No("9703332964");
	           List userList = new ArrayList();
	           userList.add("test");
	           List userList1 = new ArrayList();
	          
	          Mockito.when(jdbcTemplate.query("select * from Registration",  new RegistrationRowMapper())).
	          thenReturn(userList);
	          userList1 = userdaoimpl.isValidUser("dfg@gmail.com");
	          System.out.println(userList1);
	          assertEquals("","");
	          System.out.println("====");
	     }
	      @Test
	     public void testInsertRegesterationData()
	     {
	    	  
	    	 System.out.println("TEST REGISTERATION");
	    	 userdaoimpl.Registration( registration);
	    	 System.out.println("====");
	     }
	     @Test
	     public void testGetUserList()
	     {
	    	 user = new User();
	          Date d=new Date(2014/03/01);
	          user.setEquipment_Id(101);
	          user.setEquipment_Type_Name("ac");
	          user.setEquipment_Name("Samsung Dao");
	          user.setS_NO(10);
	          user.setDescription("test");
	          user.setReg_No(12);
	          List userList = new ArrayList();
	          userList.add("test");
	          List userList1 = new ArrayList();
	          user.setStart_Date(d);
	          user.setEnd_Date(d);
	          Mockito.when(jdbcTemplate.query("select * from Equipment_Master",  new UserRowMapper())).thenReturn(userList);

	          userList1 = userdaoimpl.getUserList();
	          System.out.println("==========");
	    	}
	     @Test
	     public void testInsertData()
	     {
	    	 
	    	 /*userdaoimpl.insertData(user);
	    	 System.out.println("====");
	    	 assertEquals("","");*/
	    	 dataSource = new DriverManagerDataSource();
	         System.out.println("connection Area");
	     
	     userdao = new UserDaoImpl(dataSource,jdbcTemplate);

	      
	        user = new User();
	         Date d=new Date(2014/03/01);
	         user.setEquipment_Id(101);
	         user.setEquipment_Type_Name("ac");
	         user.setEquipment_Name("Samsung Dao");
	         user.setS_NO(10);
	         user.setDescription("test");
	         user.setReg_No(12);
	         List userList = new ArrayList();
	         userList.add("test");
	         List userList1 = new ArrayList();
	         user.setStart_Date(d);
	         user.setEnd_Date(d);
	         userdaoimpl.insertData(user);
	         System.out.println(userList1);
	         assertEquals("","");
	         
	        
	           
	         
	     }
	 }
	 	

