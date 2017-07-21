package com.invoice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="CUSTOMERDETAIL")
public class CustomerDetailBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUST_DETAIL_SEQ")
    @SequenceGenerator(name="CUST_DETAIL_SEQ", sequenceName="CUST_DETAIL_SEQ", allocationSize=1)
	private int idKey;
	@Column(name="INVOICENO")
	private Long invoiceNo;
	@Column(name="INVOICE_DATE")
	private String invoiceDate = " ";
	@Column(name="BILLEDNAME")
	private String billedName = " ";
	private String billedAddress = " ";
	
	@Column(name="VAT_NO")
	private String vatNo = " ";
	
	@Column(name="CHALLAN_NO")
	private String challanNo = " ";
	
	@Column(name="CHALLAN_NO_DATE")
	private String challanNoDate = " ";
	
	@Column(name="PO_NO")
	private String poNo = " ";
	
	@Column(name="PO_NO_DATE")
	private String poNoDate = " ";
	@Column(name="COURIER_CHARGE")
	private Float courierCharge = 0.0f;
	@Column(name="LBT")
	private Float lbt = 0.0f;
	private Float vat = 0.0f;
	
	@Column(name="SERVICE_TAX")
	private Float serviceTax = 0.0f;
	
	@Column(name="LBT_PERCENT")
	private Float lbtPercent = 0.0f;
	
	@Column(name="VAT_PERCENT")
	private Float vatPercent = 0.0f;
	
	@Column(name="SERVICE_TAX_PERCENT")
	private Float serviceTaxPercent = 0.0f;
	
	@Column(name="GRAND_TOTAL")
	private Float grandTotal = 0.0f;
	
	@Column(name="GREAT_GRAND_TOTAL")
	private Float greatGrandTotal = 0.0f;
	
	@Column(name="GRAND_TOTAL_WORDS")
	private String grandTotalWords = " ";
	
	
	public int getIdKey() {
		return idKey;
	}


	public void setIdKey(int idKey) {
		this.idKey = idKey;
	}


	


	

	

	public Long getInvoiceNo() {
		return invoiceNo;
	}


	public void setInvoiceNo(Long invoiceNo) {
		this.invoiceNo = invoiceNo;
	}


	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}


	public String getBilledName() {
		return billedName;
	}


	public void setBilledName(String billedName) {
		this.billedName = billedName;
	}


	public String getBilledAddress() {
		return billedAddress;
	}


	public void setBilledAddress(String billedAddress) {
		this.billedAddress = billedAddress;
	}


	public String getVatNo() {
		return vatNo;
	}


	public void setVatNo(String vatNo) {
		this.vatNo = vatNo;
	}


	public String getChallanNo() {
		return challanNo;
	}


	public void setChallanNo(String challanNo) {
		this.challanNo = challanNo;
	}

	public String getChallanNoDate() {
		return challanNoDate;
	}

	public void setChallanNoDate(String challanNoDate) {
		this.challanNoDate = challanNoDate;
	}


	public String getPoNo() {
		return poNo;
	}


	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

	public String getPoNoDate() {
		return poNoDate;
	}

	public void setPoNoDate(String poNoDate) {
		this.poNoDate = poNoDate;
	}


	


	public Float getCourierCharge() {
		return courierCharge;
	}


	public void setCourierCharge(Float courierCharge) {
		this.courierCharge = courierCharge;
	}


	

	public Float getLbt() {
		return lbt;
	}


	public void setLbt(Float lbt) {
		this.lbt = lbt;
	}


	public Float getVat() {
		return vat;
	}


	public void setVat(Float vat) {
		this.vat = vat;
	}


	public Float getServiceTax() {
		return serviceTax;
	}


	public void setServiceTax(Float serviceTax) {
		this.serviceTax = serviceTax;
	}


	public Float getLbtPercent() {
		return lbtPercent;
	}


	public void setLbtPercent(Float lbtPercent) {
		this.lbtPercent = lbtPercent;
	}


	public Float getVatPercent() {
		return vatPercent;
	}


	public void setVatPercent(Float vatPercent) {
		this.vatPercent = vatPercent;
	}


	public Float getServiceTaxPercent() {
		return serviceTaxPercent;
	}


	public void setServiceTaxPercent(Float serviceTaxPercent) {
		this.serviceTaxPercent = serviceTaxPercent;
	}


	public Float getGrandTotal() {
		return grandTotal;
	}


	public void setGrandTotal(Float grandTotal) {
		this.grandTotal = grandTotal;
	}


	public Float getGreatGrandTotal() {
		return greatGrandTotal;
	}


	public void setGreatGrandTotal(Float greatGrandTotal) {
		this.greatGrandTotal = greatGrandTotal;
	}


	public String getGrandTotalWords() {
		return grandTotalWords;
	}


	public void setGrandTotalWords(String grandTotalWords) {
		this.grandTotalWords = grandTotalWords;
	}


	@Override
	public String toString() {
		return "CustomerDetailBean [idKey=" + idKey + ", invoiceNo="
				+ invoiceNo + ", invoiceDate=" + invoiceDate + ", billedName="
				+ billedName + ", billedAddress=" + billedAddress + ", vatNo="
				+ vatNo + ", challanNo=" + challanNo + ", challanNoDate="
				+ challanNoDate + ", poNo=" + poNo + ", poNoDate=" + poNoDate
				+ ", courierCharge=" + courierCharge + ", lbt=" + lbt
				+ ", vat=" + vat + ", serviceTax=" + serviceTax
				+ ", lbtPercent=" + lbtPercent + ", vatPercent=" + vatPercent
				+ ", serviceTaxPercent=" + serviceTaxPercent + ", grandTotal="
				+ grandTotal + ", greatGrandTotal=" + greatGrandTotal
				+ ", grandTotalWords=" + grandTotalWords + "]";
	}




	

	
}
