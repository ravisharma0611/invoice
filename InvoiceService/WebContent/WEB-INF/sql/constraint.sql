alter table customerdetail add constraint INVOICE_UNIQUE_CONST UNIQUE(INVOICENO);

alter table DISPATCH_DETAIL add constraint INVOICE_UNIQUE_2_CONST UNIQUE(INVOICENO);