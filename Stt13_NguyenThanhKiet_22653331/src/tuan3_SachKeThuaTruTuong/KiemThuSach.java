package tuan3_SachKeThuaTruTuong;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class KiemThuSach {
	static QLSach sas;
	static Sach sa;
	public static void main(String[] args) throws Exception {
		System.out.println("Chuong Trinh Quan Ly Sach");
		sas = new QLSach();
		ArrayList<Sach> DS = sas.getSach();
		int opt ;
		do {
			opt =  menu();
			switch(opt) {
			case 1:{
				nhapcung();
				DS = sas.getSach();
				Xuat(DS);
				break;
			}
			case 2:{
				them();
				sas.them(sa);
				
				DS = sas.getSach();
				Xuat(DS);
				break;
			}
			case 3:{
				xoa();
				DS = sas.getSach();
				Xuat(DS);
				break;
			}
			case 4:{
				sua();
				DS = sas.getSach();
				Xuat(DS);
				break;
			}
			case 5:{
				System.out.println("Mảng sau khi đã sắp xếp ");
				sas.sortMaSach();
				DS = sas.getSach();
				Xuat(DS);
				
				break;

			}
			case 6:{
				System.out.println("GOOD BYE");
				break;
			}
			}

		}while(opt != 6);
	}

	static int menu()
	{
		int chon ;
		System.out.println("****MENU****\n"+
				"1.Nhập Cứng\n"+
				"2.Thêm  \n"+
				"3.Xóa \n"
				+ "4.Cập Nhật\n"
				+ "5.Sắp xếp\n"
				+ "6.Thoát");
		chon = nhapSoNguyen("Mời Bạn Chọn");
		return chon;
	}
	static int nhapSoNguyen(String str) 
	{
		int x;
		System.out.println(str);
		Scanner scn=new Scanner(System.in);
		x= scn.nextInt();

		return x;
	}
	
	static void xoa() {

		int maSach = inputInt("Nhap Ma Sach Can Xoa ");
		Sach sa = sas.timKiem(maSach);
		if(sa != null) {
			String acp = inputString("Ban co muon xoa ko(y/Y)");
			if(acp.equalsIgnoreCase("y")) {
				sas.xoa(sa);
				System.out.println("Da Xoa Thanh Cong");
			} else {
				System.out.println("Xoa That Bai");
			}
		} else 
			System.out.println("Khong ton tai Sach nay");
	}
	
	static void sua() {
		int maSach = inputInt("Nhap Ma Sach Can Sua");
		Sach sa = sas.timKiem(maSach);
		if(sa == null)
			System.out.println("Khong ton tai sach nay");
		else {
			if (sa instanceof SachGiaoKhoa) {
				SachGiaoKhoa sas = (SachGiaoKhoa) sa;
				System.out.println("Trước khi sửa \n" + sas);
				String nXB = inputString("Nhap Ten Nha Xuat Ban");
				sas.setnXB(nXB);
				int soLuong = inputInt("Nhap So Luong");
				sas.setSoLuong(soLuong);
				double donGia = inputDouble("Nhap Don Gia");
				sas.setDonGia(donGia);
				LocalDate ngNhap = inputDate("Nhap Ngay Nhap");
				sas.setNgayNhap(ngNhap);
			}
			else {
				SachThamKhao sas = (SachThamKhao) sa;
				System.out.println("Trước khi sửa \n" + sas);
				String nXB = inputString("Nhap Ten Nha Xuat Ban");
				sas.setnXB(nXB);
				int soLuong = inputInt("Nhap So Luong");
				sas.setSoLuong(soLuong);
				double donGia = inputDouble("Nhap Don Gia");
				sas.setDonGia(donGia);
				LocalDate ngNhap = inputDate("Nhap Ngay Nhap");
				sas.setNgayNhap(ngNhap);
				double tax = inputDouble("Nhap Thue");
				sas.setTax(tax);
			}
		}
	}
	
	static Sach them() {
		int maSach, soLuong;
		String nXB;
		LocalDate ngNhap;
		double donGia;
		maSach = inputInt("Nhap Ma Sach");
		if(sas.timKiemVitri(maSach) != 1) {
			soLuong = inputInt("Nhap So Luong");
			nXB = inputString("Nhap Nha Xuat Ban");
			donGia = inputDouble("Nhap Don Gia");
			ngNhap = inputDate("Nhap Ngay Nhap");
			System.out.println("Nhap Sach Giao Khoa [1] hoac Sach Tham Khao [2]");
			int chon = nhapSoNguyen("Chon");
			if(chon == 1) {
				Boolean tinhTrang = inputBoolean("Nhap Tinh Trang");
				sa = new SachGiaoKhoa(maSach, soLuong, nXB, donGia, ngNhap, tinhTrang);					 
			} else {
				double tax = inputDouble("Nhap Thue");
				sa = new SachThamKhao(maSach, soLuong, nXB, donGia, ngNhap, tax);
			}				 
		}
		return sa;
	}
	
	static void nhapcung() throws Exception {
		Sach s1, s2 ,s3, s4;
		s1 = new SachThamKhao(1001, 2, "Nguyen Van A", 120000, LocalDate.of(2022,06,16), 0.05);
		s2 = new SachThamKhao(1004, 4, "Nguyen Van B", 150000, LocalDate.of(2022,05,16), 0.03);
		s3 = new SachGiaoKhoa(1002, 1, "Nguyen Van c", 1200000, LocalDate.of(2022,05,26), true);
		s4 = new SachGiaoKhoa(1003, 7, "Nguyen Van DS", 1020000, LocalDate.of(2023,05,16), false);
		sas.them(s1);
		sas.them(s2);
		sas.them(s3);
		sas.them(s4);	
	}
	
	static String inputString (String s) { 
		String str;
		System.out.println(s);
		Scanner sn = new Scanner(System.in);
		str = sn.nextLine();
		return str;
	}
	static double inputDouble(String s) {
		double numDouble;
		System.out.println(s);
		Scanner sn = new Scanner(System.in);
		numDouble = sn.nextFloat();
		return numDouble;
	}
	static int inputInt(String s) {
		int numInt;
		System.out.println(s);
		Scanner sn = new Scanner(System.in);
		numInt = sn.nextInt();
		return numInt;
	}

	static void Xuat(ArrayList<Sach> dS) {
		for(Sach sa : sas.DS)
			System.out.println(sa);
	}

	public static LocalDate inputDate (String s) {
		System.out.println(s);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate date = LocalDate.parse(inputString(""), f);
        return date;
	}
	
	static boolean inputBoolean(String s) {
		boolean bool;
		System.out.println(s);
		Scanner sn = new Scanner(System.in);
		bool = sn.nextBoolean();
		return bool;
	}
}
