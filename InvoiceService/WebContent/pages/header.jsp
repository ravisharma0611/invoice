<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Header</title>
<link rel="shortcut icon" href="https://cdn3.iconfinder.com/data/icons/linecons-free-vector-icons-pack/32/fire-16.png" type="image/x-icon" />
<%-- <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-1.11.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/scripts.min.js"></script> --%>
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
     <s:url action="dashboard" var="dashURL" />  <s:a cssClass="navbar-brand" href="%{dashURL}">Invoice Service</s:a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      <!-- class="active" -->
        <li><s:url action="invoiceHome" var="aURL" /><s:a href="%{aURL}">Create <span class="sr-only">(current)</span></s:a></li>
        <li><s:url action="invoiceSearch" var="sURL" /><s:a href="%{sURL}">Search</s:a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <!-- <button type="submit" class="btn btn-link navbar-btn navbar-link"> Log off </button> -->
        <s:url action="logout" var="outURL" /> 
        <li><s:a href="%{outURL}">Log off</s:a></li>
        <li>&nbsp;&nbsp;&nbsp;</li>
        <li><p class="navbar-text ">Signed in as <a href="#" class="navbar-link"><s:property value='%{#session.SESSION_DATA.firstName}'/> </a></p>  </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
</body>
</html>