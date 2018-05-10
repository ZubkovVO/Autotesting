package zubkov.appliances.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnectTest {

    private Connection con;
    private Statement st;
    private ResultSet rs;


    public DBConnectTest(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appliancesdb" +
                    "?verifyServerCertificate=false"+
                    "&useSSL=false"+
                    "&requireSSL=false"+
                    "&useLegacyDatetimeCode=false"+
                    "&amp"+
                    "&serverTimezone=UTC","root","StiWlq=g$FrL=9");
            st = con.createStatement();

        } catch (Exception ex){
            System.out.println("Erro: " +ex);
        }
    }

    public void getData(){
        try{
            String query = "select * from homeappl";
            rs = st.executeQuery(query);
            System.out.println("Records from Database");
            while (rs.next()){
                String id=rs.getString("id");
                String type = rs.getString("type");
                String watt = rs.getString("watt");
                String size = rs.getString("size");
                String model = rs.getString("model");
                System.out.println("Id: " + id+"  "+"type: "+type+"  "+"Watt: "+watt+"  "+"size: "+size+
                        " model: "+model);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
