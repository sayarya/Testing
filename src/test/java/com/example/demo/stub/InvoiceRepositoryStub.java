package com.example.demo.stub;

import java.util.Arrays;
import java.util.List;

public class InvoiceRepositoryStub implements InvoiceRepository {

	@Override
	public List<Invoice> findAllByAmountGt(double amount) {
		
		return Arrays.asList(new Invoice(856, "Arya",1000), new Invoice(456, "Akanksha", 5000));
	}

}
