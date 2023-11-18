/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public class Dondathang {
    private String Sohoadon,Makh,Manv,Ngaydathang,Tenhang;
    private int Soluong,Dongia;

    public Dondathang() {
    }

    public Dondathang(String Sohoadon, String Makh, String Manv, String Ngaydathang, String Tenhang, int Soluong, int Dongia) {
        this.Sohoadon = Sohoadon;
        this.Makh = Makh;
        this.Manv = Manv;
        this.Ngaydathang = Ngaydathang;
        this.Tenhang = Tenhang;
        this.Soluong = Soluong;
        this.Dongia = Dongia;
    }

    public String getSohoadon() {
        return Sohoadon;
    }

    public void setSohoadon(String Sohoadon) {
        this.Sohoadon = Sohoadon;
    }

    public String getMakh() {
        return Makh;
    }

    public void setMakh(String Makh) {
        this.Makh = Makh;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getNgaydathang() {
        return Ngaydathang;
    }

    public void setNgaydathang(String Ngaydathang) {
        this.Ngaydathang = Ngaydathang;
    }

    public String getTenhang() {
        return Tenhang;
    }

    public void setTenhang(String Tenhang) {
        this.Tenhang = Tenhang;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public int getDongia() {
        return Dongia;
    }

    public void setDongia(int Dongia) {
        this.Dongia = Dongia;
    }
    
}
