/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static dao.DBContext.con;
import model.Khachhang;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class KhachhangDAO extends DBContext {

    public List<Khachhang> getListKhachhang() {
        List<Khachhang> result = new ArrayList<Khachhang>();
        String sql = "SELECT * FROM Khachhang";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Khachhang a = new Khachhang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6));
                result.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
//    public List<Student> getListStudentQT23(String ClassID) {
//        List<Student> result = new ArrayList<Student>();
//        String sql = "SELECT * FROM Students WHERE ClassID=?";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1,ClassID);
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//                Student a = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
//                result.add(a);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
// Tìm 1 student
public Khachhang getKhachhangByMakh(String Makh) {
        String sql = "SELECT * FROM Khachhang WHERE Makh =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,Makh);
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                Khachhang a = new Khachhang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6));
                return a;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static boolean addKhachhang(String Makh, String Hoten, String Ngaysinh, String Diachi, String Email,String Dienthoai) {

        try {
            String sql = "INSERT INTO Khachhang (Makh, Hoten,  Ngaysinh,Diachi,Email,Dienthoai) values (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Makh);
            ps.setString(2, Hoten);
            ps.setString(3, Ngaysinh);
            ps.setString(4, Diachi);
            ps.setString(5, Email);
            ps.setString(6, Dienthoai);
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean updateKhachhang(String Makh, String Hoten, String Ngaysinh, String Diachi, String Email,String Dienthoai) {
        try {
            String sql = "UPDATE Khachhang SET Hoten = ?, Ngaysinh = ?, Diachi = ?, Email=?,Dienthoai=? WHERE Makh = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, Hoten);
            ps.setString(2, Ngaysinh);
            ps.setString(3, Diachi);
            ps.setString(4, Email);
            ps.setString(5, Dienthoai);
            ps.setString(6, Makh);

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean deleteKhachhang(String Makh) {
        try {
            String sql = "DELETE FROM Khachhang WHERE Makh = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Makh);

            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
