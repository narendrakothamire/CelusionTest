package com.example.narendra.celusiontest.db;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ORDER.
*/
public class OrderDao extends AbstractDao<CustomerOrder, Integer> {

    public static final String TABLENAME = "ORDER";

    /**
     * Properties of entity CustomerOrder.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property OrderID = new Property(0, Integer.class, "OrderID", true, "ORDER_ID");
        public final static Property EmployeeID = new Property(1, Integer.class, "EmployeeID", false, "EMPLOYEE_ID");
        public final static Property OrderDate = new Property(2, String.class, "OrderDate", false, "ORDER_DATE");
        public final static Property RequiredDate = new Property(3, String.class, "RequiredDate", false, "REQUIRED_DATE");
        public final static Property ShippedDate = new Property(4, String.class, "ShippedDate", false, "SHIPPED_DATE");
        public final static Property ShipVia = new Property(5, Integer.class, "ShipVia", false, "SHIP_VIA");
        public final static Property Freight = new Property(6, Float.class, "Freight", false, "FREIGHT");
        public final static Property ShipName = new Property(7, String.class, "ShipName", false, "SHIP_NAME");
        public final static Property ShipAddress = new Property(8, String.class, "ShipAddress", false, "SHIP_ADDRESS");
        public final static Property ShipCity = new Property(9, String.class, "ShipCity", false, "SHIP_CITY");
        public final static Property ShipRegion = new Property(10, String.class, "ShipRegion", false, "SHIP_REGION");
        public final static Property ShipPostalCode = new Property(11, Integer.class, "ShipPostalCode", false, "SHIP_POSTAL_CODE");
        public final static Property ShipCountry = new Property(12, String.class, "ShipCountry", false, "SHIP_COUNTRY");
        public final static Property CustomerID = new Property(13, String.class, "CustomerID", true, "CUSTOMER_ID");
    };

    private Query<CustomerOrder> customer_OrderListQuery;

    public OrderDao(DaoConfig config) {
        super(config);
    }
    
    public OrderDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'CUSTOMER_ORDER' (" + //
                "'ORDER_ID' INTEGER PRIMARY KEY ," + // 0: OrderID
                "'EMPLOYEE_ID' INTEGER," + // 1: EmployeeID
                "'ORDER_DATE' TEXT," + // 2: OrderDate
                "'REQUIRED_DATE' TEXT," + // 3: RequiredDate
                "'SHIPPED_DATE' TEXT," + // 4: ShippedDate
                "'SHIP_VIA' INTEGER," + // 5: ShipVia
                "'FREIGHT' REAL," + // 6: Freight
                "'SHIP_NAME' TEXT," + // 7: ShipName
                "'SHIP_ADDRESS' TEXT," + // 8: ShipAddress
                "'SHIP_CITY' TEXT," + // 9: ShipCity
                "'SHIP_REGION' TEXT," + // 10: ShipRegion
                "'SHIP_POSTAL_CODE' INTEGER," + // 11: ShipPostalCode
                "'SHIP_COUNTRY' TEXT," + // 12: ShipCountry
                "'CUSTOMER_ID' TEXT,"+
        "FOREIGN KEY(CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID))"); // 13: CustomerID
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ORDER'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, CustomerOrder entity) {
        stmt.clearBindings();
 
        Integer OrderID = entity.getOrderID();
        if (OrderID != null) {
            stmt.bindLong(1, OrderID);
        }
 
        Integer EmployeeID = entity.getEmployeeID();
        if (EmployeeID != null) {
            stmt.bindLong(2, EmployeeID);
        }
 
        String OrderDate = entity.getOrderDate();
        if (OrderDate != null) {
            stmt.bindString(3, OrderDate);
        }
 
        String RequiredDate = entity.getRequiredDate();
        if (RequiredDate != null) {
            stmt.bindString(4, RequiredDate);
        }
 
        String ShippedDate = entity.getShippedDate();
        if (ShippedDate != null) {
            stmt.bindString(5, ShippedDate);
        }
 
        Integer ShipVia = entity.getShipVia();
        if (ShipVia != null) {
            stmt.bindLong(6, ShipVia);
        }
 
        Float Freight = entity.getFreight();
        if (Freight != null) {
            stmt.bindDouble(7, Freight);
        }
 
        String ShipName = entity.getShipName();
        if (ShipName != null) {
            stmt.bindString(8, ShipName);
        }
 
        String ShipAddress = entity.getShipAddress();
        if (ShipAddress != null) {
            stmt.bindString(9, ShipAddress);
        }
 
        String ShipCity = entity.getShipCity();
        if (ShipCity != null) {
            stmt.bindString(10, ShipCity);
        }
 
        String ShipRegion = entity.getShipRegion();
        if (ShipRegion != null) {
            stmt.bindString(11, ShipRegion);
        }
 
        Integer ShipPostalCode = entity.getShipPostalCode();
        if (ShipPostalCode != null) {
            stmt.bindLong(12, ShipPostalCode);
        }
 
        String ShipCountry = entity.getShipCountry();
        if (ShipCountry != null) {
            stmt.bindString(13, ShipCountry);
        }
    }

    /** @inheritdoc */
    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public CustomerOrder readEntity(Cursor cursor, int offset) {
        CustomerOrder entity = new CustomerOrder( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // OrderID
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // EmployeeID
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // OrderDate
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // RequiredDate
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // ShippedDate
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // ShipVia
            cursor.isNull(offset + 6) ? null : cursor.getFloat(offset + 6), // Freight
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // ShipName
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // ShipAddress
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // ShipCity
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // ShipRegion
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11), // ShipPostalCode
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12) // ShipCountry
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, CustomerOrder entity, int offset) {
        entity.setOrderID(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setEmployeeID(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setOrderDate(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setRequiredDate(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setShippedDate(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setShipVia(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setFreight(cursor.isNull(offset + 6) ? null : cursor.getFloat(offset + 6));
        entity.setShipName(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setShipAddress(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setShipCity(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setShipRegion(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setShipPostalCode(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
        entity.setShipCountry(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
     }
    
    /** @inheritdoc */
    @Override
    protected Integer updateKeyAfterInsert(CustomerOrder entity, long rowId) {
        return entity.getOrderID();
    }
    
    /** @inheritdoc */
    @Override
    public Integer getKey(CustomerOrder entity) {
        if(entity != null) {
            return entity.getOrderID();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "orderList" to-many relationship of Customer. */
    public List<CustomerOrder> _queryCustomer_OrderList(String CustomerID) {
        synchronized (this) {
            if (customer_OrderListQuery == null) {
                QueryBuilder<CustomerOrder> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.CustomerID.eq(null));
                customer_OrderListQuery = queryBuilder.build();
            }
        }
        Query<CustomerOrder> query = customer_OrderListQuery.forCurrentThread();
        query.setParameter(0, CustomerID);
        return query.list();
    }

}
