package com.invoice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="DISPATCH_DETAIL")
public class DispatchDetailBean {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DISPATCH_DETAIL_SEQ")
    @SequenceGenerator(name="DISPATCH_DETAIL_SEQ", sequenceName="DISPATCH_DETAIL_SEQ", allocationSize=1)
	@Column(name="IDKEY_DESPATCH")
	private long idkeyDespatch;
	
	@Column(name="PER_RR_MM_NO")
	private String perRrMmNumber = " ";
	
	@Column(name="PER_RR_MM_NO_DATE")
	private String perRrMmNumberDate = " ";
	
	@Column(name="BL_NO")
	private String blNumber = " ";
	
	@Column(name="BL_NO_DATE")
	private String blNumberDate = " ";
	
	@Column(name="DOCUMENT_THRU_BANK")
	private String documentThruBank = " ";
	
	@Column(name="BY_MOTOR_TRASPORT")
	private String byMotorTransport = " ";
	private long invoiceNo;
	
	@Column(name="DESPATCH_TO")
	private String despatchTo = " ";
	
	
	public long getInvoiceNo() {
		return invoiceNo;
	}




	public void setInvoiceNo(long invoiceNo) {
		this.invoiceNo = invoiceNo;
	}




	
	
	
	
	
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
