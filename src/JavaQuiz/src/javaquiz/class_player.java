package javaquiz;

import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class class_player {
    Connection con = null;
    
    public List tampil_data(){
        List<String> assetList = new ArrayList<String>();
        try{
            con = new class_koneksi().getConSQL();
            PreparedStatement pr = con.prepareStatement("SELECT * FROM tb_mahasiswa");
            ResultSet rs = pr.executeQuery();
            while (rs.next()){
            String sqlDate = rs.getDate("tanggal").toString();
            String levels = rs.getString("levels").toString();
            String correct = rs.getString("correct").trim();
            String incorrect = rs.getString("incorrect").trim();
            String score = rs.getString("score").trim();
            String status = rs.getString("status").trim();
            
                String[] dataField = {sqlDate,levels, correct, incorrect, score, status};
                Collections.addAll(assetList, dataField);
            }
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return assetList;
    }
    
    public String tambah_data(java.sql.Date sqlDate,String levels,String correct, String incorrect, String score, String status){
        String result = "";
        try{
            con = new class_koneksi().getConSQL();
            String str = "INSERT INTO tb_mahasiswa (tanggal, levels, correct, incorrect, score, status) values (?,?,?,?,?,?)";
            PreparedStatement pr = con.prepareStatement(str);
            
            pr.setDate(1,sqlDate);
            pr.setString(2, levels);
            pr.setString(3,correct);
            pr.setString(4,incorrect);
            pr.setString(5,score);
            pr.setString(6,status);
            
            int i = pr.executeUpdate();
            if(i!=0){
                result = "Data Berhasil Disimpan";
            }
            else{
                result = "Data Gagal Disimpan";
            }
            
            con.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return result;
    }
    
    
    public String Regex(String s){
        String result;
        if(s.matches("(?i)[a-z]+([,.\\s]+[a-z]+)*")){
            result = "true";
        }
        else{
            result = "false";
        }
        
        return result;
    }
    
    
}
