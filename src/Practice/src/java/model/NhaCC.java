/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lap
 */
public class NhaCC {

    private String maNhaCC;
    private String tenNhaCC;
    private String diaChi;
    private String dienThoai;

    public NhaCC() {
    }

    public NhaCC(String maNhaCC, String tenNhaCC, String diaChi, String dienThoai) {
        this.maNhaCC = maNhaCC;
        this.tenNhaCC = tenNhaCC;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
    }

    public String getMaNhaCC() {
        return maNhaCC;
    }

    public void setMaNhaCC(String maNhaCC) {
        this.maNhaCC = maNhaCC;
    }

    public String getTenNhaCC() {
        return tenNhaCC;
    }

    public void setTenNhaCC(String tenNhaCC) {
        this.tenNhaCC = tenNhaCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

}
