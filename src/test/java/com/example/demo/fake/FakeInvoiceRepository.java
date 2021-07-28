package com.example.demo.fake;

import java.util.Collection;
import java.util.HashMap;

import com.example.demo.fake.Invoice;
import com.example.demo.fake.InvoiceRepository;


//Lightweight implementaion of real invoice repo
public class FakeInvoiceRepository implements InvoiceRepository {
	
	HashMap<Integer,Invoice> dataStore = new HashMap<>();

	@Override
	public void add(Invoice invoice) {
		dataStore.put(invoice.getInvoiceNumber(), invoice);
		
	}

	@Override
	public Collection<Invoice> findAll() {
		// TODO Auto-generated method stub
		return dataStore.values();
	}

}
