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
                        rs.getString("Ngaysinh"), 
                        rs.getString("Diachi"), 
                        rs.getString("Email"), rs.getString("Dienthoai"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
   // INSERT INTO `Demo`.`Trading2022`(`id`,`name`,`describe`)VALUES(?,?,?);
    public void insert(Khachhang c){
        String sql = "Insert into Khachhang values (?,?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, c.getMakh());
            st.setString(2, c.getHoten());
            st.setString(3, c.getNgaysinh());
            st.setString(4, c.getDiachi());
            st.setString(5, c.getEmail());
            st.setString(6, c.getDienthoai());
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
                        rs.getString("Ngaysinh"), 
                        rs.getString("Diachi"), 
                        rs.getString("Email"), rs.getString("Dienthoai"));
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
        String sql = "UPDATE Khachhang SET `Hoten` = ?,`Ngaysinh` = ?, `Diachi` = ?, `Email` = ?, `Dienthoai` = ? WHERE `Makh` = ?;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);           
            
            st.setString(1, c.getHoten());
            st.setString(2, c.getNgaysinh());
            st.setString(3, c.getDiachi());
            st.setString(4, c.getEmail());
            st.setString(5, c.getDienthoai());
            st.setString(6, c.getMakh());
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
