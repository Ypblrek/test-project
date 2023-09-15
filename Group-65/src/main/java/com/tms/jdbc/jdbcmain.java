package com.tms.jdbc;


import java.sql.*;
import java.util.ArrayList;

import com.tms.jdbc.User;

public class jdbcmain {
    public static void main(String[] args) {
//        Connection collection = null;
        try {
            Class.forName("org.postgresql.Driver");
            Connection collection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Group-65", "postgres", "root"); //URL(host,port,database

//            PreparedStatement statement = collection.prepareStatement("SELECT * FROM users");
            PreparedStatement statement = collection.prepareStatement("UPDATE  users SET age=? WHERE id=?");
            statement.setInt(1,45);
            statement.setLong(2,1);


//     boolean result =  statement.execute();// выполняет но невыводит результат дает (только true/false)
//            System.out.println(result);
       int result  =  statement.executeUpdate(); //- сколько строк изменилось.
            System.out.println(result);
//            ResultSet resultSet = statement.executeQuery();// выполняет действие

//            ArrayList<User> userList = new ArrayList<>();
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("id"));
//                user.setUsername(resultSet.getString("username"));
//                user.setIsAdult(resultSet.getBoolean("it_adult"));
//                user.setAge(resultSet.getInt("age"));
//                userList.add(user);
////                   while (resultSet.next()){
////                       System.out.println(resultSet.getLong("id"));
//            }
//            System.out.println(userList);
//                   System.out.println(resultSet.getLong("id"));
//                   System.out.println(resultSet.getString("username"));
//                   System.out.println(resultSet.getBoolean("it_adult"));
//                   System.out.println(resultSet.getInt("age"));

//            System.out.println(statement.execute());

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
//        finally {
//            collection.close();
//        }

    }
}

