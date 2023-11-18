package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author minh
 */
public class Khachhang {
    private String Makh, Hoten, Dienthoai, Matk;

    public Khachhang() {
    }

    public Khachhang(String Makh, String Hoten, String Dienthoai, String Matk) {
        this.Makh = Makh;
        this.Hoten = Hoten;
        this.Dienthoai = Dienthoai;
        this.Matk = Matk;
    }

    public String getMakh() {
        return Makh;
    }

    public void setMakh(String Makh) {
        this.Makh = Makh;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getDienthoai() {
        return Dienthoai;
    }

    public void setDienthoai(String Dienthoai) {
        this.Dienthoai = Dienthoai;
    }

    public String getMatk() {
        return Matk;
    }

    public void setMatk(String Matk) {
        this.Matk = Matk;
    }

    

    
    
    
}
