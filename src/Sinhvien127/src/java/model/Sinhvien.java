package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author minh
 */
public class Sinhvien {
    private String Masv, Hoten, Ngaysinh, Gioitinh, Malop;

    public Sinhvien() {
    }

    public Sinhvien(String Masv, String Hoten, String Ngaysinh, String Gioitinh, String Malop) {
        this.Masv = Masv;
        this.Hoten = Hoten;
        this.Ngaysinh = Ngaysinh;
        this.Gioitinh = Gioitinh;
        this.Malop = Malop;
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
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

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getMalop() {
        return Malop;
    }

    public void setMalop(String Malop) {
        this.Malop = Malop;
    }
    
}
