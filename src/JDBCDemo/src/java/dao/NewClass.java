/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author minh
 */

import model.Khachhang;
import java.util.List;
/**
 *
 * @author BVCN 88
 */
public class NewClass {
    public static void main(String[] args) {
        KhachhangDAO accountDAO = new KhachhangDAO();
        List<Khachhang> list = accountDAO.getListKhachhang();
        for (Khachhang a:list){
            System.out.println("username:"+a.getHoten()+" password:"+a.getNgaysinh());
        }
    }
}