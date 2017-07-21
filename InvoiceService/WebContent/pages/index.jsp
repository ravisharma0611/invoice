<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>


</head>
<body background="image/invoiceServiceLogin.jpg">


<div class="container">
    <div class="row">
        <div class="col-md-4  col-md-offset-4">
            <div class="account-wall">
                <div id="my-tab-content" class="tab-content">
						<div class="tab-pane active" id="login">
               		    <img class="profile-img" src="image/avatar_2x.png"
                    alt="">
                    <s:if test="hasActionErrors()">
					   <div class="errors">
					      <s:actionerror/>
					   </div>
					</s:if>
					<s:if test="hasActionMessages()">
					   <div class="welcome">
					      <s:actionmessage/>
					   </div>
					</s:if>
               			<form class="form-signin" action="login" method="post">
               				<s:fielderror fieldName="userName" />
               				<s:textfield cssClass="form-control" name="userBean.userName" placeholder="Username" autocomplete="off" required="true" autofocus="true"/>
               				<s:fielderror fieldName="password" />
               				<br>
               				<s:password cssClass="form-control" name="userBean.password" placeholder="Password"  required="true" autocomplete="off"/>
               				<br>
               				<s:submit cssClass="btn btn-lg btn-default btn-block" value="Sign In"></s:submit>
               			</form>
               				<div id="tabs" data-tabs="tabs">
		               			<s:url action="register" var="aURL" />
								<p class="text-center">Don't have an account! <s:a cssClass="" href="%{aURL}">Sign Up Here</s:a></p>
              				</div>
						</div>
						
					</div>
            </div>
        </div>
    </div>
</div>
</body>
</html>