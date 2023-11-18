package tuan3_GiaoDichTienVang;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class KiemThu {
	static GiaoDichArray giaodichtList;
	public static void main(String[] args) throws Exception {
		
		System.out.println("Chương trình Quản lý Giao Dịch!");
		giaodichtList =new GiaoDichArray();
		int choice;
		do {
			choice = menu();
			switch(choice) {
				case 1:{
					createDefault();
					System.out.println("Danh sách Giao dịch tiền");
					displayTitleTien();
					displayGiaoDich(giaodichtList.getDanhSachGDTien());
					System.out.println("Danh sách Giao dịch vàng");
					displayTitleVang();
					displayGiaoDich(giaodichtList.getDanhSachGDVang());
					break;
				}
				case 2:{
					GiaoDich gd = nhapMen();
					giaodichtList.addGiaoDich(gd);
					System.out.println("Danh sách Giao dịch tiền");
					displayTitleTien();
					displayGiaoDich(giaodichtList.getDanhSachGDTien());
					System.out.println("Danh sách Giao dịch vàng");
					displayTitleVang();
					displayGiaoDich(giaodichtList.getDanhSachGDVang());
					break;
				}
				case 3:{
					System.out.println("Danh sách Giao dịch tiền");
					displayTitleTien();
					displayGiaoDich(giaodichtList.getDanhSachGDTien());
					System.out.println("Danh sách Giao dịch vàng");
					displayTitleVang();
					displayGiaoDich(giaodichtList.getDanhSachGDVang());
					break;
		
				}
				case 4:{
					System.out.printf("Số giao dịch tiền : %d\n",giaodichtList.tongSoGDTien());
					System.out.printf("Số giao dịch Vàng : %d\n",giaodichtList.tongSoGDVang());
					System.out.println();
					break;
				}
				case 5:{
					System.out.printf("Trung bình thành tiền của giao dịch: %.2f\n",giaodichtList.TrungBinhThanhTiens());
				}
				case 6:{
					System.out.printf("Danh sách giao dịch trên 1 tỷ");
					DanhSachGDLonHon1ty();
					break;					
				}
				case 7:{
					System.out.println("GOOD BYE");
					break;
				}
			}
		}while(choice != 7);
		

	}
	public static void displayGiaoDich(List<GiaoDich> list) {
		int i=0;
			for(GiaoDich giaoDich: list) {
				i++;
					System.out.printf("\t %-7d ",i);
					System.out.println(giaoDich);				
				
			}
		
	}
	public static void displayTitleVang() {
		String title=String.format("\t%-7s %-15s %-18s %-15s %-20s %-15s","STT", "Mã Giao dịch","Ngày giao dịch","Đơn giá","Số Luong","Loại Vàng");
		System.out.println(title);
	}
	public static void displayTitleTien() {
		String title=String.format("\t%-7s %-15s %-18s %-15s %-20s %-15s","STT", "Mã Giao dịch","Ngày giao dịch","Đơn giá","Số Luong","tỷ Giá");
		System.out.println(title);
	}
	public static void DanhSachGDLonHon1ty()
	{
		System.out.println("Danh Sách Giao Dịch Lớn Hơn 1 Tỷ:\n");
		System.out.println("Danh sách Giao dịch Vàng : \n");
		displayTitleVang();;
		displayGiaoDich(giaodichtList.getDanhSachGDVang());
		System.out.println("Danh sách Giao dịch Tiền : \n");
		displayTitleTien();;
		displayGiaoDich(giaodichtList.getDanhSachGDTien());
	}
	public static void createDefault() throws Exception {
		GiaoDich giaodich1= new GiaoDichVang("A001",LocalDate.of(2023, 9, 14) , 1200000000, 500, "Vang Trang");
		GiaoDich giaodich2= new GiaoDichVang("A002",LocalDate.of(2023, 5, 4) , 1700000000, 450, "Vang ");
		GiaoDich giaodich3= new GiaoDichTien("A003",LocalDate.of(2022, 2, 12) , 1000000000, 500, "vn");
		GiaoDich giaodich4= new GiaoDichTien("A004",LocalDate.of(2021, 1, 12) , 2100000000, 500, "euro");				
		giaodichtList.addGiaoDich(giaodich1);
		giaodichtList.addGiaoDich(giaodich2);
		giaodichtList.addGiaoDich(giaodich3);
		giaodichtList.addGiaoDich(giaodich4);
	}
	
	public static GiaoDich nhapMen() {
		GiaoDich gd;
		String maGD = inputString("Nhập mã Giao Dịch");
		LocalDate  ngayGD = inputDate("Nhập ngày Giao Dịch");
		double donGia = inputDouble("Nhập đơn giá");
		int sl = nhapsonguyen("Nhập số lương");
		String chon;
		chon = inputString("Giao Dịch Tiền(GDT)hay Giao Dịch Vàng(GDV)");
		if(chon.equalsIgnoreCase("GDT")) {
			String loai = inputString("Nhập loại tiền");
			gd = new GiaoDichTien(maGD, ngayGD, donGia, sl, loai);
		}else {
			String loai = inputString("Nhập loại vàng");
			gd = new GiaoDichVang(maGD, ngayGD, donGia, sl, loai);
		}
		return gd;
	}
	public static String inputString(String str)
	{
		System.out.println(str);
		Scanner scn= new Scanner(System.in);
		String x;
		x=scn.nextLine();
		return x;
	}
	public static LocalDate inputDate (String s) {
		System.out.println(s);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate date = LocalDate.parse(inputString(""), f);
        return date;
	}
	public static double inputDouble(String str)
	{
		System.out.println(str);
		Scanner scn= new Scanner(System.in);
		double x;
		x=scn.nextDouble();
		return x;
	}
	static int nhapsonguyen(String str)
	{
		System.out.println(str);
		int x;
		Scanner scn=new Scanner(System.in);
		 x= scn.nextInt();
		 return x;
	}
	public static int menu() {
		int a;
		System.out.println("*****MENU*****\n"
						+ "1.Nhập cứng\n"
						+ "2.Nhập mềm\n"
						+ "3.Danh sách giao dịch\n"
						+ "4.Tổng số lượng cho từng loại giao dịch\n"
						+ "5.Trung bình thành tiền của giao dịch\n"
						+ "6.Danh sách giao dịch lớn hơn 1 tỷ\n"
						+ "7.Thoát\n");
	do {
			a=nhapsonguyen("Nhập lựa chọn: ");
			if(a>=8||a<=0)
			{
				System.out.println("Không hợp lệ ! Yêu cầu nhập lại! ");
			}
	}while(a<=0||a>=8);
	return a;
}
}
