/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Sinhvien;
import java.sql.*;

/**
 *
 * @author minh
 */
public class SinhvienDAO extends DBContext {
    public List<Sinhvien> getAll(){
        List<Sinhvien> list = new ArrayList<>();
        String sql = "select * from sinhvien";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Sinhvien c = new Sinhvien(rs.getString("Masv"), rs.getString("Hoten"), rs.getString("Ngaysinh"), rs.getString("Gioitinh"), rs.getString("Malop"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
   // INSERT INTO `Demo`.`Trading2022`(`id`,`name`,`describe`)VALUES(?,?,?);
    public void insert(Sinhvien c){
        String sql = "Insert into Sinhvien values (?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, c.getMasv());
            st.setString(2, c.getHoten());
            st.setString(3, c.getNgaysinh());
            st.setString(4, c.getGioitinh());
            st.setString(5, c.getMalop());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public Sinhvien getSinhvienById(String id){
        String sql = "select * from Sinhvien where Masv = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                Sinhvien c = new Sinhvien(rs.getString("Masv"), rs.getString("Hoten"), rs.getString("Ngaysinh"), rs.getString("Gioitinh"), rs.getString("Malop"));
                return c;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
    public void delete(String id){
        String sql = "DELETE FROM Sinhvien WHERE Masv=?;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void update(Sinhvien c){
        String sql = "UPDATE sinhvien SET `Hoten` = ?,`Ngaysinh` = ?, `Gioitinh` = ?, `Malop` = ? WHERE `Masv` = ?;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);           
            st.setString(1, c.getHoten());
            st.setString(2, c.getNgaysinh());
            st.setString(3, c.getGioitinh());
            st.setString(4, c.getMalop());
            st.setString(5, c.getMasv());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        SinhvienDAO c=new SinhvienDAO();
        List<Sinhvien> list=c.getAll();
        System.out.println(list.get(0).getHoten());
    }
}
