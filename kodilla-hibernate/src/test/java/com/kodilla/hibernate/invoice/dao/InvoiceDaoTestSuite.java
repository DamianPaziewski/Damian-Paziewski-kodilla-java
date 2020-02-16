package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("TV");
        Product product2 = new Product("PLAYSTATION");

        Item item1 = new Item(product1, new BigDecimal(2000), 4);
        Item item2 = new Item(product1, new BigDecimal(2000), 2);
        Item item3 = new Item(product2, new BigDecimal(1250), 8);

        Invoice invoice = new Invoice("2020/02/16");

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int Id = invoice.getId();
        int itemSize = invoice.getItems().size();

        //Then
        Assert.assertEquals(3, itemSize);
        Assert.assertEquals(1, invoiceDao.count());
        Assert.assertNotEquals(0, Id);

        //CleanUp
        try {
            invoiceDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }
}