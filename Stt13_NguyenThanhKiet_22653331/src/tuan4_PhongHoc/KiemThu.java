package tuan4_PhongHoc;

import java.util.ArrayList;
import java.util.Scanner;

import tuan2_HangThucPham.ThucPham;


public class KiemThu {
	static QLPhong ps;
	static PhongHoc p;
	public static void main(String[] args) throws Exception {
		System.out.println("Chuong Trinh Quan Phong Hoc");
		ps = new QLPhong() {}; 
		ArrayList<PhongHoc> ds = ps.getPhong();
		int opt;
		do {
			opt = menu();
			switch(opt) {
				case 0:{
					System.out.println("GOOD BYE");
					break;
				}
				case 1:{
					nhapcung();
					System.out.println("Danh Sách Phòng Lý Thuyết");
					ds = ps.getDSPLyThuyet();
					displayTitleLT();
					Xuat(ds);
					System.out.println("Danh Sách Phòng Máy Tính");
					ds = ps.getDSPMayTinh();
					displayTitleMT();
					Xuat(ds);
					System.out.println("Danh Sách Phòng Thí Nghiệm");
					ds = ps.getDSPThiNghiem();
					displayTitleTN();
					Xuat(ds);
					break;
				}
				case 2:{
					nhapmen();
					System.out.println("Danh Sách Phòng Lý Thuyết");
					ds = ps.getDSPLyThuyet();
					displayTitleLT();
					Xuat(ds);
					System.out.println("Danh Sách Phòng Máy Tính");
					ds = ps.getDSPMayTinh();
					displayTitleMT();
					Xuat(ds);
					System.out.println("Danh Sách Phòng Thí Nghiệm");
					ds = ps.getDSPThiNghiem();
					displayTitleTN();
					Xuat(ds);
					break;
				}
				case 3:{
					timPhongHoc();
					break;
				}
				case 4:{
					System.out.println("Danh Sách Phòng Lý Thuyết");
					ds = ps.getDSPLyThuyet();
					displayTitleLT();
					Xuat(ds);
					System.out.println("Danh Sách Phòng Máy Tính");
					ds = ps.getDSPMayTinh();
					displayTitleMT();
					Xuat(ds);
					System.out.println("Danh Sách Phòng Thí Nghiệm");
					ds = ps.getDSPThiNghiem();
					displayTitleTN();
					Xuat(ds);
					break;
				}
				case 5:{
					ds=ps.layDsDatChuan();					
					Xuat(ds);
					break;
				}
				case 6:{
					ps.sortDayNha();
					System.out.println("Danh Sách Phòng Lý Thuyết");
					ds = ps.getDSPLyThuyet();
					displayTitleLT();
					Xuat(ds);
					System.out.println("Danh Sách Phòng Máy Tính");
					ds = ps.getDSPMayTinh();
					displayTitleMT();
					Xuat(ds);
					System.out.println("Danh Sách Phòng Thí Nghiệm");
					ds = ps.getDSPThiNghiem();
					displayTitleTN();
					Xuat(ds);
					break;
				}
				case 7:{
					ps.sortDienTich();
					System.out.println("Danh Sách Phòng Lý Thuyết");
					ds = ps.getDSPLyThuyet();
					displayTitleLT();
					Xuat(ds);
					System.out.println("Danh Sách Phòng Máy Tính");
					ds = ps.getDSPMayTinh();
					displayTitleMT();
					Xuat(ds);
					System.out.println("Danh Sách Phòng Thí Nghiệm");
					ds = ps.getDSPThiNghiem();
					displayTitleTN();
					Xuat(ds);
					break;
				}
				case 8:{
					ps.sortSoBongDen();
					System.out.println("Danh Sách Phòng Lý Thuyết");
					ds = ps.getDSPLyThuyet();
					displayTitleLT();
					Xuat(ds);
					System.out.println("Danh Sách Phòng Máy Tính");
					ds = ps.getDSPMayTinh();
					displayTitleMT();
					Xuat(ds);
					System.out.println("Danh Sách Phòng Thí Nghiệm");
					ds = ps.getDSPThiNghiem();
					displayTitleTN();
					Xuat(ds);
					break;
				}
				case 9:{
					capNhatPhongHoc();
					System.out.println("Danh Sách Phòng Lý Thuyết");
					ds = ps.getDSPLyThuyet();
					displayTitleLT();
					Xuat(ds);
					System.out.println("Danh Sách Phòng Máy Tính");
					ds = ps.getDSPMayTinh();
					displayTitleMT();
					Xuat(ds);
					System.out.println("Danh Sách Phòng Thí Nghiệm");
					ds = ps.getDSPThiNghiem();
					displayTitleTN();
					Xuat(ds);
					break;
				}
				case 10:{
					xoa();
					System.out.println("Danh Sách Phòng Lý Thuyết");
					ds = ps.getDSPLyThuyet();
					displayTitleLT();
					Xuat(ds);
					System.out.println("Danh Sách Phòng Máy Tính");
					ds = ps.getDSPMayTinh();
					displayTitleMT();
					Xuat(ds);
					System.out.println("Danh Sách Phòng Thí Nghiệm");
					ds = ps.getDSPThiNghiem();
					displayTitleTN();
					Xuat(ds);
					break;
				}
				case 11:{
					int a = ps.tongSoPhong();
					System.out.printf("Tổng các phòng học: %d", a);
					break;				
				}
			}
		}while(opt != 0);
	}
	
