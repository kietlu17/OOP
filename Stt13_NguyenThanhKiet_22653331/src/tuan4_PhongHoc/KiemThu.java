package tuan4_PhongHoc;

import java.util.ArrayList;
import java.util.Scanner;


public class KiemThu {
	static Array ps;
	static PhongHoc p;
	public static void main(String[] args) throws Exception {
		ps = new Array();
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
					ds = ps.getPhong();
					Xuat(ds);
					break;
				}
			}
		}while(opt != 0);
	}
	
	static int menu()
	{
		int chon ;
		System.out.println("****MENU****\n"+
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
				+ "12. Lấy danh sách các phòng máy có 60 máy tính\n");
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
		for(PhongHoc p : ps.dS)
			System.out.println(p);
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
	}
