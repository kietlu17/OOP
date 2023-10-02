package tuan2_QLSV2;

import java.util.Scanner;

import tuan2_HangThucPham.ThucPham;

public class TestSV {
	static SinhVienArray svList; 
	public static void main(String[] args) throws Exception {
		System.out.println("Chuong Trinh Sinh Vien");
		svList = new SinhVienArray();
		SinhVien[] dsSV = svList.getSV();
		int opt ;
		do {
			opt =  menu();
			switch(opt) {
				case 1:{
					createDefaulSV();
					dsSV = svList.getSV();
					displayTitle();
					displaySV(dsSV);
					break;
				}
				case 2:{
					SinhVien newf = createSV();
					svList.add(newf);;
					dsSV = svList.getSV();
					displayTitle();
					displaySV(dsSV);
					break;
				}
				case 3:{
					deleteSV();
					dsSV = svList.getSV();
					displayTitle();
					displaySV(dsSV);
					break;
				}
				case 4:{
					updateSV();
					dsSV = svList.getSV();
					displayTitle();
					displaySV(dsSV);
					break;
				}
				case 5:{
					System.out.println("Mảng sau khi đã sắp xếp ");
					dsSV = svList.sort();
					displayTitle();
					displaySV(dsSV);
					break;
					
				}
				case 6:{
					System.out.println("GOOD BYE");
					break;
				}
			}
			
		}while(opt != 6);
	}

	public static int menu()
	{
		int chon ;
		System.out.println("****MENU****\n"+
				"1.Nhập Cứng\n"+
				"2.Thêm Sinh Viên \n"+
				"3.Xóa Sinh Viên\n"
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
	public static void createDefaulSV() throws Exception {

		SinhVien s1 = new SinhVien(220001, "Nguyễn Văn A", "0774411035", "HCM");
		SinhVien s2 = new SinhVien(220004, "Nguyễn Văn B", "0778888888", "HCM");
		SinhVien s3 = new SinhVien(220006, "Nguyễn Văn C", "0797979799", "HCM");
		SinhVien s4 = new SinhVien(220003, "Nguyễn Văn D", "0776868686", "HCM");
		svList.add(s1);
		svList.add(s2);
		svList.add(s3);
		svList.add(s4);
		
	}
	public static void displayTitle()
	{
		String title = String.format("\t%-7s %20s %30s %30s %30s", "NUMBER", "MaSV", "Ten", "SDT", "Dia Chi");
		System.out.println(title);
	}
	
	public static void displaySV(SinhVien[] dsSv) {
		for(int i=0;i<svList.SPTT;i++)
		{
			System.out.printf("\t%-7d",i+1);
			System.out.println(dsSv[i]);
		}
	}
	
	public static String inputString (String s) {
		String str;
		System.out.println(s);
		Scanner sn = new Scanner(System.in);
		str = sn.nextLine();
		return str;
	}
	
	public static SinhVien createSV() throws Exception {
		SinhVien sv;
		int maSV;
		String name;
		String SDT;
		String DC;
		maSV = inputInt("Nhập Mã Sinh Viên");
		while (svList.timSV(maSV)) {
			System.out.println("Mã Sinh Viên Đã Tồn Tại");
			maSV = inputInt("Vui Lòng Nhập Lại");
		}
		name = inputString("Nhập Tên Sinh Viên");
		SDT = inputString("Nhập Số Điện Thoại");
		DC = inputString("Nhập Địa Chỉ");
		sv = new SinhVien();
		sv.setMaSV(maSV);
		sv.setHoTen(name);
		sv.setSdt(SDT);
		sv.setDiaChi(DC);
		return sv;
	}
	
	public static void updateSV () throws Exception {
		int maSV= inputInt("Nhập mã sinh viên cần sửa ");
		SinhVien sv= svList.searchSV(maSV);
		if(sv != null) {
			System.out.println("Trước khi sửa ");
			displayTitle();
			System.out.println(sv);
			String name = inputString("\n Nhập tên sinh viên mới ");
			String sdt = inputString("\n Nhập số điện thoại mới ");		
			String dc = inputString("\n Nhập địa chỉ mới ");
			sv.setHoTen(name);
			sv.setSdt(sdt);
			sv.setDiaChi(dc);
			svList.update(sv);
		}
		else
		{
			System.out.println("Không tìm thấy sinh viên");
		}
	}
	public static double inputDouble(String s) {
		double numDouble;
		System.out.println(s);
		Scanner sn = new Scanner(System.in);
		numDouble = sn.nextFloat();
		return numDouble;
	}
	public static int inputInt(String s) {
		int numInt;
		System.out.println(s);
		Scanner sn = new Scanner(System.in);
		numInt = sn.nextInt();
		return numInt;
	}
	
	public static void deleteSV () throws Exception {
		int maSV= inputInt("Nhập mã sinh viên cần xóa ");
		SinhVien sv= svList.searchSV(maSV);
		if(sv != null) {
			String comfirm = inputString("Bạn có chắc chắc xóa? (y/Y)");
			if(comfirm.equalsIgnoreCase("y")) {
				svList.deleteSV(maSV);
				System.out.println("Đã xóa thành công");
			}
			else {
				System.out.println("Xóa thất bại");
				System.out.println("Không tìm thấy tài khoản");
			}									
		}
	}
}
