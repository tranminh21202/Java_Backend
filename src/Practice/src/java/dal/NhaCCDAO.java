/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.NhaCC;

/**
 *
 * @author lap
 */
public class NhaCCDAO extends DBContext {

    public ArrayList<NhaCC> getListNhaCC() {
        ArrayList<NhaCC> list = new ArrayList<>();
        String sql = "select * from nhacc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String maNhaCC = rs.getString(1);
                String tenNhaCC = rs.getString(2);
                String diaChi = rs.getString(3);
                String dienThoai = rs.getString(4);
                list.add(new NhaCC(maNhaCC, tenNhaCC, diaChi, dienThoai));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public void insert(NhaCC x) {
        String sql = "insert into nhacc values (?, ?, ?, ?);";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, x.getMaNhaCC());
            st.setString(2, x.getTenNhaCC());
            st.setString(3, x.getDiaChi());
            st.setString(4, x.getDienThoai());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void delete(String id) {
        try {
            String sql = "delete from nhacc where MaNhaCc = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            st.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public NhaCC getNhaCC(String id) {
        String sql = "select * from nhacc where MaNhaCc = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                NhaCC x = new NhaCC(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                return x;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public void update(NhaCC x) {
        String sql = "update nhacc set TenNhaCc = ?, DiaChi = ?, DienThoai = ? where MaNhaCc = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, x.getTenNhaCC());
            st.setString(2, x.getDiaChi());
            st.setString(3, x.getDienThoai());
            st.setString(4, x.getMaNhaCC());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int calcTK(String namThang, String maVTu) {
        try {
            String sql = "SELECT SLDau, TongSLN, TongSLX from tonkho "
                    + "WHERE NamThang = ? AND MaVTu = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, namThang);
            st.setString(2, maVTu);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                int SLDau = rs.getInt(1);
                int TongSLN = rs.getInt(2);
                int TongSLX = rs.getInt(3);

                return SLDau + TongSLN - TongSLX;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }
    
    public Map showKQ() {
        String sql = "select VATTU.tenvtu as tenvtu , CTDONDH.sldat as sldat from "
                + "VATTU inner join CTDONDH ON VATTU.mavtu = CTDONDH.mavtu \n"
                + "inner join DONDH ON CTDONDH.sodh = DONDH.sodh "
                + "where DONDH.ngaydh >='2023-02-01' and  DONDH.ngaydh<='2023-02-28'; ";
        Map<String, Integer> dataMap = new HashMap<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                String tenvtu = rs.getString("tenvtu");
                int sldat = rs.getInt("sldat");
                dataMap.put(tenvtu, sldat);
            }
        } catch (SQLException e) {
            System.out.println("loi");
        }
        return  dataMap;
    }
}
