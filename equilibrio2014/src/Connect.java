/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.*;


/**
 *
 * @author P RaVI
 */
public class Connect {
  public static Connection Connectivity()
   {
        Connection con=null;
        try
    {
        System.out.println("kaka");
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        con=DriverManager.getConnection("jdbc:oracle:thin:@PrAsHaNtRaVi:1521:XE","VSP","VKSSSPR");
         System.out.println("papa");
         return con;
        }

    catch(Exception e)
    {
        System.out.println("erron in connection"+e);
     }return null;

      }


}


