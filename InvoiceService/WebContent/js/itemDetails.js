var addCounter = 0;
function addRow() {
	var table = $('#itemDetailId');
	var html = '<tr>' + 
	'<td id='+ addCounter + '></td>' + 
	'<td><input type="text" name="itemDetailBean[' + addCounter + '].item"/></td>' + 
	'<td><input class="priceClass" type="text" name="itemDetailBean[' + addCounter + '].price"/></td>' + 
	'<td><input class="quantityClass" type="text" name="itemDetailBean[' + addCounter + '].quantity"/></td>' + 
	'<td><input type="text" name="itemDetailBean[' + addCounter + '].per"/></td>' + 
	'<td><input type="text" name="itemDetailBean[' + addCounter + '].subTotal" readonly="readonly"/></td>' + 
	'<td><a href="javascript:void(0)" class="delRowClass"><img src="../image/del2.png"></img></a></td>' + 
	'</tr>';
	
	
	
	$('#itemDetailId tr:last').after(html);
	++addCounter;
	$('#itemDetailId tr:eq('+addCounter+') td:first').text(addCounter);
}

function submitForm() {
	$('#globalFormId').attr('action', 'submitItemDetails').attr('method', 'post');
	$('#globalFormId').submit();
}

$(document).ready(function() {

	$('#itemDetailId').on('click', '.delRowClass', function() {
		--addCounter;
		$(this).closest('tr').remove();
	});

	$('#itemDetailId').on('blur', '.priceClass', function() {
		var priceVal = $(this).val();
		var trIndex = $(this).closest('tr').index();
		var tdIndex = $(this).closest('td').index();
		var quantityVal = $('#itemDetailId tr:eq(' + trIndex + ') td:eq(' + (tdIndex - 1) + ') input').val();
		if (quantityVal != undefined && quantityVal != "") {
			$('#itemDetailId tr:eq(' + trIndex + ') td:eq(' + (tdIndex + 3) + ') input').val(priceVal * quantityVal);
		} else {
			$('#itemDetailId tr:eq(' + trIndex + ') td:eq(' + (tdIndex + 3) + ') input').val(priceVal);
		}

	});

	$('#itemDetailId').on('blur', '.quantityClass', function() {
		var quantityVal = $(this).val();
		var trIndex = $(this).closest('tr').index();
		var tdIndex = $(this).closest('td').index();
		var priceVal = $('#itemDetailId tr:eq(' + trIndex + ') td:eq(' + (tdIndex - 1) + ') input').val();
		if (priceVal != undefined && priceVal != "") {
			$('#itemDetailId tr:eq(' + trIndex + ') td:eq(' + (tdIndex + 2) + ') input').val(quantityVal * priceVal);
		}

	});

});