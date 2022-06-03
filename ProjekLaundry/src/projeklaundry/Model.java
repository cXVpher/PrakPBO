package projeklaundry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Model {
    public Connection koneksi;
    public Statement statement;
    private final String url = "jdbc:mysql://localhost:3306/laundrywasweswos";
    private final String username = "root";
    private final String pass = "";
    
    public Model() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = (Connection)DriverManager.getConnection(url, username, pass);
            
            
            System.out.println("Koneksi Sukses");
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
            JOptionPane.showMessageDialog(null, "Koneksi Gagal!");
            System.exit(0);
        }
    }
    
    public String[][] DataCustomer(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getBanyakData()][5]; //baris, kolom nya ada 4
            
            String query = "Select * from data"; 
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("cust"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("barang");                
                data[jmlData][2] = resultSet.getString("berat");
                data[jmlData][3] = resultSet.getString("harga");
                data[jmlData][4] = resultSet.getString("total");
                jmlData++;
            }
            
            statement.close();
            return data;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public void insertData(String cust, String barang, double berat, double harga){
        int jmlData=0;
        double total = (berat*harga);
        try {
            String query = "Select * from data WHERE cust = '" + cust + "' "; 
            System.out.println(cust + " " + barang + " " + berat + " " + harga + " " + total);
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){ 
                jmlData++;
            }
            
            if(jmlData==0) {
                query = "INSERT INTO data VALUES('" + cust + "','" + barang + "','" + berat + "','" + harga + "','" + total + "')";
           
                
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
            }else {
                JOptionPane.showMessageDialog(null, "Data sudah ada");
            }
        }catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public void updateData(String cust, String barang, double berat, double harga){
        int jmlData=0;
        double total = (berat*harga); 
        try {
           String query = "Select * from data WHERE cust= '" + cust + "' "; 
           statement = koneksi.createStatement();
           ResultSet resultSet = statement.executeQuery(query);
           
            while (resultSet.next()){
                jmlData++;
            }
           
            if (jmlData==1) {
                query = "UPDATE data SET barang='" + barang + "', berat='" + berat + "', total='" + total + "', harga = '" + harga +"' WHERE cust='" + cust +"'";
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil diupdate");
                JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
            }else {
                 JOptionPane.showMessageDialog(null, "Data Tidak Ada");
            }
        }catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public int getBanyakData(){
        int jmlData = 0;
        try{
            String query = "Select * from data";
            statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()){
                jmlData++;
            }
            
            statement.close();
            
            return jmlData;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public void bayarData (String cust) {
        try{
            String query = "DELETE FROM data WHERE cust = '"+cust+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dibayar");
        }catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
}
