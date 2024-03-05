package com.vn.devmaster.sevice.depenment.Student;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
@Data
public class MainStudent {
    private ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MainStudent quanLy = new MainStudent();
        quanLy.chayChuongTrinh();
    }

    private void chayChuongTrinh() {
        int luaChon;
        do {
            hienThiMenu();
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    themSinhVien();
                    break;
                case 2:
                    suaThongTinSinhVien();
                    break;
                case 3:
                    xoaSinhVien();
                    break;
                case 4:
                    hienThiDanhSachSinhVien();
                    break;
                case 5:
                    sapXepSinhVienTheoDiemTB();
                    break;
                case 6:
                    sapXepSinhVienTheoTen();
                    break;
                case 0:
                    System.out.println("Đang thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (luaChon != 0);
    }

    private void hienThiMenu() {
        System.out.println("/****************************************/");
        System.out.println("1. Thêm sinh viên.");
        System.out.println("2. Sửa thông tin sinh viên theo ID.");
        System.out.println("3. Xóa sinh viên theo ID.");
        System.out.println("4. Hiển thị danh sách sinh viên.");
        System.out.println("5. Sắp xếp sinh viên theo điểm trung bình.");
        System.out.println("6. Sắp xếp sinh viên theo tên.");
        System.out.println("0. Thoát.");
        System.out.println("/****************************************/");
        System.out.print("Nhập lựa chọn của bạn: ");
    }

    private void themSinhVien() {
        System.out.print("Nhập ID sinh viên: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập tuổi sinh viên: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập địa chỉ sinh viên: ");
        String diaChi = scanner.nextLine();
        System.out.print("Nhập điểm trung bình của sinh viên: ");
        double diemTrungBinh = scanner.nextDouble();
        danhSachSinhVien.add(new SinhVien(id, ten, tuoi, diaChi, diemTrungBinh));
        System.out.println("Đã thêm sinh viên thành công.");
    }

    private void suaThongTinSinhVien() {
        System.out.print("Nhập ID sinh viên cần sửa: ");
        int id = scanner.nextInt();
        int index = timViTriSinhVienTheoId(id);
        if (index != -1) {
            System.out.println("Nhập điểm trung bình mới: ");
            double diemTrungBinhMoi = scanner.nextDouble();
            danhSachSinhVien.get(index).datDiemTrungBinh(diemTrungBinhMoi);
            System.out.println("Đã cập nhật điểm trung bình của sinh viên thành công.");
        } else {
            System.out.println("Không tìm thấy sinh viên.");
        }
    }

    private void xoaSinhVien() {
        System.out.print("Nhập ID sinh viên cần xóa: ");
        int id = scanner.nextInt();
        int index = timViTriSinhVienTheoId(id);
        if (index != -1) {
            danhSachSinhVien.remove(index);
            System.out.println("Đã xóa sinh viên thành công.");
        } else {
            System.out.println("Không tìm thấy sinh viên.");
        }
    }

    private void hienThiDanhSachSinhVien() {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Không có sinh viên để hiển thị.");
        } else {
            System.out.println("Danh sách sinh viên:");
            for (SinhVien sinhVien : danhSachSinhVien) {
                System.out.println(sinhVien);
            }
        }
    }

    private void sapXepSinhVienTheoDiemTB() {
        Collections.sort(danhSachSinhVien, Comparator.comparingDouble(SinhVien::layDiemTrungBinh).reversed());
        System.out.println("Đã sắp xếp danh sách sinh viên theo điểm trung bình.");
        hienThiDanhSachSinhVien();
    }

    private void sapXepSinhVienTheoTen() {
        Collections.sort(danhSachSinhVien, Comparator.comparing(SinhVien::layTen));
        System.out.println("Đã sắp xếp danh sách sinh viên theo tên.");
        hienThiDanhSachSinhVien();
    }

    private int timViTriSinhVienTheoId(int id) {
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            if (danhSachSinhVien.get(i).layId() == id) {
                return i;
            }
        }
        return -1;
    }
}
