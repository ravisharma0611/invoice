<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
<style>
#searchIndexTableId tbody tr td input[type='text']{
width:170px;
}

</style>

</head>
<body>
<br>
<br>
<form id="searchParentId">


<div class="container">
	<table class="table" id="searchIndexTableId">
	<tr>
		<td><b>Invoice No:</b>&nbsp;&nbsp; <input type="text" id="invoiceId"></input></td>
		<td><b>Date:</b>&nbsp;&nbsp; <input type="text" id="dateId"></input></td>
		<td><a href="javascript:void(0)" onclick="searchForm()" class="btn btn-primary">Search</a></td>
	</tr>
</table>



<div class="row initClassParent" id="custDetailDivId">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading" style="background:#486684">
                            <div style="color: #fff">Customer Detail</div>
                        </div>
                        
                        <div class="panel-body">
                        <div style="overflow-x:scroll">
                        	  <table class="table table-striped table-bordered table-hover" id="custDetailId">
                                <thead style="background:#486684;color:#fff">
                         <tr>
                         <th>Invoice_No</th>
						<th>Invoice_Date</th>
						<th>Name</th>
						<th>Address</th>
						<th>VAT NO</th>
						<th>CHALLAN NO</th>
						<th>CHALLAN_DATE</th>
						<th>PO NO</th>
						<th>PO_DATE</th>
						<th>LBT</th>
						<th>VAT</th>
						<th>SERVICE TAX</th>
						<th>GRAND TOTAL</th>
						<th>Download</th>
                                    </tr>
                                </thead>
                                <tbody></tbody>
                            </table>
                        
                        </div>
                           
                        </div>
                       
                    </div>
                    
                </div>
                
    </div>
    

<div class="row initClass" id="itemSearchDetailDivId">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading" style="background:#486684">
                            <div style="color: #fff">Item Detail</div>
                        </div>
                        
                        <div class="panel-body">
                        <!-- <div style="overflow-x:scroll"> -->
                        	  <table class="table table-striped table-bordered table-hover" id="itemSearchDetailId">
                                <thead style="background:#486684;color:#fff">
                         <tr>
                        <th>Invoice_No</th>
		<th>PARTICULARS_OF_PRODUCT</th>
		<th>QUANTITY</th>
		<th>RATE</th>
		<th>PER</th>
		<th>AMOUNT</th>
                                    </tr>
                                </thead>
                                <tbody></tbody>
                            </table>
                        
                       <!--  </div> -->
                           
                        </div>
                       
                    </div>
                    
                </div>
                
    </div>


<!-- <table class="table table-bordered initClass" id="itemSearchDetailId">
	<tr>
		<th>Invoice_No</th>
		<th>PARTICULARS_OF_PRODUCT</th>
		<th>QUANTITY</th>
		<th>RATE</th>
		<th>PER</th>
		<th>AMOUNT</th>
	</tr>
</table> -->


<div class="row initClass" id="otherDetailDivId">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading" style="background:#486684">
                            <div style="color: #fff">Other Detail</div>
                        </div>
                        
                        <div class="panel-body">
                        <!-- <div style="overflow-x:scroll"> -->
                        	  <table class="table table-striped table-bordered table-hover" id="otherDetailId">
                                <thead style="background:#486684;color:#fff">
                         <tr>
       <th>Invoice No</th>
		<th>PER_RR_MM_NO</th>
		<th>PER_RR_MM_NO_DATE</th>
		<th>BL_NO</th>
		<th>BL_NO_DATE</th>
		<th>DOCUMENT_THRU_BANK</th>
		<th>BY_MOTOR_TRANSPORT</th>
                                    </tr>
                                </thead>
                                <tbody></tbody>
                            </table>
                        
                       <!--  </div> -->
                           
                        </div>
                       
                    </div>
                    
                </div>
                
    </div>


<!-- <table class="table table-bordered initClass" id="otherDetailId">
	<tr>
		<th>Invoice No</th>
		<th>PER_RR_MM_NO</th>
		<th>PER_RR_MM_NO_DATE</th>
		<th>BL_NO</th>
		<th>BL_NO_DATE</th>
		<th>DOCUMENT_THRU_BANK</th>
		<th>BY_MOTOR_TRANSPORT</th>
	</tr>
</table> -->
</div>
</form>
<br>
</body>
</html>