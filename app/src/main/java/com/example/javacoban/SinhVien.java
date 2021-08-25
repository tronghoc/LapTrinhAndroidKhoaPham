package com.example.javacoban;

public class SinhVien {
    private String HoTen;
    private   String DiaChi;
    private   int NamSinh;

    public SinhVien(String hoTen, String diaChi, int namSinh) {
        HoTen = hoTen;
        DiaChi = diaChi;
        NamSinh = namSinh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }
//    public void SetNamSinh(int ns){
//        if(ns > 1999){
//            ns = 1999;
//        }
//        NamSinh = ns;
//    }
//    public int GetNamSinh(){
//        return NamSinh;
//    }
}
