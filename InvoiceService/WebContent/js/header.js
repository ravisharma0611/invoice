"use strict";

function loadDashBoard() {
    try {
	$('#dashBoardId').attr('action', 'dashboard').attr('method', 'post');
	$('#dashBoardId').submit();
    } catch (err) {
	ExceptionCondition(err.message);
    }
}