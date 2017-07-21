<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:url action="invoiceHome" var="aURL" />
<s:url action="invoiceSearch" var="sURL" />
		<div id="page-inner">
			<!-- <div class="row">
				<div class="col-lg-12">
					<h2>ADMIN DASHBOARD</h2>
				</div>
			</div> -->
			<!-- /. ROW  -->
			<div class="row">
				<div class="col-lg-12 ">
					<div class="alert alert-info">
						<strong>Welcome <s:property value='%{#session.SESSION_DATA.firstName}'/> ! </strong> <!-- You Have No pending Task For
						Today. -->
					</div>

				</div>
			</div>
			<!-- /. ROW  -->
			<div class="row text-center pad-top">
				<div class="col-sm-4">
					<div class="div-square">
						<s:a href="%{aURL}"> <i class="fa fa-lightbulb-o fa-5x"></i>
							<h4>New Invoice</h4>
						</s:a>
					</div>


				</div>
				<div class="col-sm-4">
					<div class="div-square">
						<s:a href="%{sURL}"> <i class="fa fa-circle-o-notch fa-5x"></i>
							<h4>Search Invoice</h4>
						</s:a>
					</div>


				</div>
				
				<div class="col-sm-4">
					<div class="div-square">
						<a href="https://mail.google.com" target="_blank"> <i class="fa fa-envelope-o fa-5x"></i>
							<h4>Mail Box</h4>
						</a>
					</div>


				</div>
				
	
			</div>
			
		</div>
</body>
</html>