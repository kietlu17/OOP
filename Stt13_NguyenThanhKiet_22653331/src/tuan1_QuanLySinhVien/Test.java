package tuan1_QuanLySinhVien;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("Chương trình quản lý sinh viên");		
		SinhVien sv1 =nhapMem();		
		xuatTieuDeCot();
		nhapCung();
		System.out.println(sv1);
	}



	static void nhapCung() {
		SinhVien sv2= new SinhVien(22331234,"Nguyễn Thành Đạt",8,9);
		System.out.println(sv2);
		SinhVien sv3= new SinhVien(22441235,"Nguyễn Trọng Nghĩa",8,8);
		System.out.println(sv3);
	}


	static void xuatTieuDeCot() {
		String str = String.format("%10s %-20s %10s %10s %10s","Mã SV","Họ Tên","Điểm LT","Điểm TH","Điểm TB");
		System.out.println(str);
	}

	static SinhVien nhapMem() {
		int id=nhapSoNguyen("Bạn Nhập Mã SV");
		String name =nhapChuoi("Bạn Hãy Nhập Tên");
		float lt=nhapSoThuc("Bạn Hãy Nhập Điểm LT");
		float th=nhapSoThuc("Bạn Hãy Nhập Điểm TH");
		SinhVien sv1= new SinhVien();
		sv1.setMaSV(id);
		sv1.setHoTen(name);
		sv1.setLT(lt);
		sv1.setTH(th);
		return sv1;
	}

	static int nhapSoNguyen(String str) {
		int x;
		System.out.println(str);
		Scanner scn=new Scanner(System.in);
		x= scn.nextInt();
		return x;
	}

	static float nhapSoThuc(String str) {
		int y;
		System.out.println(str);
		Scanner scn=new Scanner(System.in);
		y= scn.nextInt();
		return y;
	}

	static String nhapChuoi(String str) {
		String chuoi;
		System.out.println(str);
		Scanner strg=new Scanner(System.in);
		chuoi=strg.nextLine();
		return chuoi;
	}
}
