<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h2>Invoice Billing</h2>
	</div>
	<div>
		<p>Customer Information</p>
		<table>
			<tr>
				<td><b>Invoice Number</b><span class="important">:*</span></td>
				<td><input type="text" name="invoiceNumber"></input></td>
				<td><b>Invoice Date</b><span class="important">:*</span></td>
				<td><input type="text" name="invoiceDate"></input></td>
			</tr>
			<tr>
				<td><b>Name</b><span class="important">:*</span></td>
				<td><input type="text" name="name"></input></td>
				<td><b>Address</b><span class="important">:*</span></td>
				<td><input type="text" name="address"></input></td>
			</tr>
			<tr>
				<td><b>Vat Number</b><span class="important">:*</span></td>
				<td><input type="text" name="vatNumber"></input></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><b>Challan Number</b><span class="important">:*</span></td>
				<td><input type="text" name="challanNumber"></input></td>
				<td><b>Challan Date</b><span class="important">:*</span></td>
				<td><input type="text" name="challanDate"></input></td>
			</tr>
			<tr>
				<td><b>IND/W.O./O.O. Number</b><span class="important">:*</span></td>
				<td><input type="text" name="indNumber"></input></td>
				<td><b>IND/W.O./O.O. Date</b><span class="important">:*</span></td>
				<td><input type="text" name="indDate"></input></td>
			</tr>
		</table>
	</div>
	<br><br>
	<div>
		<p>Other Details</p>
		<table>
			<tr>
				<td><b>By Motor Transport</b><span class="important">:*</span></td>
				<td><input type="text" name="motorTransport"></input></td>
				<td><b>Despatch To</b><span class="important">:*</span></td>
				<td><input type="text" name="DespatchTo"></input></td>
			</tr>
			<tr>
				<td><b>Per R.R/M.R. Number</b><span class="important">:*</span></td>
				<td><input type="text" name="RRMRNumber"></input></td>
				<td><b>Per R.R/M.R. Date</b><span class="important">:*</span></td>
				<td><input type="text" name="RRMRNumber"></input></td>
			</tr>
			<tr>
				<td><b>B.L. Number</b><span class="important">:*</span></td>
				<td><input type="text" name="BLNumber"></input></td>
				<td><b>B.L. Number Date</b><span class="important">:*</span></td>
				<td><input type="text" name="BLNumberDate"></input></td>
			</tr>
			<tr>
				<td><b>Document Through Bank</b><span class="important">:*</span></td>
				<td><input type="text" name="documentThroughBank"></input></td>
				<td></td>
				<td></td>
			</tr>
		</table>
	</div>
</body>
</html>