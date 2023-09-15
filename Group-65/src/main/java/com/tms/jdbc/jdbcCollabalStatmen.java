package com.tms.jdbc;

import java.sql.*;

public class jdbcCollabalStatmen {
    public static void main(String[] args) {
        Connection collection;
        try {
            Class.forName("org.postgresql.Driver");

            collection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Group-65", "postgres", "root"); //URL(host,port,database
            CallableStatement statement = collection.prepareCall("{call find_max_salary_by_age(?)}");
            statement.registerOutParameter(1, Types.INTEGER);
            statement.setInt(1, 37);
            statement.execute();
            int result = statement.getInt(1);
            System.out.println(result);

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
    }
