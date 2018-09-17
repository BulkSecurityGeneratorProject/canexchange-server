package com.canya.gateway.web.rest.util;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import com.canya.gateway.domain.AbstractAuditingEntity;

@org.springframework.data.mongodb.core.mapping.Document(collection = "tokenerc20")
public class TokenAddress extends AbstractAuditingEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String id;

	private int tokenid;
	private String name;
	private String address;
	private String symbol;
	private String decimals;

	public int getTokenid() {
		return tokenid;
	}

	public void setTokenid(int tokenid) {
		this.tokenid = tokenid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getDecimals() {
		return decimals;
	}

	public void setDecimals(String decimals) {
		this.decimals = decimals;
	}

}
