<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
<title>Invoice Service</title>
<tiles:insertAttribute name="script" />
<link rel="icon" type="image/png" href="image/favicon.ico" />
</head>
<body>
<div id="wrapper">
	<%-- <tiles:insertAttribute name="script" /> --%>

	<tiles:insertAttribute name="header" />
	<br>
	<br>

	<tiles:insertAttribute name="body" />

	<tiles:insertAttribute name="footer" />
</div>
</body>
</html>