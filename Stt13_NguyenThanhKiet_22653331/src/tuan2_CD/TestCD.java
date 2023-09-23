package tuan2_CD;

import java.util.Scanner;

public class TestCD {
	static CDArray cdList; 
	public static void main(String[] args) throws Exception {
		System.out.println("Chuong Trinh CD");
		cdList = new CDArray();
		CD[] dsCD = cdList.getCD();

		int opt ;
		do {
			opt =  menu();
			switch(opt) {
				case 1:{
					createDefaulCD();
					dsCD = cdList.getCD();
					displayTitle();
					displayCD(dsCD);
					break;
				}
				case 2:{
					CD newCD = createCD();
					cdList.add(newCD);
					dsCD = cdList.getCD();
					displayTitle();
					displayCD(dsCD);
					break;
				}
				case 3:{
					deleteCD();
					dsCD = cdList.getCD();
					displayTitle();
					displayCD(dsCD);
					break;
				}
				case 4:{
					updateSV();
					dsCD = cdList.getCD();
					displayTitle();
					displayCD(dsCD);
					break;
				}
				case 5:{
					System.out.println("Mảng sau khi đã sắp xếp ");
					dsCD = cdList.sort();
					displayTitle();
					displayCD(dsCD);
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
				"2.Thêm CD \n"+
				"3.Xóa CD\n"
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
	public static void createDefaulCD() throws Exception {

		CD s1 = new CD(20001, "Born To Die", "Lana", 13, 1000000);
		CD s2 = new CD(20004, "22", "Adele", 12, 1200000);
		CD s3 = new CD(20006, "Link", "Hoàng Thùy Linh", 8, 800000);
		CD s4 = new CD(20003, "Yêu", "Nam", 3, 500000);
		cdList.add(s1);
		cdList.add(s2);
		cdList.add(s3);
		cdList.add(s4);
		
	}
	public static void displayTitle() {
		String title = String.format("\t%-7s %10s %20s %20s %10s %20s", "NUMBER", "MaCD", "Ten", "Ca Si", "So Bai Hat", "Gia");
		System.out.println(title);
	}
	
	public static void displayCD(CD[] dsCD) {
		for(int i = 0; i<cdList.SPTT; i++)
		{
			System.out.printf("\t%-7d",i+1);
			System.out.println(dsCD[i]);
		}
	}
	
	public static String inputString (String s) {
		String str;
		System.out.println(s);
		Scanner sn = new Scanner(System.in);
		str = sn.nextLine();
		return str;
	}
	
	public static CD createCD() throws Exception {
		CD cd;
		int maCD;
		String name;
		String caSi;
		int sbh;
		float gia;
		maCD = inputInt("Nhập Mã CD");
		while (cdList.timCD(maCD)) {
			System.out.println("Mã CD Đã Tồn Tại");
			maCD = inputInt("Vui Lòng Nhập Lại");
		}
		name = inputString("Nhập Tên CD");
		caSi = inputString("Nhập Tên Ca Sĩ");
		sbh = inputInt("Nhập Số Bài Hát");
		gia = inputFloat("Nhập Giá");
		cd = new CD();
		cd.setMaCD(maCD);
		cd.setTuaCD(name);
		cd.setCaSi(caSi);
		cd.setSoBaiHat(sbh);
		cd.setGiaThanh(gia);
		return cd;
	}
	
	public static void updateSV () throws Exception {
		int maCD= inputInt("Nhập mã CD cần sửa ");
		CD cd= cdList.searchCD(maCD);
		if(cd != null) {
			System.out.println("Trước khi sửa ");
			displayTitle();
			System.out.println(cd);
			String name = inputString("\n Nhập tên CD mới ");
			String caSi = inputString("\n Nhập tên ca sĩ mới ");		
			int sbh = inputInt("\n Nhập số bai hát mới ");
			float gia = inputFloat("\n Nhập số tiền mới ");
			cd.setTuaCD(caSi);
			cd.setCaSi(caSi);
			cd.setSoBaiHat(maCD);
			cd.setGiaThanh(gia);
			cdList.update(cd);
		}
		else
		{
			System.out.println("Không tìm thấy sinh viên");
		}
	}
	public static float inputFloat(String s) {
		float numfloat;
		System.out.println(s);
		Scanner sn = new Scanner(System.in);
		numfloat = sn.nextFloat();
		return numfloat;
	}
	public static int inputInt(String s) {
		int numInt;
		System.out.println(s);
		Scanner sn = new Scanner(System.in);
		numInt = sn.nextInt();
		return numInt;
	}
	
	public static void deleteCD () throws Exception {
		int maCD= inputInt("Nhập mã CD cần xóa ");
		CD cd= cdList.searchCD(maCD);
		if(cd != null) {
			String comfirm = inputString("Bạn có chắc chắc xóa? (y/Y)");
			if(comfirm.equalsIgnoreCase("y")) {
				cdList.deleteSV(maCD);
				System.out.println("Đã xóa thành công");
			}
			else {
				System.out.println("Xóa thất bại");
				System.out.println("Không tìm thấy CD");
			}									
		}
	}
}
