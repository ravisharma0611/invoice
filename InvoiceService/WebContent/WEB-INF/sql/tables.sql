create table CUSTOMERDETAIL (
	INVOICENO LONG not null primary key,
	INVOICE_DATE DATE null,
	BILLEDNAME VARCHAR(75) null,
	BILLEDADDRESS VARCHAR(75) null,
	VAT_NO VARCHAR(75) null,
	CHALLAN_NO VARCHAR(75) null,
	CHALLAN_NO_DATE DATE null,
	PO_NO VARCHAR(75) null,
	PO_NO_DATE DATE null,
	COURIER_CHARGE LONG,
	LBT DOUBLE,
	VAT DOUBLE,
	SERVICE_TAX DOUBLE,
	LBT_PERCENT DOUBLE,
	VAT_PERCENT DOUBLE,
	SERVICE_TAX_PERCENT DOUBLE,
	GRAND_TOTAL DOUBLE,
	GREAT_GRAND_TOTAL DOUBLE,
	GRAND_TOTAL_WORDS VARCHAR(75) null
);

create table DESPATCH_DETAIL (
	IDKEY_DESPATCH LONG not null primary key,
	PER_RR_MM_NO VARCHAR(75) null,
	PER_RR_MM_NO_DATE DATE null,
	BL_NO VARCHAR(75) null,
	BL_NO_DATE DATE null,
	DOCUMENT_THRU_BANK VARCHAR(75) null,
	BY_MOTOR_TRASPORT VARCHAR(75) null,
	INVOICENO LONG,
	DESPATCH_TO VARCHAR(75) null
);

create table PRODUCT_PER_CUSTOMER (
	IDKEY_PPC LONG not null primary key,
	INVOICENO LONG,
	PARTICULARS_PRODUCT VARCHAR(75) null,
	QUANTITY LONG,
	RATE DOUBLE,
	PER VARCHAR(75) null,
	AMOUNT DOUBLE
);