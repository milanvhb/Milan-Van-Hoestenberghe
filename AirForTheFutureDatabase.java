import java.sql.*;
import java.util.TimeZone;

public class AirForTheFutureDatabase {

    static final String driver = "com.mysql.cj.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/airforthefuture?serverTimezone=" + TimeZone.getDefault().getID();

    static final String user = "root";
    static final String pass = "project_group40";



    public static void main(String[] args)  {
        Connection conn = null;
        Statement st = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(url, user, pass);
//            st = conn.createStatement();
//            String sql = "CREATE DATABASE REGISTRATION";
//            st.executeUpdate(sql);
            System.out.println("Database created successfully");
//            PreparedStatement ps = conn.prepareStatement("INSERT INTO `airforthefuture`.`testtable` (`id`, `countries`, `Population`, `density`) VALUES ('17', 'Finland', '6000000', '90');");
//            int status = ps.executeUpdate();
//            if (status != 0) {
//            System.out.println("Database was Connected");
//            System.out.println("Record was inserted");
//        }
   }


       catch (SQLException e) {
            e.printStackTrace();
       }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(st != null)
                    st.close();
            }
            catch(SQLException e1) {

            }
            try {
                if (conn != null)
                    conn.close();
            }
            catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("Goodbye");
    }

}

//        Connection conn = null;
//        Statement st = null;
//
//        Class.forName("com.mysql.jdbc.Driver").newInstance();
//        conn = DriverManager.getConnection(url, user, pass);
//        PreparedStatement ps = conn.prepareStatement("INSERT INTO `airforthefuture`.`testtable` (`id`, `countries`, `Population`, `density`) VALUES ('15', 'Spain', '3000000', '110');");
//
//        int status = ps.executeUpdate();
//
//        if (status != 0) {
//            System.out.println("Database was Connected");
//            System.out.println("Record was inserted");
//        }
//    }

//throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException