package com.vn.devmaster.sevice.depenment.Student;

import lombok.Data;
import lombok.Setter;

@Data
public class SinhVien {
    private int id;
    private String ten;
    private int tuoi;
    private String diaChi;
    private double diemTrungBinh;

    public SinhVien(int id, String ten, int tuoi, String diaChi, double diemTrungBinh) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int layId() {
        return id;
    }

    public String layTen() {
        return ten;
    }

    public int layTuoi() {
        return tuoi;
    }

    public String layDiaChi() {
        return diaChi;
    }

    public double layDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void datDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Tên: " + ten + ", Tuổi: " + tuoi + ", Địa chỉ: " + diaChi + ", Điểm trung bình: " + diemTrungBinh;
    }
}