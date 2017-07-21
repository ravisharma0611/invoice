<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details</title>
</head>
<body>

<s:form theme="simple" id="custDetailFormId">
<div class="container">
                
                        <div class="panel panel-default">
						 <div class="panel-heading" style="background:#486684">
                            <div style="color: #fff">Invoice Billing</div>
                        </div>
						
						<br>
                        <div class="panel-heading" style="background:#486684">
                            <div style="color: #fff">Customer Information</div>
                        </div>
                        
                        <div class="panel-body">
						<table class="table table-bordered table-striped table-highlight table-hover">
						<tr>
							<td><b>Invoice Number</b><span class="important">*</span></td>
							<td><s:textfield id="invoicTestId" cssClass="form-control validate[required,custom[numberOnly]]" name="customerDetailBean.invoiceNo" autocomplete="off" />
								<s:fielderror cssClass="errorClass"><s:param value="invoiceNumberError"></s:param></s:fielderror>
							</td>
							<td><b>Invoice Date</b></td>
							<td><s:textfield cssClass="form-control" id="datepicker" name="customerDetailBean.invoiceDate" autocomplete="off"  readonly="true"/></td>
						</tr>
						<tr>
							<td><b>Name</b></td>
							<td><s:textfield cssClass="form-control" name="customerDetailBean.billedName" autocomplete="off"  maxlength="75"/></td>
							<td><b>Address</b></td>
							<td><s:textfield cssClass="form-control" name="customerDetailBean.billedAddress" autocomplete="off"  maxlength="75"/></td>
						</tr>
						<tr>
							<td><b>Vat Number</b></td>
							<td><s:textfield cssClass="form-control" name="customerDetailBean.vatNo" autocomplete="off"  maxlength="75"/></td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td><b>Challan Number</b></td>
							<td><s:textfield cssClass="form-control" name="customerDetailBean.challanNo" autocomplete="off"  maxlength="75"/></td>
							<td><b>Challan Date</b></td>
							<td><s:textfield cssClass="form-control" name="customerDetailBean.challanNoDate" id="challanDate" autocomplete="off"  readonly="true"/></td>
						</tr>
						<tr>
							<td><b>IND/W.O./O.O. Number</b></td>
							<td><s:textfield cssClass="form-control" name="customerDetailBean.poNo" autocomplete="off"  maxlength="75"/></td>
							<td><b>IND/W.O./O.O. Date</b></td>
							<td><s:textfield cssClass="form-control" name="customerDetailBean.poNoDate" autocomplete="off"  id="indDate" readonly="true"/></td>
						</tr>
					</table>
                           
                        </div>
                       
                    </div>
					
					<br>
					
					<div class="panel panel-default">
                        <div class="panel-heading" style="background:#486684">
                            <div style="color: #fff">Other Details</div>
                        </div>
                        
                        <div class="panel-body">
						<table class="table table-bordered table-striped table-highlight table-hover" >
						<tr>
							<td><b>By Motor Transport</b></td>
							<td><s:textfield cssClass="form-control" name="dispatchDetailBean.byMotorTransport" autocomplete="off"  maxlength="75" /></td>
							<td><b>Despatch To</b></td>
							<td><s:textfield cssClass="form-control" name="dispatchDetailBean.despatchTo" autocomplete="off"  maxlength="75"/></td>
						</tr>
						<tr>
							<td><b>Per R.R/M.R. Number</b></td>
							<td><s:textfield cssClass="form-control" name="dispatchDetailBean.perRrMmNumber" autocomplete="off"  maxlength="75"/></td>
							<td><b>Per R.R/M.R. Date</b></td>
							<td><s:textfield cssClass="form-control" name="dispatchDetailBean.perRrMmNumberDate" autocomplete="off"  id="rrDate" readonly="true"/></td>
						</tr>
						<tr>
							<td><b>B.L. Number</b></td>
							<td><s:textfield cssClass="form-control" name="dispatchDetailBean.blNumber" autocomplete="off"  maxlength="75"/></td>
							<td><b>B.L. Number Date</b></td>
							<td><s:textfield cssClass="form-control" name="dispatchDetailBean.blNumberDate" id="blDate" autocomplete="off"  readonly="true"/></td>
						</tr>
						<tr>
							<td><b>Document Through Bank</b></td>
							<td><s:textfield cssClass="form-control" name="dispatchDetailBean.documentThruBank" autocomplete="off"  maxlength="75"/></td>
							<td></td>
							<td></td>
						</tr>
					</table>
                           
                        </div>
                       
                    </div>
					
					<br>
					
					<div class="panel panel-default">
                        <div class="panel-heading" style="background:#486684">
                            <div style="color: #fff">Additional Charges</div>
                        </div>
                        
                        <div class="panel-body">
						<table class="table table-bordered table-striped table-highlight table-hover" >
						<tr>
							<td><b>Courier Charge:</b></td>
							<td><s:textfield cssClass="form-control validate[custom[decimalNumberOnly]]" 
							name="customerDetailBean.courierCharge" autocomplete="off"  /></td>
							
							<td><b>LBT %:</b></td>
							<td><s:textfield cssClass="form-control validate[custom[decimalNumberOnly]]" 
							name="customerDetailBean.lbtPercent" autocomplete="off"  /></td>
						</tr>
						<tr>
							<td><b>VAT %:</b></td>
							<td><s:textfield cssClass="form-control validate[custom[decimalNumberOnly]]" name="customerDetailBean.vatPercent" autocomplete="off"  /></td>
							<td><b>Service Tax %:</b></td>
							<td><s:textfield cssClass="form-control validate[custom[decimalNumberOnly]]" name="customerDetailBean.serviceTaxPercent" autocomplete="off"  /></td>
						</tr>
					</table>
                           
                        </div>
                       
                    </div>
                    
               
                
    </div>
	
	<div class="container">
								<div class="col-xs-12 col-sm-6 col-md-6">
									<div class="form-group">
										<s:reset cssClass="btn btn-danger btn-block" value="Reset"></s:reset>
									</div>
								</div>
								<div class="col-xs-12 col-sm-6 col-md-6">
									<div class="form-group">
										<s:submit action="#" cssClass="btn btn-success btn-block" value="Next" onclick="submitCustDetails()"></s:submit>
									</div>
								</div>
							</div>
</s:form>
</body>
</html>