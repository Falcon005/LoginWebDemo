package dao;

import java.sql.*;
import java.util.Stack;

public class LoginDao {
    private String sql="select * from login where uname=? and pass=?";
    private final String url="jdbc:postgresql://localhost:5432/navin";
    private final String username="postgres";
    private final String password="1404";

    public boolean check(String uname,String pass){
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,uname);
            preparedStatement.setString(2,pass);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


        return false;
    }
}
