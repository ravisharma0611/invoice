package com.invoice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity(name="PRODUCT_PER_CUSTOMER")
public class ItemDetailBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCT_PER_CUSTOMER_SEQ")
	@SequenceGenerator(name="PRODUCT_PER_CUSTOMER_SEQ", sequenceName="PRODUCT_PER_CUSTOMER_SEQ", allocationSize=1)
	@Column(name="IDKEY_PPC")
	private Integer idKeyPpc;
	@Column(name="PARTICULARS_PRODUCT")
	private String item = "";
	@Column(name="RATE")
	private Float price = 0.0f;
	@Column(name="QUANTITY")
	private Integer quantity = 0;
	@Column(name="PER")
	private String per = "";
	@Column(name="AMOUNT")
	private Float subTotal = 0.0f;
	
	@Column(name="INVOICENO")
	private Long invoiceNo;
	
	
	
	public Long getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(Long invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	
	public void setIdKeyPpc(Integer idKeyPpc) {
		this.idKeyPpc = idKeyPpc;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public void setSubTotal(Float subTotal) {
		this.subTotal = subTotal;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPer() {
		return per;
	}
	public void setPer(String per) {
		this.per = per;
	}
	public float getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}
	/*public int getIdKeyPpc() {
		return idKeyPpc;
	}
	public void setIdKeyPpc(int idKeyPpc) {
		this.idKeyPpc = idKeyPpc;
	}*/
	
}
