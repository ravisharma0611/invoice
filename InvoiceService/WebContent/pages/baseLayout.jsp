<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Invoice Service</title>
<link rel="icon" type="image/png" href="image/favicon.ico" />
</head>
<body>
<div id="wrapper">
	<tiles:insertAttribute name="script" />

	<tiles:insertAttribute name="header" />
<br/>
	<tiles:insertAttribute name="body" />

	<tiles:insertAttribute name="footer" />
</div>
</body>
</html>