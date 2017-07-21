$(document).ready(function() {
    // "use strict";

    /*
     * $('#customerDetailTableId').on('blur', "#invoicTestId", function() {
     * console.log("Inside Blur"); try { $.ajax({ url :
     * "invoiceValuePresent.action", method : "post", data : { invoiceTestVal :
     * $('#invoicTestId').val() }, success : function(response) { if (response ==
     * "P") { invoiceExists($('#invoicTestId').val()); } else {
     * $('#nextBtnId').prop('disabled', false); } }, error : function() {
     * AjaxError(); }
     * 
     * }); } catch (err) { ExceptionCondition(err.message); }
     * 
     * });
     */

    $('#datepicker').datepicker({
	changeMonth : true,
	changeYear : true
    });

    $('#challanDate').datepicker({
	changeMonth : true,
	changeYear : true
    });

    $('#blDate').datepicker({
	changeMonth : true,
	changeYear : true
    });

    $('#rrDate').datepicker({
	changeMonth : true,
	changeYear : true
    });

    $('#indDate').datepicker({
	changeMonth : true,
	changeYear : true
    });

});

function submitCustDetails() { // if (!checkInvoiceNum()) {

    var a = $("#custDetailFormId").validationEngine();
    if (a) {
	$('#custDetailFormId').attr('action', 'submitInvoiceActionName').attr(
		'method', 'post');
	$('#custDetailFormId').submit();
    }

    // } else { // invoiceExists($('#invoicTestId').val());
    // }
}

function checkInvoiceNum() {
    var invoicePresent = false;
    try {
	$.ajax({
	    url : "invoiceValuePresent.action",
	    method : "post",
	    data : {
		invoiceTestVal : $('#invoicTestId').val()
	    },
	    async : false,
	    success : function(response) {
		if (response == "P") {
		    invoicePresent = true;
		}
	    },
	    error : function() {
		AjaxError();
	    }

	});
    } catch (err) {
	ExceptionCondition(err.message);
    }
    // return invoicePresent;
    return true;
}
function invoiceExists(invoiceVal) {
    BootstrapDialog.show({
	type : BootstrapDialog.TYPE_DANGER,
	title : 'INFO',
	message : 'Invoice Number: <strong>' + invoiceVal
		+ '</strong> already Present in system.',
	buttons : [ {
	    label : 'OK',
	    action : function(dialogItself) {
		dialogItself.close();
	    }
	} ]
    });
}