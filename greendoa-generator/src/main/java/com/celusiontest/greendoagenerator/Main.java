package com.celusiontest.greendoagenerator;

import java.io.IOException;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Property;
import de.greenrobot.daogenerator.Schema;

public class Main {
    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(1, "com.example.narendra.celusiontest.db");

        Entity customer = schema.addEntity("Customer");

        Property customerIdProperty = customer.addStringProperty("CustomerID").primaryKey().getProperty();
        customer.addStringProperty("ContactName");
        customer.addStringProperty("ContactTitle");
        customer.addStringProperty("phone");
        customer.addStringProperty("CompanyName");
        customer.addStringProperty("Region");
        customer.addStringProperty("Fax");
        customer.addStringProperty("Address");
        customer.addStringProperty("Country");
        customer.addStringProperty("City");
        customer.addIntProperty("PostalCode");


        Entity order = schema.addEntity("Order");

        order.addIntProperty("OrderID").primaryKey();
        order.addIntProperty("EmployeeID");
        order.addStringProperty("OrderDate");
        order.addStringProperty("RequiredDate");
        order.addStringProperty("ShippedDate");
        order.addIntProperty("ShipVia");
        order.addFloatProperty("Freight");
        order.addStringProperty("ShipName");
        order.addStringProperty("ShipAddress");
        order.addStringProperty("ShipCity");
        order.addStringProperty("ShipRegion");
        order.addIntProperty("ShipPostalCode");
        order.addStringProperty("ShipCountry");
        customer.addToMany(order, customerIdProperty);

        new DaoGenerator().generateAll(schema, "./app/src/main/java");
    }
}
