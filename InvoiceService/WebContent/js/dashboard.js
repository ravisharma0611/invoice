"use strict";
var CREATE_INVOICE_HOME = "invoiceHome";
var SEARCH_INVOICE_HOME = "invoiceSearch";
var MAIL_HOME = "#";
var LOGOUT = "logout";

var CREATE_INVOICE_CONST = "create";
var SEARCH_INVOICE_CONST = "search";
var MAIL_CONST = "mail";
var LOGOUT_CONST = "logOff";

function moveToNextAction(nextItem) {
    var nextAction;
    try {
	if (nextItem != undefined && nextItem != "") {
	    if (nextItem == CREATE_INVOICE_CONST) {
		nextAction = CREATE_INVOICE_HOME;
	    } else if (nextItem == SEARCH_INVOICE_CONST) {
		nextAction = SEARCH_INVOICE_HOME;
	    } else if (nextItem == MAIL_CONST) {
		nextAction = MAIL_HOME;
	    } else if (nextItem == LOGOUT_CONST) {
		nextAction = LOGOUT;
	    } else {
		throw new Error("Something Went Wrong.");
	    }

	    hitAction(nextAction);
	} else {
	    throw new Error("Something Went Wrong.");
	}

    } catch (err) {
	ExceptionCondition(err.message);
    }

}

function hitAction(nextAction) {
    try {
	$('#dashBoardId').attr('action', nextAction).attr('method', 'post');
	$('#dashBoardId').submit();
    } catch (err) {
	throw err;
    }
}
