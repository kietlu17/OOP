package tuan2_HangThucPham;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import tuan2_Account.Account;


public class TestHangThucPham {
	static ThucPhamArray foodList; 
	public static void main(String[] args) throws Exception {
		System.out.println("Chuong Trinh Account");
		foodList =new ThucPhamArray();
//		ThucPham[] dsTP;
//		createDefaulF();
		ThucPham[] dsTP = foodList.getFood();
//		displayTitle();
//		displayAcc(dsTP);
//		System.out.println("Mảng sau khi đã sắp xếp (theo giá tiền tăng dần)");
//		dsTP = foodList.sort();
//		//dsTP = foodList.getFood();
//		displayTitle();
//		displayAcc(dsTP);
		int opt ;
		do {
			opt =  menu();
			switch(opt) {
				case 1:{
					createDefaulF();
					dsTP = foodList.getFood();
					displayTitle();
					displayFood(dsTP);
					break;
				}
				case 2:{
					ThucPham newf = createF();
					foodList.add(newf);;
					dsTP = foodList.getFood();
					displayTitle();
					displayFood(dsTP);
					break;
				}
				case 3:{
					deleteFood();
					dsTP = foodList.getFood();
					displayTitle();
					displayFood(dsTP);
					break;
				}
				case 4:{
					updateF();
					dsTP = foodList.getFood();
					displayTitle();
					displayFood(dsTP);
					break;
				}
				case 5:{
					System.out.println("Mảng sau khi đã sắp xếp (theo giá tiền tăng dần)");
					dsTP = foodList.sort();
					displayTitle();
					displayFood(dsTP);
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
				"2.Thêm Hàng \n"+
				"3.Xóa hàng\n"
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
	public static void createDefaulF() throws Exception {

		ThucPham f1 = new ThucPham("0001","BÚN", 10000,LocalDate.of(2022,05,16),LocalDate.of(2023,10,01));
		ThucPham f2 = new ThucPham("0002","PHỞ", 20000,LocalDate.of(2021,05,15),LocalDate.of(2024,10,01));
		ThucPham f3 = new ThucPham("0003","HỦ TIẾU", 30000,LocalDate.of(2021,02,12),LocalDate.of(2024,10,01));
		ThucPham f4 = new ThucPham("0004","MÌ", 15000,LocalDate.of(2021,05,1),LocalDate.of(2024,10,01));
		foodList.add(f1);
		foodList.add(f2);
		foodList.add(f3);
		foodList.add(f4);
		
	}
	public static void displayTitle()
	{
		String title = String.format("\t%-7s %7s %20s %30s %30s %30s","NUMBER", "CODE","NAME","PRICE","production date","expiration date");
		System.out.println(title);
	}
	public static void displayFood(ThucPham[] dsTP) {
		for(int i=0;i<foodList.SPTT;i++)
		{
			System.out.printf("\t%-7d",i+1);
			System.out.println(dsTP[i]);
		}
	}
	public static String inputString (String s) {
		String str;
		System.out.println(s);
		Scanner sn = new Scanner(System.in);
		str = sn.nextLine();

		return str;
	}
	public static ThucPham createF() {
		ThucPham food;
		String code;
		String name;
		LocalDate ngSX;
		LocalDate ngHH;
		double price=0.0;
		code = inputString("Nhập Mã Hàng");
		while (foodList.timTP(code)) {
			System.out.println("Mã Hàng Đã Tồn Tại");
			code = inputString("Vui Lòng Nhập Lại");
		}
		name = inputString("Nhập Tên Hàng");
		ngSX = inputDate("Nhập Ngày Sản Xuất");
		ngHH = inputDate("Ngày Hết Hạn");
		food = new ThucPham(code,name,price,ngSX,ngHH);
		return food;
	}
	public static LocalDate inputDate (String s) {
		System.out.println(s);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate date = LocalDate.parse(inputString(""), f);
        return date;
	}
	public static void deleteFood () throws Exception {
		String fCode= inputString("Nhập số mã hàng cần xóa ");
		ThucPham food= foodList.searchFD(fCode);
		if(food != null) {
			String comfirm = inputString("Bạn có chắc chắc xóa? (y/Y)");
			if(comfirm.equalsIgnoreCase("y")) {
				foodList.deletFood(fCode);
				System.out.println("Đã xóa thành công");
			}
			else {
				System.out.println("Xóa thất bại");
				System.out.println("Không tìm thấy tài khoản");
			}									
		}
	}
	public static void updateF () throws Exception {
		String fCode= inputString("Nhập số mã hàng cần sửa ");
		ThucPham food= foodList.searchFD(fCode);
		if(food != null) {
			System.out.println("Trước khi sửa ");
			displayTitle();
			System.out.println(food);
			String name = inputString("\n Nhập tên hàng mới ");
			double price = inputDouble("\n Nhập giá mới ");
			LocalDate ngSX = inputDate("Nhập ngày sản xuất");
			LocalDate ngHH = inputDate("Nhập ngày hết hạn");
			food.setName(name);
			food.setPrice(price);
			food.setNgSX(ngSX);
			food.setNgHH(ngHH);
			foodList.update(food);
		}
		else
		{
			System.out.println("Không tìm thấy tài khoản");
		}
	}
	public static double inputDouble(String s) {
		double numDouble;
		System.out.println(s);
		Scanner sn = new Scanner(System.in);
		numDouble = sn.nextFloat();
		return numDouble;
	}
	
}