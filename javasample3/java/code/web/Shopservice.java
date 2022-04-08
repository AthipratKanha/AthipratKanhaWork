package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ShopService
{
    @RequestMapping("/list-shop")
    ArrayList m() throws ClassNotFoundException, SQLException
    {
        ArrayList a = new ArrayList();
        
         String source = "jdbc:mysql://localhost/market" + 
                        "?user=james&password=bond";
        String sql = "select * from shop";
        try {
    
            Class.forName("com.mysql.cj.jdbc.Driver");
     
            Connection c = DriverManager.getConnection(source);
            PreparedStatement p = c.prepareStatement(sql);
            ResultSet r = p.executeQuery();
            while (r.next());
            {
            String name = r.getString("name");
            int number = r.getInt("number");
            double area = r.getDouble("area");
            Shop s = new Shop(number, name, area);
            a.add(s);
            }
            r.close(); p.close(); c.close();
        
        } catch (Exception e) {
            System.out.println(e);
        }
        return a;
    }
}

        

record Shop(int number, String name, double area) { }
