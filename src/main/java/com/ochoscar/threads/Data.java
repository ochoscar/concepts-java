package com.ochoscar.threads;

public class Data {
	
	private Long amount = 0L;

	synchronized public Long getAmount() {
		return amount;
	}

	synchronized public void setAmount(Long amount) {
		this.amount = amount;
	}
	
}
