<html>

<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body { 
  background: url(http://www.istartedsomething.com/bingimages/cache/AKHumpbacks_EN-AU1914968143.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}

.panel-default {
opacity: 0.9;
margin-top:110px;
width:500px;
}
.form-group.last { margin-bottom:0px; }

div.tl {
background-color: teal;
 padding: 5px;
 border: 20px white;
 margin: 0px;
  color:white;
 }
</style>
<body>
  <div class="col-md-3 col-md-offset-4">
            <div class="panel panel-default" >
                 <div class="tl">
                    <span class="glyphicon glyphicon-lock"></span> Login</div>
                <div class="panel-body">
                   <form method="post" class = "table-responsive" action='/SmartTrack/LoginCheck' modelAttribute="user" name="frm">
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-3 control-label">
                            Email</label>
                        <div class="col-sm-9">
                            <input type="email" class="form-control" id="inputEmail3" name="Email_Id" placeholder="Email" required="">
                        </div>
                    </div>
                    
                    <div class="form-group"><br><br>
                        <label for="inputPassword3" class="col-sm-3 control-label">
                            Password </label>
                        <div class="col-sm-9">
                            <input type="password" class="form-control" id="inputPassword3" name="password" placeholder="Password" required="">
                        </div>
                    </div>
                  
                    <div class="form-group last">
                        <div class="col-sm-offset-3 col-sm-6"><br>
                        <center>   <button type="submit" class="btn btn-success btn-sm" style="background-color:teal;">
                                Sign in</button></center>         
                        </div>
                    </div>
                    </form>
                </div>
                <div class="panel-footer" >
                    Not Registred? <a href="Registration">Register here</a></div>
            </div>
        </div>
</body>
</html>