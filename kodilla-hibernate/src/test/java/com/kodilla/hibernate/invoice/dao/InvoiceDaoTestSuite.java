package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;


    @Test
    void testInvoiceDaoSave() {
        //Given
        Product car1 = new Product("Audi A8");
        Product car2 = new Product("BMW X8");
        Product car3 = new Product("Mercedes G500");

        Item item1 = new Item(car1, new BigDecimal(400000), 3);
        Item item2 = new Item(car2, new BigDecimal(500000), 2);
        Item item3 = new Item(car3, new BigDecimal(600000), 5);

        Invoice invoice1 = new Invoice("NR/101");
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);


        //When
        invoiceDao.save(invoice1);

        System.out.println(invoice1.getItems().get(1).getInvoice());


        int invoiceId = invoice1.getId();

        //Then
        assertNotEquals(0, invoiceId);

        //CleanUp
        // invoiceDao.deleteById(invoiceId);


    }

}
