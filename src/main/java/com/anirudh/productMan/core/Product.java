package com.anirudh.productMan.core;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String company, mfdDate, expDate, idNumber;
	private int batchNo, price;
	@Column(name="explanation", nullable=true, length=512)
	private String description;
	public Product() {}
	public Product(String company, String mfdDate, String expDate, String idNumber, int batchNo, int price, Seller seller) {
		super();
		this.company = company;
		this.mfdDate = mfdDate;
		this.expDate = expDate;
		this.idNumber = idNumber;
		this.batchNo = batchNo;
		this.price = price;
		this.seller = seller;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seller")
	private Seller seller;

	public Seller getSeller() {
	 return seller;
	}
	public void setSeller(Seller seller)  {
	    this.seller = seller;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getMfdDate() {
		return mfdDate;
	}
	public void setMfdDate(String mfdDate) {
		this.mfdDate = mfdDate;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public int getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
