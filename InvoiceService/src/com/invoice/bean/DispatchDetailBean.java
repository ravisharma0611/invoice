package com.invoice.bean;

import java.util.Date;

//@Entity(name="DISPATCH_DETAIL")
public class DispatchDetailBean {
	//@id
	private long idkeyDespatch;
	
	private String perRrMmNumber;
	private Date perRrMmNumberDate;
	private String blNumber;
	private Date blNumberDate;
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
	public Date getPerRrMmNumberDate() {
		return perRrMmNumberDate;
	}
	public void setPerRrMmNumberDate(Date perRrMmNumberDate) {
		this.perRrMmNumberDate = perRrMmNumberDate;
	}
	public String getBlNumber() {
		return blNumber;
	}
	public void setBlNumber(String blNumber) {
		this.blNumber = blNumber;
	}
	public Date getBlNumberDate() {
		return blNumberDate;
	}
	public void setBlNumberDate(Date blNumberDate) {
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
	
	
}
