package com.cg.demo.bean;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class ServiceProvidersBean {
	private String nameOfCompany;
	private BigInteger accountNumber;
	private BigInteger spi;
	
	public ServiceProvidersBean() {
		super();
	}

	public ServiceProvidersBean(String nameOfCompany, BigInteger accountNumber, BigInteger spi) {
		super();
		this.nameOfCompany = nameOfCompany;
		this.accountNumber = accountNumber;
		this.spi = spi;
	}

	public String getNameOfCompany() {
		return nameOfCompany;
	}

	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}

	public BigInteger getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(BigInteger accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigInteger getSpi() {
		return spi;
	}

	public void setSpi(BigInteger spi) {
		this.spi = spi;
	}
	
	@Override
	public String toString() {
		return "ServiceProvidersBean [nameOfCompany=" + nameOfCompany + ", accountNumber=" 
				+ accountNumber + ", spi="+ spi + "]";
	}

	
	
}
