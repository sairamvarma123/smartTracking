<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Equipment Registration</title>
<style>
body {
	font-size: 20px;
	color: teal;
	font-family: Calibri;
}
div.ex {
	text-align: right width:100px;
	padding: 0px;
	border: 2px solid silver;
	top-margin: 50px
}
td {
	font-size: 15px;
	color: black;
	width: 100px;
	height: 22px;
	text-align:center;
	padding:10px;
}
.heading {
	font-size: 18px;
	color: white;
	font: bold;
	background-color: teal;
	border: thick;
}
div.tl {

	text-align:left ;
	padding: 10px;
	border: 2px solid silver;
	margin: 0px;
	background-color: teal;
    color:white;
}

</style>
</head>
<body>
<div class="ex">
<div class="tl">
		 <b>Equipment Registration </b>
			</div><br>
			<div>
			<center>
			
		<table border="1">
			<tr>
				<td class="heading">S_NO</td>
				<td class="heading">Equipment_Name</td>
				<td class="heading">Description </td>
				<td class="heading">Reg_No</td>
				<td class="heading">Generate</td>
			</tr>
			 
			<c:forEach var="user" items="${userList}">
			
				<tr>
					<td>${user.s_NO}</td>
				    <td>${user.equipment_Name}</td>
					<td>${user.description}</td>
					<td>${user.reg_No}</td>
					<td> <INPUT TYPE="BUTTON" VALUE="Qrcode"  ></td>
					</tr></c:forEach></table>
		<a href="register">Click Here Add New
								Equpiment </a>
	
</div>
	</center>
	</div>
</body>
</html>