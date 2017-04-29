<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<link rel="icon" type="image/png" href="image/favicon.ico" />

<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>
<link type="text/css" rel="stylesheet" href="css/notification.css"/>
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
  <s:if test="hasActionMessages()">
	   <div class="welcome">
	      <s:actionmessage/>
	   </div>
	</s:if>
  <div class="panel-body">
   <s:form action="registerAction" method="post" theme="simple">
   <!-- <div class="alert alert-danger">
                <a class="close" data-dismiss="alert" href="#">×</a>Incorrect Username or Password!
            </div> -->
            <div class="row">
    			<div class="col-xs-12 col-sm-4 col-md-4">
					<div class="form-group">
					<s:textfield cssClass="form-control" name="userBean.firstName" placeholder="First Name" autocomplete="off" required="true" autofocus="true" />
					</div>
				</div>
                <div class="col-xs-12 col-sm-4 col-md-4">
    				<div class="form-group">
    				<s:textfield cssClass="form-control" name="userBean.middleName" placeholder="Middle Name" autocomplete="off" required="true" autofocus="true"/>
					</div>
				</div>
				<div class="col-xs-12 col-sm-4 col-md-4">
					<div class="form-group">
					<s:textfield cssClass="form-control" name="userBean.lastName" placeholder="Last Name" autocomplete="off" required="true" autofocus="true" />
					</div>
				</div>
			</div>
			<div class="form-group">
					<s:textfield cssClass="form-control" name="userBean.emailId" placeholder="Email Address" autocomplete="off" required="true" autofocus="true" />
			</div>
			<s:fielderror fieldName="userNameTaken" cssClass="errors"></s:fielderror>
			<div class="form-group">
					<s:textfield cssClass="form-control" name="userBean.userName" placeholder="User Name" autocomplete="off" required="true" autofocus="true" />
			</div>
			<div class="row">
			<s:fielderror fieldName="passwordMatch" cssClass="errors"></s:fielderror>
				<div class="col-xs-12 col-sm-6 col-md-6">
					<div class="form-group">
					<s:password cssClass="form-control" name="userBean.password" placeholder="Password" autocomplete="off" required="true" autofocus="true" />
					</div>
				</div>
				
				<div class="col-xs-12 col-sm-6 col-md-6">
					<div class="form-group">
					<s:password cssClass="form-control" name="userBean.passwordConfirm" placeholder="Confirm Password" autocomplete="off" required="true" autofocus="true" />
					</div>
				</div>
			</div>
                                    
  <s:submit  cssClass="btn btn-lg btn-default btn-block" value="Sign Up"></s:submit>
  
  <hr style="margin-top:10px;margin-bottom:10px;" >
  
   <div class="form-group">
          <s:url action="" var="aURL" />
		<p class="text-center"><s:a cssClass="" href="%{aURL}">Have an Account?</s:a></p>
  </div>  
</s:form>
  </div>
</div>
</div>
</div>

</body>
</html>