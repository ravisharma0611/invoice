$(document).ready(
	function() {
	    "use strict";

	    // on load hiding all the tables
	    $('.initClass').hide();

	    var start = moment().subtract(29, 'days');
	    var end = moment();
	    // 30-APR-17
	    $('#dateId').daterangepicker(
		    {
			startDate : start,
			endDate : end,
			ranges : {
			    'Today' : [ moment(), moment() ],
			    'Yesterday' : [ moment().subtract(1, 'days'),
				    moment().subtract(1, 'days') ],
			    'Last 7 Days' : [ moment().subtract(6, 'days'),
				    moment() ],
			    'Last 30 Days' : [ moment().subtract(29, 'days'),
				    moment() ],
			    'This Month' : [ moment().startOf('month'),
				    moment().endOf('month') ],
			    'Last Month' : [
				    moment().subtract(1, 'month').startOf(
					    'month'),
				    moment().subtract(1, 'month')
					    .endOf('month') ]
			}
		    }, cb);

	    cb(start, end);

	    // register downloadPDF call
	    $('#custDetailId').on(
		    'click',
		    '.custInfoPDF',
		    function() {
			var invoiceNumber = $(this).closest('tr').find(
				'td:first a').text();
			DownloadPDF(invoiceNumber);
		    });

	    // show item detail table
	    $('#custDetailId').on('click', '.invoiceNumClass', function() {
		var invoiceNumber = $(this).text();
		ItemDetailTab(invoiceNumber);

	    });

	});

function cb(start, end) {

    $('#dateId').html(
    // start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
    start.format('DD/MMMM/YYYY') + ' - ' + end.format('DD/MMMM/YYYY'));

}

function searchForm() {
    try {
	var hitServer = false;
	var invoiceId = $('#invoiceId').val();
	var date = $('#dateId').val();

	if (invoiceId != undefined && invoiceId != "") {
	    hitServer = true;
	}

	if (date != undefined && date != "") {
	    hitServer = true;
	}

	if (hitServer) {
	    $('#custDetailId').find('tr:gt(0)').remove();
	    $.ajax({
		url : 'searchDB',
		method : 'post',
		data : {
		    invoiceId : invoiceId,
		    date : date
		},
		success : function(response) {

		    if (response.custList.length > 0) {
			ConstructCustomerDetail(response.custList);
		    } else {
			NoDataFound();
		    }

		},
		error : function() {
		    AjaxError();
		}
	    });
	}
    } catch (err) {
	ExceptionCondition(err.message);
    }

}

function ConstructCustomerDetail(customerDetail) {
    for (var i = 0; i < customerDetail.length; i++) {
	var html = '<tr>' + '<td>'
		+ '<a href="javascript:void(0)" class="invoiceNumClass">'
		+ customerDetail[i].invoiceNo
		+ '</a>'
		+ '</td>'
		+ '<td>'
		+ customerDetail[i].invoiceDate
		+ '</td>'
		+ '<td>'
		+ customerDetail[i].billedName
		+ '</td>'
		+ '<td>'
		+ customerDetail[i].billedAddress
		+ '</td>'
		+ '<td>'
		+ customerDetail[i].vatNo
		+ '</td>'
		+ '<td>'
		+ customerDetail[i].challanNo
		+ '</td>'
		+ '<td>'
		+ customerDetail[i].challanNoDate
		+ '</td>'
		+ '<td>'
		+ customerDetail[i].poNo
		+ '</td>'
		+ '<td>'
		+ customerDetail[i].poNoDate
		+ '</td>'
		+ '<td>'
		+ customerDetail[i].lbt
		+ '</td>'
		+ '<td>'
		+ customerDetail[i].vat
		+ '</td>'
		+ '<td>'
		+ customerDetail[i].serviceTax
		+ '</td>'
		+ '<td>'
		+ customerDetail[i].grandTotal
		+ '</td>'
		+ '<td><a href="javascript:void(0)" class="custInfoPDF"><img src="../../image/download.png"></img></a></td>'
		+ '</tr>';

	$('#custDetailId tr:last').after(html);
	$('#custDetailId').show();
    }
}

function NoDataFound() {
    BootstrapDialog.show({
	type : BootstrapDialog.TYPE_INFO,
	title : 'INFO',
	message : 'No Data Found',
	buttons : [ {
	    action : function(dialogItself) {
		dialogItself.close();
	    }
	} ]
    });
}

function AjaxError() {
    BootstrapDialog.show({
	type : BootstrapDialog.TYPE_DANGER,
	title : 'ERROR',
	message : 'Server Error..Please try again later',
	buttons : [ {
	    action : function(dialogItself) {
		dialogItself.close();
	    }
	} ]
    });
}

function ExceptionCondition(errMsg) {
    BootstrapDialog.show({
	type : BootstrapDialog.TYPE_DANGER,
	title : 'ERROR',
	message : errMsg,
	buttons : [ {
	    action : function(dialogItself) {
		dialogItself.close();
	    }
	} ]
    });
}

function DownloadPDF(invoiceNumber) {
    $('#').attr('action', 'downloadPDF?invoiceNumber=' + invoiceNumber).attr(
	    'method', 'post');
    $('#').submit();
}

function ItemDetailTab(invoiceNumber) {
    try {

	if (invoiceNumber != undefined && invoiceNumber != "") {
	    $('#itemDetailId').find('tr:gt(0)').remove();
	    $.ajax({
		url : 'findItem',
		method : 'post',
		data : {
		    invoiceNumber : invoiceNumber,
		},
		success : function(response) {

		    if (response.itemList.length > 0) {
			ConstructItemDetail(response.itemList, invoiceNumber);
		    } else {
			NoDataFound();
		    }

		},
		error : function() {
		    AjaxError();
		}
	    });
	}
    } catch (err) {
	ExceptionCondition(err.message);
    }

}

function ConstructItemDetail(itemDetail, invoiceNumber) {
    for (var i = 0; i < itemDetail.length; i++) {
	var html = '<tr>' + '<td>' + invoiceNumber + '</td>' + '<td>'
		+ itemDetail[i].item + '</td>' + '<td>'
		+ itemDetail[i].quantity + '</td>' + '<td>'
		+ itemDetail[i].price + '</td>' + '<td>' + itemDetail[i].per
		+ '</td>' + '<td>' + itemDetail[i].subTotal + '</td>' + '</tr>';

	$('#itemDetailId tr:last').after(html);
	$('#itemDetailId').show();
    }
}