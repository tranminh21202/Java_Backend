/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Category;
import java.sql.*;

/**
 *
 * @author minh
 */
public class CategoryDAO extends DBContext {
    public List<Category> getAll(){
        List<Category> list = new ArrayList<>();
        String sql = "select * from Trading2022";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Category c = new Category(rs.getInt("id"), rs.getString("name"), rs.getString("describe"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
   // INSERT INTO `Demo`.`Trading2022`(`id`,`name`,`describe`)VALUES(?,?,?);
    public void insert(Category c){
        String sql = "INSERT INTO `Demo`.`Trading2022`(`id`,`name`,`describe`)VALUES(?,?,?);";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, c.getId());
            st.setString(2, c.getName());
            st.setString(3, c.getDescribe());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public Category getCategoryById(int id){
        String sql = "select * from Trading2022 where id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                Category c = new Category(rs.getInt("id"), rs.getString(("name")), rs.getString("describe"));
                return c;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
    public void delete(int id){
        String sql = "DELETE FROM `Demo`.`Trading2022`WHERE id=?;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void update(Category c){
        String sql = "UPDATE `Demo`.`Trading2022` SET `name` = ?,`describe` = ? WHERE `id` = ?;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, c.getName());
            st.setString(2, c.getDescribe());
            st.setInt(3, c.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        CategoryDAO c=new CategoryDAO();
        List<Category> list=c.getAll();
        System.out.println(list.get(0).getName());
    }
}
