package com.example.demo.stub;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


public class TestInvoiceServiceWithStub {
	
	@Test
	@DisplayName("Thihs method uses stub to run the tests")
	public void  testInvoiceFindInvoiceCount() {
		
		InvoiceRepository stub = new InvoiceRepositoryStub();
		InvoiceService service = new InvoiceService(stub);
		
		//List<Invoice> list = stub.findAllByAmountGt(6000);
		List<Invoice> filteredList = service.discountByAmount(10, 5000);
		
	

		assertEquals(900,1000, filteredList.get(0).getAmount());
		assertEquals(4500,5000, filteredList.get(1).getAmount());
	}
}
