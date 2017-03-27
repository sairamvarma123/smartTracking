 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

 <script src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script> 
<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>


<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/datatables/1.10.13/css/jquery.dataTables.min.css" />
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/dataTables.bootstrap.min.css" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" 
 integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<html>
<head>
<title>Equipment Registration</title>
<style>
body {
 font-size: 20px;
 color:DarkSlateBlue  ;
 font-family: Calibri;
}
div.ex {
 text-align: center;
 padding: 0px;
 border: 0px solid silver;
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
 font-size: 15px;
 color: white;
 font: bold;
 background-color: LightCoral ;
 border: thick;
}
div.tl {

    text-align: center ; 
 padding: 1px;
 border: 20px white;
 margin: 0px;
 background-color: BlanchedAlmond ;
    color:white;
}

.obj { 

 width: 53%; 

 /*padding: 0px; 

  height:auto; 

 line-height: 6px; */

}
.btncolour{
color: white;
background-color: teal;
border-color: #4cae4c;
align:center;
width:80px;
}
</style>

<script>
$(document).ready(function () {
 
 $('#example').dataTable({
  "bInfo" : false,
  "iDisplayLength": 5,
  "aLengthMenu": [[5,10, 25, 50, 100], [5,10, 25, 50, 100]],
  
  
  'aoColumns': [
            {},
            {},
            {},
            { },
            {},
           
      ]
  
});
})

/* var filteredData = table
    .column( 0 )
    .data()
    .filter( function ( value, index ) {
        return value > 20 ? true : false;
    } ); */
</script>
 <script>
  function newQR(user) {
   alert(user);
    
    document.getElementById('qrcode').src = "https://api.qrserver.com/v1/create-qr-code/?size=150x150&data=" + user
  }
 
</script>
</head>
<body>
<div class="ex">
<div class="tl">
 <div class="container">
 
 <a href="#" class="navbar-brand"> </a> <button class="navbar-toggle"
      data-toggle="collapse" data-target=".navHeaderCollapse"></button>

      <div class="collapse navbar-collapse navHeaderCollapse">
        <ul class="nav navbar-nav navbar-right">
          <li class="active"><a href="#">Admin</a></li>

          <li><a href="#">Master</a>
          </li>
 <li class=""><a href="Login">Logout</a></li>
           </ul>
      </div>
    </div>
  </div>
  <br>
    
  
  <b>EQUIPMENT REGISTRATION </b> 
   </div><br>
   <div>
   <div class="container" align="right" > 
     <a href="register">Add</a></div>
   <center>
   
   <div class = "table-responsive table-bordered obj" style="background-color:#FFF0F5">
    <table id="example" class="table datatable display table-bordered table-stripped table-responsive"  border="1" width="50" cellspacing="0">
  <thead>
   <tr>
    <th class="heading">S_NO</th>
    <th class="heading">Equipment_Name</th>
    <th class="heading">Description </th>
    <th class="heading">Reg_No</th>
    <th class="heading">Generate</th>
   </tr>
    </thead>
    <tbody>
   <c:forEach var="user" items="${userList}">
   
    <tr>
     <td>${user.s_NO}</td> 
        <td>${user.equipment_Name}</td>
     <td>${user.description}</td>
     <td>${user.reg_No}</td>
     <td> <button onclick="newQR('${user.equipment_Name}')" class="btn btn-success" data-toggle="modal" data-target="#myModal">QRcode</button>
     </td>
     </tr>
     </c:forEach>
     </tbody></table>
     </div>
     <br/>
      </center>
 <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h4 class="modal-title" id="myModalLabel">QR Code</h4>
      </div>
      <div class="modal-body">
       <img id='qrcode' src='' class="center-block">
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        
      </div>
      
    </div>
  </div>
</div>
</div>
</div>
</body>
</html>