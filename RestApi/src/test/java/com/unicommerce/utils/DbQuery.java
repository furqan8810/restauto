package com.unicommerce.utils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.unicommerce.helper.BaseTest;
public class DbQuery {
    private static String executeQueryString(String query) throws SQLException {
        ResultSet resultSet = null;
        String result;
        try {
            Statement statement = ((Connection) BaseTest.connection).createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resultSet.next();
        result = resultSet.getString(1);
        return result;
    }

    private static boolean executeUpdateQueryString(String query) throws SQLException {
        boolean result = false;
        try {
            Statement statement = ((Connection) BaseTest.connection).createStatement();
            result = statement.executeUpdate(query) > 0;
            // .executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static String executeQueryWithVariable(String query) throws SQLException {
        ResultSet resultSet = null;
        String result;
        try {
            Statement statement = ((Connection) BaseTest.connection).prepareStatement(query);
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resultSet.next();
        result = resultSet.getString(1);
        return result;
    }

    private static List<String> executeQueryList(String query) throws Exception {
        List<String> list = new ArrayList<String>();
        ResultSet resultSet = null;
        try {
            Statement statement = ((Connection) BaseTest.connection).createStatement();

            resultSet = statement.executeQuery(query);

        } catch (SQLException e) {

        }
        while (resultSet.next()) {
            if (resultSet.getString(1) == null)
                list.add(resultSet.getString(1));
            else
                list.add(resultSet.getString(1).trim());
        }
        return list;
    }

    public static String getOrderStatus() throws SQLException {
        String query = "select status_code from sale_order where customer_name ='Guest' order by created desc limit 1";
        String result = executeQueryString(query);
        return result;
    }
    public static String getOrderCode() throws SQLException {
        String query = "select code from sale_order order by created desc limit 1";
        String result = executeQueryString(query);
        return result;
    }

    public static boolean deleteParty() throws SQLException {
        String query6 = "update shipping_provider_allocation_rule  set facility_id= '1014' where id=23;";
        boolean result6 = executeUpdateQueryString(query6);
        String query1 = "update user set current_facility_id =972 where id=484;";
        boolean result1 = executeUpdateQueryString(query1);
        String query3 = "delete from item_type where sku_code ='testauto';";
        boolean result3 = executeUpdateQueryString(query3);
        String query4 = "select id from facility where display_name ='testauto'";
        String result4 = executeQueryString(query4);
        String query5 = "delete from inventory_adjustment where sku_code ='testauto' and facility_id ='" + result4
                + "';";
        System.out.println(query5);
        boolean result5 = executeUpdateQueryString(query5);
        String query7 = "delete from inventory_adjustment where sku_code ='testing1212' and facility_id ='" + result4
                + "';";
        System.out.println(query7);
        boolean result7 = executeUpdateQueryString(query7);
        String query2 = "delete from party where code='testauto'";
        boolean result2 = executeUpdateQueryString(query2);

        return result2;
    }

    public static boolean addShippingRule() throws SQLException {
        String query1 = "select id from facility where display_name ='testauto'";
        String result1 = executeQueryString(query1);
        System.out.println(result1);
        String query2 = "update shipping_provider_allocation_rule  set facility_id= '" + result1 + "' where id=23;";
        System.out.println(query2);
        boolean result2 = executeUpdateQueryString(query2);
        String query3 = "update channel_property set value='false' where name='digital.signature.enabled';";
        System.out.println(query3);
        boolean result3 = executeUpdateQueryString(query3);
        return result2;
    }

    public static boolean shippingProviderMethod() throws SQLException {
        String query1 = "select id from facility where display_name ='testauto'";
        String result1 = executeQueryString(query1);
        System.out.println(result1);
        String query2 = "insert into shipping_provider_method (facility_id,shipping_method_id,shipping_provider_id,tracking_number_generation,tracking_number_threshold,enabled,created,updated) values('"
                + result1 + "',1,1159,'MANUAL',0,1,now(),now());";
        // String query2="update system_configuration set value='ITEM_SKU' where
        // facility_id = '"+result1+"' and display_name ='Traceability Level';";
        System.out.println(query2);
        boolean result2 = executeUpdateQueryString(query2);
        String query3 = "insert into shipping_provider_method (facility_id,shipping_method_id,shipping_provider_id,tracking_number_generation,tracking_number_threshold,enabled,created,updated) values('"
                + result1 + "',2,1159,'MANUAL',0,1,now(),now());";
        boolean result3 = executeUpdateQueryString(query3);
        String query4 = "insert into shipping_provider_method (facility_id,shipping_method_id,shipping_provider_id,tracking_number_generation,tracking_number_threshold,enabled,created,updated) values('"
                + result1 + "',5,1159,'MANUAL',0,1,now(),now());";
        boolean result4 = executeUpdateQueryString(query4);
        return result4;
    }

    public static boolean updateFacility() throws SQLException {
        String query1 = "select id from facility where display_name ='testauto'";
        String result1 = executeQueryString(query1);
        System.out.println(result1);
        String query2 = "update system_configuration  set value='ITEM_SKU' where facility_id = '" + result1
                + "' and display_name ='Traceability Level';";
        System.out.println(query2);
        boolean result2 = executeUpdateQueryString(query2);
        String query3 = "update system_configuration set value='false' where name='picking.via.handheld.enabled' and facility_id ='"
                + result1 + "';";
        System.out.println(query3);
        boolean result3 = executeUpdateQueryString(query3);
        return result2;
    }

    public static List<String> getBuyers() throws Exception {
        String query = "select name from buyer order by name limit 50";
        List<String> result = executeQueryList(query);
        return result;
    }
}
