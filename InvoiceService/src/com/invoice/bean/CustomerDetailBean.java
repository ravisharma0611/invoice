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
	
	//Unique
	private long invoiceNo;
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
	private String grandTotalWords;
	
	//One TO One Mapping
	//@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "dispatchId")
	DispatchDetailBean dispatchDetailBean = new DispatchDetailBean();
	
	//One to Many Mapping
	//@OneToMany(cascade=ALL, mappedBy="itemDetailList")
	Set<ItemDetailBean> itemDetailList = new HashSet<ItemDetailBean>();
	
	public long getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(long invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
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
	public Date getChallanNoDate() {
		return challanNoDate;
	}
	public void setChallanNoDate(Date challanNoDate) {
		this.challanNoDate = challanNoDate;
	}
	public String getPoNo() {
		return poNo;
	}
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}
	public Date getPoNoDate() {
		return poNoDate;
	}
	public void setPoNoDate(Date poNoDate) {
		this.poNoDate = poNoDate;
	}
	public long getCourierCharge() {
		return courierCharge;
	}
	public void setCourierCharge(long courierCharge) {
		this.courierCharge = courierCharge;
	}
	public double getLbt() {
		return lbt;
	}
	public void setLbt(double lbt) {
		this.lbt = lbt;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	public double getServiceTax() {
		return serviceTax;
	}
	public void setServiceTax(double serviceTax) {
		this.serviceTax = serviceTax;
	}
	public double getLbtPercent() {
		return lbtPercent;
	}
	public void setLbtPercent(double lbtPercent) {
		this.lbtPercent = lbtPercent;
	}
	public double getVatPercent() {
		return vatPercent;
	}
	public void setVatPercent(double vatPercent) {
		this.vatPercent = vatPercent;
	}
	public double getServiceTaxPercent() {
		return serviceTaxPercent;
	}
	public void setServiceTaxPercent(double serviceTaxPercent) {
		this.serviceTaxPercent = serviceTaxPercent;
	}
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public double getGreatGrandTotal() {
		return greatGrandTotal;
	}
	public void setGreatGrandTotal(double greatGrandTotal) {
		this.greatGrandTotal = greatGrandTotal;
	}
	public String getGrandTotalWords() {
		return grandTotalWords;
	}
	public void setGrandTotalWords(String grandTotalWords) {
		this.grandTotalWords = grandTotalWords;
	}
	
	
}
