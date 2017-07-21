var addCounter = 0;
function addRow() {
    var html = '<tr>'
	    + '<td id='
	    + addCounter
	    + '></td>'
	    + '<td><input type="text" name="itemDetailBean['
	    + addCounter
	    + '].item"/></td>'
	    + '<td><input class="priceClass validate[custom[decimalNumberOnly]]" type="text" name="itemDetailBean['
	    + addCounter
	    + '].price"/></td>'
	    + '<td><input class="quantityClass validate[custom[numberOnly]]" type="text" name="itemDetailBean['
	    + addCounter
	    + '].quantity"/></td>'
	    + '<td><input type="text" name="itemDetailBean['
	    + addCounter
	    + '].per"/></td>'
	    + '<td><input type="text" name="itemDetailBean['
	    + addCounter
	    + '].subTotal" readonly="true"/></td>'
	    + '<td><a href="javascript:void(0)" class="delRowClass"><img src="image/del2.png"></img></a></td>'
	    + '</tr>';

    $('#itemDetailId tbody').append(html);
    ++addCounter;
    $('#itemDetailId tr:eq(' + addCounter + ') td:first').text(addCounter);
}

function submitForm() {
    var rowCount = $('#itemDetailId tr').length;
    if (rowCount > 1) {
	var a = $("#globalFormId").validationEngine('validate');
	if (a) {
	    var JSONObject = createJSON();
	    if (JSONObject != undefined && JSONObject != "") {
		try {
		    $.ajax({
			url : 'submitItemDetails',
			method : 'post',
			data : {
			    JSONObject : JSONObject
			},
			dataType : "json",
			success : function(response) {

			    if (response.operationStatus == "SUCCESS") {
				SubmitSuccess(response.invoiceNumber);
			    } else {
				SubmitError();
			    }

			},
			error : function() {
			    AjaxError();
			}

		    });

		} catch (err) {
		    ExceptionCondition(err.message);
		}
	    }

	}
    } else {
	ZeroRowCountError();
    }

}

function ZeroRowCountError() {
    BootstrapDialog.show({
	type : BootstrapDialog.TYPE_WARNING,
	title : 'INFO',
	message : 'No Data Entered',
	buttons : [ {
	    label : 'OK',
	    action : function(dialogItself) {
		dialogItself.close();
	    }
	} ]
    });
}

function SubmitSuccess(invoiceNumber) {
    BootstrapDialog.show({
	type : BootstrapDialog.TYPE_SUCCESS,
	title : 'SUCCESS',
	message : 'Data Stored in Database Successfully',
	buttons : [ {
	    label : 'OK',
	    action : function(dialogItself) {
		window.location = "dashboard";
		// dialogItself.close();
	    }
	}, {
	    label : 'Download PDF',
	    action : function() {
		DownloadPDF('globalFormId', invoiceNumber);
	    }
	} ]
    });
}

/*
 * function downloadPDF(invoiceNumber) { if (invoiceNumber != undefined &&
 * invoiceNumber != "") { $('#').attr('action', 'downloadPDF?invoiceNumber=' +
 * invoiceNumber) .attr('method', 'post'); $('#').submit(); } }
 */

function SubmitError() {
    BootstrapDialog.show({
	type : BootstrapDialog.TYPE_DANGER,
	title : 'ERROR',
	message : 'Something Went Wrong.Please Try Later',
	buttons : [ {
	    label : 'OK',
	    action : function(dialogItself) {
		dialogItself.close();
	    }
	} ]
    });
}

function createJSON() {
    var JSONArray = [];
    $('#itemDetailId tr:gt(0)').each(function() {
	if ($(this).find('td:eq(2) input[type="text"]').val() == "") {
	    $(this).find('td:eq(2) input[type="text"]').val("0");
	}
	if ($(this).find('td:eq(3) input[type="text"]').val() == "") {
	    $(this).find('td:eq(3) input[type="text"]').val("0");
	}
	if ($(this).find('td:eq(5) input[type="text"]').val() == "") {
	    $(this).find('td:eq(5) input[type="text"]').val("0");
	}

	JSONArray.push({
	    "item" : $(this).find('td:eq(1) input[type="text"]').val(),
	    "price" : $(this).find('td:eq(2) input[type="text"]').val(),
	    "quantity" : $(this).find('td:eq(3) input[type="text"]').val(),
	    "per" : $(this).find('td:eq(4) input[type="text"]').val(),
	    "subTotal" : $(this).find('td:eq(5) input[type="text"]').val()

	});

    });

    var JSONArrayStringified = JSON.stringify(JSONArray);
    return JSONArrayStringified;
}

$(document).ready(
	function() {

	    $('#itemDetailId').on('click', '.delRowClass', function() {
		/*
		 * if (parseInt($(this).closest('tr') .find('td:eq(0)').text()) ==
		 * parseInt($('#itemDetailId tr').length - 1)) { // last element
		 * --addCounter; } else {
		 * 
		 * var index = $(this).closest('tr') .find('td:eq(0)').text(); //
		 * ++addCounter; }
		 */
		--addCounter;
		$(this).closest('tr').remove();
	    });

	    $('#itemDetailId').on(
		    'blur',
		    '.priceClass',
		    function() {
			var priceVal = $(this).val();
			var trIndex = $(this).closest('tr').index();
			var tdIndex = $(this).closest('td').index();
			var quantityVal = $(
				'#itemDetailId tbody tr:eq(' + trIndex
					+ ') td:eq(' + (tdIndex + 1)
					+ ') input').val();
			if (quantityVal != undefined && quantityVal != "") {
			    $(
				    '#itemDetailId tbody tr:eq(' + trIndex
					    + ') td:eq(' + (tdIndex + 3)
					    + ') input').val(
				    priceVal * quantityVal);
			} else {
			    $(
				    '#itemDetailId tbody tr:eq(' + trIndex
					    + ') td:eq(' + (tdIndex + 3)
					    + ') input').val(priceVal);
			}

		    });

	    $('#itemDetailId').on(
		    'blur',
		    '.quantityClass',
		    function() {
			var quantityVal = $(this).val();
			var trIndex = $(this).closest('tr').index();
			var tdIndex = $(this).closest('td').index();
			var priceVal = $(
				'#itemDetailId tbody tr:eq(' + trIndex
					+ ') td:eq(' + (tdIndex - 1)
					+ ') input').val();
			if (priceVal != undefined && priceVal != "") {
			    $(
				    '#itemDetailId tbody tr:eq(' + trIndex
					    + ') td:eq(' + (tdIndex + 2)
					    + ') input').val(
				    quantityVal * priceVal);
			}

		    });

	});