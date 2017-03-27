<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
 <script src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script> 
<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/datatables/1.10.13/css/jquery.dataTables.min.css" />
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/dataTables.bootstrap.min.css" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" 
 integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<title>Equipment Registration</title>
 <style>
.body { 
  background: url(http://www.istartedsomething.com/bingimages/cache/AKHumpbacks_EN-AU1914968143.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}

.panel-default {
opacity: 0.9;
margin-top:30px;
}
.form-group.last { margin-bottom:0px; }
.btncolour{
color: white;
background-color: teal;
border-color: #4cae4c;
align:center;
width:80px;
}
div.tl {
background-color: teal;
	padding: 5px;
	border: 20px white;
	margin: 0px;
	 color:white;
	

}
</style>
</head>
<body>
 <div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-default">
                <div class="tl">
                    <span class="glyphicon glyphicon-lock"></span> Registration</div>
                <div class="panel-body">
                    <form class="form-horizontal" role="form">
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-3 control-label">
                            User Name</label>
                        <div class="col-sm-7">
                            <input type="email" class="form-control" id="inputEmail3" placeholder="Email" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-3 control-label">
                            Email Id</label>
                        <div class="col-sm-7">
                            <input type="password" class="form-control" id="inputPassword3" placeholder="Password" required>
                        </div>
                    </div>
                     <div class="form-group">
                        <label for="inputPassword3" class="col-sm-3 control-label">
                            Password</label>
                        <div class="col-sm-7">
                            <input type="password" class="form-control" id="inputPassword3" placeholder="Password" required>
                        </div>
                    </div>
                     <div class="form-group">
                        <label for="inputPassword3" class="col-sm-3 control-label">
                            Mobile No</label>
                        <div class="col-sm-7">
                            <input type="password" class="form-control" id="inputPassword3" placeholder="Password" required>
                        </div>
                    </div>
                   
                    <div class="form-group last">
                        <div class="col-sm-offset-4 col-sm-9">
                            <button type="submit" class="btncolour">
                                Submit</button>
                                
                        </div>
                    </div>
                    </form>
                </div>
                
        </div>
    </div>
</div>
</body>
</html>