	static int menu()
	{
		int chon ;
		System.out.println("\n****MENU****\n"+
				"0. Kết thúc\n"
				+ "1. Khởi tạo danh sách\n" 
				+ "2. Thêm phòng học\n" 
				+ "3. Tìm kiếm phòng học theo mã\n"
				+ "4. Lấy thông tin toàn bộ phòng\n" 
				+ "5. Lấy danh sách phòng học đạt chuẩn\n"
				+ "6. Sắp xếp danh sách tăng dần theo dãy nhà\n" 
				+ "7. Sắp xếp danh sách giảm dần theo diện tích\n"
				+ "8. Sắp xếp tăng dần theo số bóng đèn\n" 
				+ "9. Cập nhật số máy tính\n" 
				+ "10. Xóa phòng học theo mã\n"
				+ "11. Tính tổng số phòng học\n" 
				);
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
	
	static void nhapcung() throws Exception {
		
		ps.them(new LyThuyet(1001, "bcd", 80, 25, false));
		ps.them(new LyThuyet(1002, "hgd", 10, 65, true));
		ps.them(new LyThuyet(1003, "ook", 40, 2, false));
		ps.them(new MayTinh(1004, "acg", 40, 55, 60));
		ps.them(new MayTinh(1005, "qkd", 66, 25, 40));
		ps.them(new MayTinh(1006, "lkm", 90, 2, 200));
		ps.them(new ThiNghiem(1007, "pcs", 40, 7,"hóa học",24, false));
		ps.them(new ThiNghiem(1008, "mbx", 30, 1, "hóa học",24, true));
		ps.them(new ThiNghiem(1009, "aag", 25, 25, "hóa học",4, false));
	}
	
	static void Xuat(ArrayList<PhongHoc> ds) {
		int i = 0;
		for(PhongHoc p : ds) {
			i++;
			System.out.printf("\t %-7d ",i);
			System.out.println(p);
		}
	}
	static void nhapmen() throws Exception {
		System.out.print("\t1. Phòng học lý thuyết\n" + "\t2. Phòng máy tính\n" + "\t3. Phòng thí nghiệm\n");
		int luaChon2;		
		luaChon2 = nhapSoNguyen("Nhập lựa chọn: ");
		int MP = nhapSoNguyen("Mã phòng: ");
		String DN = inputString("Dãy nhà: ");
		double DT = inputDouble("Diện tích: ");
		int SBD = nhapSoNguyen("Số bóng đèn: ");
		switch (luaChon2) {
			case 1:
				boolean MC = inputBoolean("Có máy chiếu không (true/false): ");
				if (ps.them(new LyThuyet(MP, DN, DT, SBD, MC)))
					System.out.println("Đã thêm thành công");
				else
					System.out.println("Mã bị trùng!");
				break;
			case 2:
				int SMT = nhapSoNguyen("Số lượng máy tính: ");
				if (ps.them(new MayTinh(MP, DN, DT, SBD, SMT)))
					System.out.println("Đã thêm thành công");
				else
					System.out.println("Mã bị trùng!");
				break;
			case 3:
				String CN = inputString("Chuyên ngành: ");
				int SC = nhapSoNguyen("Sức chứa: ");
				boolean BR = inputBoolean("Có bồn rửa không (true/false): ");
				if (ps.them(new ThiNghiem(MP, DN, DT, SBD, CN, SC, BR)))
					System.out.println("Đã thêm thành công");
				else
					System.out.println("Mã bị trùng!");
				break;
			default:
				System.out.println("Chưa có chức năng này!");
				break;
			
		}
			
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
		static boolean inputBoolean(String s) {
			boolean bool;
			System.out.println(s);
			Scanner sn = new Scanner(System.in);
			bool = sn.nextBoolean();
			return bool;
		}
		
		static void timPhongHoc() {
			int MPT = nhapSoNguyen("Nhập mã phòng cần tìm: ");
			PhongHoc timPhong = ps.timKiem(MPT);
			if (timPhong == null)
				System.out.println("Không tìm thấy!");
			else {
				if(timPhong instanceof LyThuyet) {
					displayTitleLT();
					System.out.printf("\t %10s","");
					System.out.print(timPhong);
				}
					
				else if(timPhong instanceof MayTinh) {
					displayTitleMT();
					System.out.printf("\t %10s","");
					System.out.print(timPhong);
				}
					
				else {
					displayTitleTN();
					System.out.printf("\t %10s","");
					System.out.print(timPhong);
				}
			}
		}
		
		static void capNhatPhongHoc() {
			int mP = nhapSoNguyen("Nhập mã phòng cần sửa");
			PhongHoc timPhong = ps.timKiem(mP);
			if(timPhong == null)
				System.out.println("Không tồn tại phòng này");
			else {
				if(timPhong instanceof LyThuyet) {
					LyThuyet ps = (LyThuyet) timPhong;
					System.out.println("Trước Khi Sửa \n" + ps);
					String dayNha = inputString("Nhập dãy nhà: ");
					ps.setDayNha(dayNha);
					double dienTich = inputDouble("Nhập Diện Tích: ");
					ps.setDienTich(dienTich);
					int sbd = nhapSoNguyen("Nhập Số Bóng Đèn: ");
					ps.setSoBongDen(sbd);
					boolean mC = inputBoolean("Có Máy Chiếu Không? true/false");
					ps.setMayChieu(mC);
				}
				else if(timPhong instanceof ThiNghiem)
				{
					ThiNghiem ps = (ThiNghiem) timPhong;
					System.out.println("Trước Khi Sửa \n" + ps);
					String dayNha = inputString("Nhập dãy nhà: ");
					ps.setDayNha(dayNha);
					double dienTich = inputDouble("Nhập Diện Tích: ");
					ps.setDienTich(dienTich);
					int sbd = nhapSoNguyen("Nhập Số Bóng Đèn: ");
					ps.setSoBongDen(sbd);
					String cN = inputString("Nhập Chuyên Nghành: ");
					ps.setChuyenNganh(cN);
					int sC = nhapSoNguyen("Nhập sức chứa");
					ps.setSucChua(sC);
					boolean bR = inputBoolean("Có bồn rửa không? true/ false");
					ps.setBonRua(bR);
				}
				else {
					MayTinh ps = (MayTinh) timPhong;
					System.out.println("Trước Khi Sửa \n" + ps);
					String dayNha = inputString("Nhập dãy nhà: ");
					ps.setDayNha(dayNha);
					double dienTich = inputDouble("Nhập Diện Tích: ");
					ps.setDienTich(dienTich);
					int sbd = nhapSoNguyen("Nhập Số Bóng Đèn: ");
					ps.setSoBongDen(sbd);
					int smt= nhapSoNguyen("Nhập số máy tính: ");
					ps.setSoMayTinh(smt);
				}
			}
		}
		static void xoa() {
			int mP = nhapSoNguyen("Nhập Mã Phòng Cần Xóa: ");
			PhongHoc p = ps.timKiem(mP);
			if(p != null) {
				String acp = inputString("Bạn có muốn xóa không? y/n");
				if(acp.equalsIgnoreCase("y")) {
					ps.xoa(p);
					System.out.println("Xóa Thành Công");
				}else 
					System.out.println("Không tồn tại phòng này");
			}
		}
		
		public static void displayTitleLT() {
			String title=String.format("\t%-7s %-15s %18s %15s %15s %12s","STT", "Mã Phòng","Dãy Nhà","Diện Tích", "Số Bóng Đèn","Máy Chiếu");
			System.out.println(title);
		}
		
		public static void displayTitleMT() {
			String title=String.format("\t%-7s %-15s %18s %15s %15s %12s","STT", "Mã Phòng","Dãy Nhà","Diện Tích", "Số Bóng Đèn","Số Máy Tính");
			System.out.println(title);
		}
		
		public static void displayTitleTN() {
			String title=String.format("\t%-7s %-15s %18s %15s %15s %14s %12s %12s","STT", "Mã Phòng","Dãy Nhà","Diện Tích", "Số Bóng Đèn","Chuyên Ngành", "Sức Chứa", "Bồn Rửa");
			System.out.println(title);
		}
	}
