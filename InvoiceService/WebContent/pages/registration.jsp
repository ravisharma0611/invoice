<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-1.11.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/scripts.min.js"></script>

</head>
<body>
<%-- <%@include file="header.jsp" %> --%>
<div class="container" style="margin-top:30px">
<div class="col-md-10 col-md-offset-1">
    <div class="panel panel-default">
  <div class="panel-heading"><h3 class="panel-title"><strong>Register </strong></h3>
      <!-- <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#">Forgot password?</a></div> -->
  </div>
  
  <div class="panel-body">
   <form  method="post">
   <!-- <div class="alert alert-danger">
                <a class="close" data-dismiss="alert" href="#">×</a>Incorrect Username or Password!
            </div> -->
            <div class="row">
    			<div class="col-xs-12 col-sm-4 col-md-4">
					<div class="form-group">
					<s:textfield cssClass="form-control" name="registerUserBean.firstName" placeholder="First Name" autocomplete="off" required="true" autofocus="true" tabindex="1"/>
                       <!--  <input type="text" name="first_name" id="first_name" class="form-control" placeholder="First Name" tabindex="1"> -->
					</div>
				</div>
                <div class="col-xs-12 col-sm-4 col-md-4">
    				<div class="form-group">
    				<s:textfield cssClass="form-control" name="registerUserBean.middleName" placeholder="Middle Name" autocomplete="off" required="true" autofocus="true" tabindex="1"/>
                        <!-- <input type="text" name="middle_name" id="middle_name" class="form-control" placeholder="Middle Name" tabindex="1"> -->
					</div>
				</div>
				<div class="col-xs-12 col-sm-4 col-md-4">
					<div class="form-group">
					<s:textfield cssClass="form-control" name="registerUserBean.lastName" placeholder="Last Name" autocomplete="off" required="true" autofocus="true" tabindex="2"/>
						<!-- <input type="text" name="last_name" id="last_name" class="form-control " placeholder="Last Name" tabindex="2"> -->
					</div>
				</div>
			</div>
			<div class="form-group">
					<s:textfield cssClass="form-control" name="registerUserBean.emailId" placeholder="Email Address" autocomplete="off" required="true" autofocus="true" tabindex="3"/>
				<!-- <input type="text" name="display_name" id="display_name" class="form-control " placeholder="Display Name" tabindex="3"> -->
			</div>
			<div class="form-group">
					<s:textfield cssClass="form-control" name="registerUserBean.userName" placeholder="User Name" autocomplete="off" required="true" autofocus="true" tabindex="4"/>
				<!-- <input type="email" name="email" id="email" class="form-control " placeholder="Email Address" tabindex="4"> -->
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-6 col-md-6">
					<div class="form-group">
					<s:textfield cssClass="form-control" name="registerUserBean.password" placeholder="Password" autocomplete="off" required="true" autofocus="true" tabindex="5"/>
						<!-- <input type="password" name="password" id="password" class="form-control " placeholder="Password" tabindex="5"> -->
					</div>
				</div>
				<div class="col-xs-12 col-sm-6 col-md-6">
					<div class="form-group">
					<s:textfield cssClass="form-control" name="registerUserBean.password" placeholder="Confirm Password" autocomplete="off" required="true" autofocus="true" tabindex="6"/>
						<!-- <input type="password" name="password_confirmation" id="password_confirmation" class="form-control " placeholder="Confirm Password" tabindex="6"> -->
					</div>
				</div>
			</div>
                                    
  <s:submit action="register" cssClass="btn btn-lg btn-default btn-block" value="Sign Up"></s:submit>
  
  <hr style="margin-top:10px;margin-bottom:10px;" >
  
   <div class="form-group">
          <s:url action="" var="aURL" />
		<p class="text-center"><s:a cssClass="" href="%{aURL}">Have an Account?</s:a></p>
  </div>  
</form>
  </div>
</div>
</div>
</div>

</body>
</html>