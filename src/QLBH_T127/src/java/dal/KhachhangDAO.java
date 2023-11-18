/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Khachhang;
import java.sql.*;

/**
 *
 * @author minh
 */
public class KhachhangDAO extends DBContext {
    public List<Khachhang> getAll(){
        List<Khachhang> list = new ArrayList<>();
        String sql = "select * from Khachhang";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Khachhang c = new Khachhang(rs.getString("Makh"), 
                        rs.getString("Hoten"), 
                        rs.getString("Dienthoai"), 
                        rs.getString("Matk"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
   // INSERT INTO `Demo`.`Trading2022`(`id`,`name`,`describe`)VALUES(?,?,?);
    public void insert(Khachhang c){
        String sql = "Insert into Khachhang values (?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, c.getMakh());
            st.setString(2, c.getHoten());
            st.setString(3, c.getDienthoai());
            st.setString(4, c.getMatk());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public Khachhang getKhachhangById(String id){
        String sql = "select * from Khachhang where Makh = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                Khachhang c = new Khachhang(rs.getString("Makh"), 
                        rs.getString("Hoten"), 
                        rs.getString("Dienthoai"), 
                        rs.getString("Matk"));
                return c;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
    public void delete(String id){
        String sql = "DELETE FROM Khachhang WHERE Makh=?;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void update(Khachhang c){
        String sql = "UPDATE Khachhang SET `Hoten` = ?, `Dienthoai` = ?, `Matk` = ? WHERE `Makh` = ?;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);             
            st.setString(1, c.getHoten());
            st.setString(2, c.getDienthoai());
            st.setString(3, c.getMatk());
            st.setString(4, c.getMakh());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        KhachhangDAO c=new KhachhangDAO();
        List<Khachhang> list=c.getAll();
        System.out.println(list.get(0).getHoten());
    }
}
