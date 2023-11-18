/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static dao.DBContext.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Dondathang;

/**
 *
 * @author Asus
 */
public class DondathangDAO extends DBContext{
    public List<Dondathang> getListHD() {
        List<Dondathang> result = new ArrayList<Diemthi>();
        String sql = "SELECT * FROM Diemthi";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Diemthi a = new Diemthi(rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getFloat(4));
                result.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
