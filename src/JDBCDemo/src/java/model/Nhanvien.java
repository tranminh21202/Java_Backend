/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public class Nhanvien {
    private String Manv,Hoten,Ngaysinh,Noisinh,Dienthoai;

    public Nhanvien() {
    }

    public Nhanvien(String Manv, String Hoten, String Ngaysinh, String Noisinh, String Dienthoai) {
        this.Manv = Manv;
        this.Hoten = Hoten;
        this.Ngaysinh = Ngaysinh;
        this.Noisinh = Noisinh;
        this.Dienthoai = Dienthoai;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getNoisinh() {
        return Noisinh;
    }

    public void setNoisinh(String Noisinh) {
        this.Noisinh = Noisinh;
    }

    public String getDienthoai() {
        return Dienthoai;
    }

    public void setDienthoai(String Dienthoai) {
        this.Dienthoai = Dienthoai;
    }
    
}
