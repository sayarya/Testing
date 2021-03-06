package com.example.demo.fake;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class TestInvoiceService {
	
	@Test
	@DisplayName("Thihs method checks the count from Find Invoice Count is equal to expected value")
	public void  testInvoiceFindInvoiceCount() {
		
		InvoiceRepository repo = new FakeInvoiceRepository();
		InvoiceService service = new InvoiceService(repo);
		
		Invoice inv1 = new Invoice(101, "Arya", 2000);
		Invoice inv2 = new Invoice(102, "Scooby", 3000);
		
		service.addInvoice(inv1);
		service.addInvoice(inv2);

		assertEquals(2, service.findInvoiceCount());
		
	}

}
