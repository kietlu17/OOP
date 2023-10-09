package tuan3_ChuyenXe;

import java.util.ArrayList;
import java.util.Scanner;

public class KiemThuChuyenXe {
	static DanhSachChuyenXe xes;
	static ChuyenXe cXe;
	public static void main(String[] args) throws Exception {
		System.out.println("Chuong Trinh Chuyen Xe");
		xes = new DanhSachChuyenXe();
		ArrayList<ChuyenXe> DS = xes.getDS();
		int opt ;
		do {
			opt =  menu();
			switch(opt) {
			case 1:{
				nhapcung();
				DS = xes.getDS();
				Xuat(DS);
				break;
			}
			case 2:{
				them();
				DS = xes.getDS();
				Xuat(DS);
				break;
			}
			case 3:{
				xoa();
				DS = xes.getDS();
				Xuat(DS);
				break;
			}
			case 4:{
				sua();
				DS = xes.getDS();
				Xuat(DS);
				break;
			}
			case 5:{
				System.out.println("Mảng sau khi đã sắp xếp ");
				xes.sortDoanhThu();
				DS = xes.getDS();
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

		String maCX = inputString("Nhap Ma Chuyen Xe Can Xoa ");
		ChuyenXe xe = xes.timKiem(maCX);
		if(xe != null) {
			String acp = inputString("Ban co muon xoa ko(y/Y)");
			if(acp.equalsIgnoreCase("y")) {
				xes.xoa(xe);
				System.out.println("Da Xoa Thanh Cong");
			} else {
				System.out.println("Xoa That Bai");
			}
		} else 
			System.out.println("Khong ton tai xe nay");
	}

	static void sua() {
		String maCX = inputString("Nhap Ma Chuyen Xe Can Sua");
		ChuyenXe xe = xes.timKiem(maCX);
		if(xe == null)
			System.out.println("Khong ton tai xe nay");
		else {
			if (xe instanceof NoiThanh) {
				NoiThanh xes = (NoiThanh) xe;
				System.out.println("Trước khi sửa \n" + xes);
				String tenTX = inputString("Nhap Ten Tai Xe");
				xes.setTenTaiXe(tenTX);
				String soXe = inputString("Nhap So Xe");
				xes.setTenTaiXe(soXe);
				double dThu = inputDouble("Nhap Doanh thu");
				xes.setDoanhThu(dThu);
			}
			else {
				NgoaiThanh xes = (NgoaiThanh) xe;
				System.out.println("Trước khi sửa \n" + xes);
				String tenTX = inputString("Nhap Ten Tai Xe");
				xes.setTenTaiXe(tenTX);
				String soXe = inputString("Nhap So Xe");
				xes.setTenTaiXe(soXe);
				double dThu = inputDouble("Nhap Doanh thu");
				xes.setDoanhThu(dThu);
			}
		}
	}
	static ChuyenXe them() {
		String maCX, ten, soXe;
		double dThu;
		maCX = inputString("Nhap Ma Chuyen Xe");
		while(xes.timKiemViTri(maCX) != 1) {
			ten = inputString("Nhap ten Tai Xe");
			soXe = inputString("Nhap So Xe");
			dThu = inputDouble("Nhap Doanh thu");
			System.out.println("Nhap xe noi thanh [1] hoac xe ngoai thanh [2]");
			int chon = nhapSoNguyen("Chon");
			if(chon == 1) {
				int soTuyen = inputInt("Nhap So Tuyen");
				double soKm = inputDouble("Nhap So KM");
				cXe = new NoiThanh(maCX, ten, soXe, dThu, soTuyen, soKm);					 
			} else {
				int soTuyen = inputInt("Nhap So Tuyen");
				double soKm = inputDouble("Nhap So KM");
				cXe = new NgoaiThanh(maCX, ten, soXe, dThu, soTuyen, soKm);
			}				 
		}
		return cXe;
	}

	static void nhapcung() throws Exception {
		ChuyenXe x1, x2 ,x3, x4;
		x1 = new NgoaiThanh("001", "Nguyễn Văn A", "29B-18970", 500000, 4, 2);
		x2 = new NgoaiThanh("002", "Trần Văn B", "29B-12030", 200000, 45, 1);
		x3 = new NoiThanh("003", "Lê Văn C", "29B-65863", 50000, 2, 20);
		x4 = new NoiThanh("004", "Nguyễn Văn D", "29B-74621", 60000, 3, 30);
		xes.them(x1);
		xes.them(x2);
		xes.them(x3);
		xes.them(x4);	
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

	static void Xuat(ArrayList<ChuyenXe> dS) {
		for(ChuyenXe xe : xes.DS)
			System.out.println(xe);
	}

}
