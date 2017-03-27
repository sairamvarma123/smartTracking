package com.dhanush.controller;


import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.ModelAndView;

import com.dhanush.dao.UserDao;
import com.dhanush.dao.UserDaoImpl;
import com.dhanush.domain.User;
import com.dhanush.domain.UserRegistration;
import com.dhanush.jdbc.UserRowMapper;
import com.dhanush.services.UserService;
import com.dhanush.services.UserServiceImpl;
import com.mysql.jdbc.PreparedStatement;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring-servlet.xml"})
//@ContextConfiguration("../../../smartTracking/WebContent/WEB-INF/spring-servlet.xml")
@ActiveProfiles("test")
public class HomePageControllerTest  {
	@Mock
	//JdbcTemplate jdbcTemplate;
	  private Connection conn;
	  private PreparedStatement ps;
	  private ResultSet rs;
	  private UserService userservice;
	
	  @Mock
	  @Autowired
	    private DataSource dataSource;
	  @Mock 
	 JdbcTemplate  jdbcTemplate;
	    @InjectMocks
	   private UserDaoImpl userdaoimpl;
	    @Mock
	    
	   private User user;
	 
	    public void setJdbcTemplate(DataSource dataSource) {
	         this.jdbcTemplate = new JdbcTemplate(dataSource);
	     }

	 
	/*private UserService userservice;
	private Connection myConnection;
	private UserDao userdao;	
	private User user;
	private HomePageController home;*/
	/*@Test
	public void testHomePageController() {
		fail("Not yet implemented");
	}
/*
	@Test
	public void testRegisterUser() {
		fail("Not yet implemented");
	}*/
	 
	//DataSource dataSource = new DriverManagerDataSource();
	
	Properties props = new Properties();
	String s = props.getProperty("dataSource");
/*	DataSource dataSource = Mockito.mock(DataSource.class);*/
	 UserDao userdao = new UserDaoImpl(dataSource);
	 
	
	/*@Test
	public void testInserData() {
		
		System.out.println("connection crea");
		userdao = new UserDaoImpl(dataSource);
		userservice = new UserServiceImpl(userdao);
		home=new HomePageController(userservice);
	User user = new User();
		Date d = new Date(2014/03/01);
		user.setEquipment_Id(1002);
		user.setEquipment_Name("hello");
		user.setEquipment_Type_Name("facility");
		user.setFacility_Name("testing");
		user.setReg_No(110);
		user.setS_NO(113);
		user.setStart_Date(d);
		user.setEnd_Date(d);
		user.setDescription("ok");
		//when(home.inserData(user)).thenReturn("redirect:/getList");
		String str=home.inserData(user);
		assertEquals("redirect:/getList",str);
	
	}
*/
	/*@Test
	public void testLoginUser() {
		fail("Not yet implemented");
	}*/

	/*@Test
	public void testUserLogin() {
		List<ModelAndView> userList=(List<ModelAndView>) home.getUserLIst();
		List<User> userList1 = userservice.getUserList();
		assertEquals(userList,userList1);
	}*/

/*@Test
	public void testUserRegistartion() {
		
		ModelAndView model=(ModelAndView)home.UserRegistartion();
		ModelAndView model1=new ModelAndView("UserRegistration");
		assertEquals(model,model1);
		
	}*/

	/*@Test
	public void testUserregistration() {
		System.out.println("connection crea");
		System.out.println("connection crea");
		userdao = new UserDaoImpl(dataSource);
		userservice = new UserServiceImpl(userdao);
		home=new HomePageController(userservice);
		UserRegistration user = new UserRegistration();
		user.setUser_Id("vinod");
		user.setPassword("123456");
		user.setEmail_Id("vinod@gmail.com");
		user.setMobile_No("9898989898");
		String str=home.userregistration(user);
		assertEquals("redirect:/Login",str);
	}*/
	@Before
	public void setUp() throws Exception {
	    
	    conn = Mockito.mock(Connection.class);      
	    ps = Mockito.mock(PreparedStatement.class);
	    rs = Mockito.mock(ResultSet.class);
	    jdbcTemplate = new JdbcTemplate(new SingleConnectionDataSource(conn, false));
	   
		 
		userservice = new UserServiceImpl(userdao);
		HomePageController home=new HomePageController(userservice);
	    //userdao.setJdbcTemplate(jdbcTemplate);
	}

	@Test
	public void testGetUserLIst() {
		 dataSource = new DriverManagerDataSource();
         List userList = new ArrayList();
		User user = new User();
		Date d = new Date(2014/03/01);
		user.setEquipment_Id(1002);
		user.setEquipment_Name("hello");
		user.setEquipment_Type_Name("facility");
		user.setFacility_Name("testing");
		user.setReg_No(110);
		user.setS_NO(113);
		user.setStart_Date(d);
		user.setEnd_Date(d);
		user.setDescription("ok");
		  List<String> userNames = new ArrayList<String>();
		    userNames.add("bob");
		    List<User> userList12 = new ArrayList<User>();
	String sql="";
	JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	//userdao.setJdbcTemplate(jdbcTemplate);
		//List<ModelAndView> userList=(List<ModelAndView>) home.getUserLIst();
		when(userdao.getUserList()).thenReturn(userList12);
	when(jdbcTemplate.query(sql, new UserRowMapper())).thenReturn(userList);
		List<User> userList1 = userservice.getUserList();
		
		assertEquals(userList12,userList1);
	}
}
