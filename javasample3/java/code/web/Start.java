package web;

import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class Start
{
    public static void main(String[] data)
    {
        String source = "jdbc:mysql://localhost/market" + 
                        "?user=james&password=bond";
        String sql = "select * from shop";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
     
            Connection c = DriverManager.getConnection(source);
            PreparedStatement p = c.prepareStatement(sql);
            ResultSet r = p.executeQuery();
            while (r.next());
            {
            String name = r.getString("name");
            System.out.println(name);
            }
            r.close(); p.close(); c.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
