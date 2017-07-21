<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>
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

table tbody tr td input[type='text']{
width:150px;
}

</style>
<title>Item Details</title>
</head>
<body>
<br>
<br>
<br>

<s:form id="globalFormId" theme="simple">
<div class="container">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading" style="background:#486684">
                            <div style="color: #fff">Add Item Detail</div>
                        </div>
                        
                        <div class="panel-body tableAdd">
                        	  <table class="table table-striped table-bordered table-hover" id="itemDetailId">
                                <thead style="background:#5b80a4;color:#fff">
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
                                </thead>
                                <tbody></tbody>
                            </table>
                        
                           <a href="javascript:void(0)" onclick="submitForm()" class="btn btn-primary pull-right">Submit</a>
                        </div>
                    </div>
                    
                </div>
                
    </div>

</s:form>


<%-- <s:form id="globalFormId" theme="simple">
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

</s:form>
 --%>
 <br>
</body>
</html>