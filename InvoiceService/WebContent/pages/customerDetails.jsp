<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
<!-- style="margin-top: 30px" -->
	<div class="container" >
		<div class="col-md-20 col-md-offset-0" >
			<div class="panel panel-default" >
				<div class="panel-heading">
					<h3 class="panel-title">
						<strong>Invoice Billing</strong>
					</h3>
				</div>
<!--   <div class="panel-body"> -->
				<!-- <div class="table-responsive" style="width: auto;"> -->

<s:form action="submitInvoiceActionName" method="post" theme="simple">
					<div class="panel-heading">	
					<h4 class="panel-title">
						<strong>Customer Information</strong>
					</h4>
					</div><!-- table table-bordered table-striped table-highlight table-hover -->
					<table class="table table-bordered table-striped table-highlight table-hover" >
						<tr>
							<td><b>Invoice Number</b><span class="important">:*</span></td>
							<td><s:textfield cssClass="form-control" name="customerDetailBean.invoiceNo" autocomplete="off" required="true" /></td>
							<td><b>Invoice Date</b><span class="important">:*</span></td>
							<td><s:textfield cssClass="form-control" id="datepicker" name="customerDetailBean.invoiceDate" autocomplete="off" required="true" /></td>
						</tr>
						<tr>
							<td><b>Name</b><span class="important">:*</span></td>
							<td><s:textfield cssClass="form-control" name="customerDetailBean.billedName" autocomplete="off" required="true" /></td>
							<td><b>Address</b><span class="important">:*</span></td>
							<td><s:textfield cssClass="form-control" name="customerDetailBean.billedAddress" autocomplete="off" required="true" /></td>
						</tr>
						<tr>
							<td><b>Vat Number</b><span class="important">:*</span></td>
							<td><s:textfield cssClass="form-control" name="customerDetailBean.vatNo" autocomplete="off" required="true" /></td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td><b>Challan Number</b><span class="important">:*</span></td>
							<td><s:textfield cssClass="form-control" name="customerDetailBean.challanNo" autocomplete="off" required="true" /></td>
							<td><b>Challan Date</b><span class="important">:*</span></td>
							<td><s:textfield cssClass="form-control" name="customerDetailBean.challanNoDate" autocomplete="off" required="true" /></td>
						</tr>
						<tr>
							<td><b>IND/W.O./O.O. Number</b><span class="important">:*</span></td>
							<td><s:textfield cssClass="form-control" name="customerDetailBean.poNo" autocomplete="off" required="true" /></td>
							<td><b>IND/W.O./O.O. Date</b><span class="important">:*</span></td>
							<td><s:textfield cssClass="form-control" name="customerDetailBean.poNoDate" autocomplete="off" required="true" /></td>
						</tr>
					</table>

					<div class="panel-heading">	
					<h4 class="panel-title">
						<strong>Other Details</strong>
					</h4>
					</div>
					<table class="table table-bordered table-striped table-highlight table-hover" >
						<tr>
							<td><b>By Motor Transport</b><span class="important">:*</span></td>
							<td><s:textfield cssClass="form-control" name="dispatchDetailBean.byMotorTransport" autocomplete="off" required="true" /></td>
							<td><b>Despatch To</b><span class="important">:*</span></td>
							<td><s:textfield cssClass="form-control" name="dispatchDetailBean.despatchTo" autocomplete="off" required="true" /></td>
						</tr>
						<tr>
							<td><b>Per R.R/M.R. Number</b><span class="important">:*</span></td>
							<td><s:textfield cssClass="form-control" name="dispatchDetailBean.perRrMmNumber" autocomplete="off" required="true" /></td>
							<td><b>Per R.R/M.R. Date</b><span class="important">:*</span></td>
							<td><s:textfield cssClass="form-control" name="dispatchDetailBean.perRrMmNumberDate" autocomplete="off" required="true" /></td>
						</tr>
						<tr>
							<td><b>B.L. Number</b><span class="important">:*</span></td>
							<td><s:textfield cssClass="form-control" name="dispatchDetailBean.blNumber" autocomplete="off" required="true" /></td>
							<td><b>B.L. Number Date</b><span class="important">:*</span></td>
							<td><s:textfield cssClass="form-control" name="dispatchDetailBean.blNumberDate" autocomplete="off" required="true" /></td>
						</tr>
						<tr>
							<td><b>Document Through Bank</b><span class="important">:*</span></td>
							<td><s:textfield cssClass="form-control" name="dispatchDetailBean.documentThruBank" autocomplete="off" required="true" /></td>
							<td></td>
							<td></td>
						</tr>
					</table>
							<div class="row">
								<div class="col-xs-12 col-sm-6 col-md-6">
									<div class="form-group">
										<s:reset cssClass="btn btn-danger btn-block" value="Reset"></s:reset>
									</div>
								</div>
								<div class="col-xs-12 col-sm-6 col-md-6">
									<div class="form-group">
										<s:submit action="#" cssClass="btn btn-success btn-block" value="Next"></s:submit>
									</div>
								</div>
							</div>
							
				</s:form>
				<!-- </div> -->
			<!-- </div> -->
		</div>
	</div>
	</div>
</body>
</html>