<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="../css/bootstrap-theme.min.css">
<link rel="stylesheet" type="text/css" href="../css/bootstrap-dialog.min.css">
<link rel="stylesheet" type="text/css" href="../css/validationEngine.jquery.css">


<script src="../js/jquery.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/bootstrap-dialog.min.js"></script>
<script src="../js/jquery.validationEngine-en.js"></script>
<script src="../js/jquery.validationEngine.js"></script>
<script src="../js/itemDetails.js"></script>
<style type="text/css">

input[type="text"]{
border:none;
background:transparent;
}

</style>
<title>Item Details</title>
</head>
<body>
<br>
<br>
<br>
<form id="globalFormId">
<div class="container">
	<table class="table table-bordered" id="itemDetailId">
	<tr>
		<th>#</th>
		<th>Product</th>
		<th>Price</th>
		<th>Quantity</th>
		<th>Per</th>
		<th>Total</th>
		<th>Action</th>
		<th><a href="javascript:void(0)" onclick="addRow()">Add</a></th>
	</tr>
</table>
<a href="javascript:void(0)" onclick="submitForm()" class="btn btn-primary pull-right">Submit</a>
</div>

</form>

</body>
</html>