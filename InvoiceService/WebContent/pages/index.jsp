<%@ taglib prefix="s" uri="/struts-tags" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>


<%-- <link type="text/css" rel="stylesheet" href="css/login.css"/>
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>
<link type="text/css" rel="stylesheet" href="css/notification.css"/>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-1.11.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/scripts.min.js"></script> --%>

</head>
<body>
<s:url var="fileDownload" action="downloadInvoice" ></s:url>
<s:a cssClass="" href="%{fileDownload}">download</s:a>

<div class="container">
    <div class="row">
        <div class="col-md-5  col-md-offset-3">
            <div class="account-wall">
                <div id="my-tab-content" class="tab-content">
						<div class="tab-pane active" id="login">
               		    <img class="profile-img" src="image/photo.jpg?sz=120"
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
               				<s:password cssClass="form-control" name="userBean.password" placeholder="Password"  required="true" />
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
