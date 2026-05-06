package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderProcessorTest {

    @Test
    void testPrintOrderSummaryForMemberCustomer() {

        // Create customer
        Customer customer = new Customer("Ahmed", true);

        // Create items
        Item item1 = new Item("Laptop", 1000.0, 1);
        Item item2 = new Item("Mouse", 50.0, 2);

        // Create order
        Order order = new Order(customer, Arrays.asList(item1, item2));

        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Execute method
        OrderProcessor processor = new OrderProcessor();
        processor.printOrderSummary(order);

        // Convert output to string
        String output = outputStream.toString();

        // Verify output
        assertTrue(output.contains("Order Summary:"));
        assertTrue(output.contains("Customer: Ahmed"));
        assertTrue(output.contains("Laptop"));
        assertTrue(output.contains("Mouse"));

        // Total before discount:
        // 1000 + (50 * 2) = 1100
        // After 10% discount = 990
        assertTrue(output.contains("Total Price: $990.00"));
    }
}