package com.invoice.bean;

import java.util.Date;

//@Entity(name="DISPATCH_DETAIL")
public class DispatchDetailBean {
	//@id
	private long idkeyDespatch;
	
	private String perRrMmNumber;
	private String perRrMmNumberDate;
	private String blNumber;
	private String blNumberDate;
	private String documentThruBank;
	private String byMotorTransport;
	//private long invoiceNo;
	private String despatchTo;
	
	
	
	
	public long getIdkeyDespatch() {
		return idkeyDespatch;
	}




	public void setIdkeyDespatch(long idkeyDespatch) {
		this.idkeyDespatch = idkeyDespatch;
	}




	public String getPerRrMmNumber() {
		return perRrMmNumber;
	}




	public void setPerRrMmNumber(String perRrMmNumber) {
		this.perRrMmNumber = perRrMmNumber;
	}




	public String getPerRrMmNumberDate() {
		return perRrMmNumberDate;
	}




	public void setPerRrMmNumberDate(String perRrMmNumberDate) {
		this.perRrMmNumberDate = perRrMmNumberDate;
	}




	public String getBlNumber() {
		return blNumber;
	}




	public void setBlNumber(String blNumber) {
		this.blNumber = blNumber;
	}




	public String getBlNumberDate() {
		return blNumberDate;
	}




	public void setBlNumberDate(String blNumberDate) {
		this.blNumberDate = blNumberDate;
	}




	public String getDocumentThruBank() {
		return documentThruBank;
	}




	public void setDocumentThruBank(String documentThruBank) {
		this.documentThruBank = documentThruBank;
	}




	public String getByMotorTransport() {
		return byMotorTransport;
	}




	public void setByMotorTransport(String byMotorTransport) {
		this.byMotorTransport = byMotorTransport;
	}




	public String getDespatchTo() {
		return despatchTo;
	}




	public void setDespatchTo(String despatchTo) {
		this.despatchTo = despatchTo;
	}




	@Override
	public String toString() {
		return "DispatchDetailBean [idkeyDespatch=" + idkeyDespatch
				+ ", perRrMmNumber=" + perRrMmNumber + ", perRrMmNumberDate="
				+ perRrMmNumberDate + ", blNumber=" + blNumber
				+ ", blNumberDate=" + blNumberDate + ", documentThruBank="
				+ documentThruBank + ", byMotorTransport=" + byMotorTransport
				+ ", despatchTo=" + despatchTo + "]";
	}
	
	
}
