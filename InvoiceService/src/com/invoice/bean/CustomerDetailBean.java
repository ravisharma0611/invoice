package com.invoice.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//@Entity(name="CUSTOMERDETAIL")
public class CustomerDetailBean {
	
	//@Id
	private int idKey;
	
	private String invoiceNo;
	private String invoiceDate;
	private String billedName;
	private String billedAddress;
	private String vatNo;
	private String challanNo;
	private String challanNoDate;
	private String poNo;
	private String poNoDate;
	private String courierCharge;
	private String lbt;
	private String vat;
	private String serviceTax;
	private String lbtPercent;
	private String vatPercent;
	private String serviceTaxPercent;
	private String grandTotal;
	private String greatGrandTotal;
	private String grandTotalWords;
	//Unique
/*	private long invoiceNo;
	private Date invoiceDate;
	private String billedName;
	private String billedAddress;
	private String vatNo;
	private String challanNo;
	private Date challanNoDate;
	private String poNo;
	private Date poNoDate;
	private long courierCharge;
	private double lbt;
	private double vat;
	private double serviceTax;
	private double lbtPercent;
	private double vatPercent;
	private double serviceTaxPercent;
	private double grandTotal;
	private double greatGrandTotal;
	private String grandTotalWords;*/
	
	//One TO One Mapping
	//@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "dispatchId")
	/*DispatchDetailBean dispatchDetailBean = new DispatchDetailBean();
	
	//One to Many Mapping
	//@OneToMany(cascade=ALL, mappedBy="itemDetailList")
	Set<ItemDetailBean> itemDetailList = new HashSet<ItemDetailBean>();
	*/
	
	public int getIdKey() {
		return idKey;
	}


	public void setIdKey(int idKey) {
		this.idKey = idKey;
	}


	


	

	public String getInvoiceNo() {
		return invoiceNo;
	}


	public void setInvoiceNo(String invoiceNo) {
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


	public String getCourierCharge() {
		return courierCharge;
	}


	public void setCourierCharge(String courierCharge) {
		this.courierCharge = courierCharge;
	}


	public String getLbt() {
		return lbt;
	}


	public void setLbt(String lbt) {
		this.lbt = lbt;
	}


	public String getVat() {
		return vat;
	}


	public void setVat(String vat) {
		this.vat = vat;
	}


	public String getServiceTax() {
		return serviceTax;
	}


	public void setServiceTax(String serviceTax) {
		this.serviceTax = serviceTax;
	}


	public String getLbtPercent() {
		return lbtPercent;
	}


	public void setLbtPercent(String lbtPercent) {
		this.lbtPercent = lbtPercent;
	}


	public String getVatPercent() {
		return vatPercent;
	}


	public void setVatPercent(String vatPercent) {
		this.vatPercent = vatPercent;
	}


	public String getServiceTaxPercent() {
		return serviceTaxPercent;
	}


	public void setServiceTaxPercent(String serviceTaxPercent) {
		this.serviceTaxPercent = serviceTaxPercent;
	}


	public String getGrandTotal() {
		return grandTotal;
	}


	public void setGrandTotal(String grandTotal) {
		this.grandTotal = grandTotal;
	}


	public String getGreatGrandTotal() {
		return greatGrandTotal;
	}


	public void setGreatGrandTotal(String greatGrandTotal) {
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
