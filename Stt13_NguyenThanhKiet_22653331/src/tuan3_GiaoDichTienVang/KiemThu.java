package tuan3_GiaoDichTienVang;

import java.time.LocalDate;
import java.util.List;

public class KiemThu {
	static GiaoDichArray giaodichtList;
	public static void main(String[] args) throws Exception {
		
		System.out.println("Chương trình Quản lý Giao Dịch!");
		giaodichtList =new GiaoDichArray();
		GiaoDich giaodich1= new GiaoDichVang("A001",LocalDate.of(2023, 9, 14) , 1200000000, 500, "Vang Trang");
		GiaoDich giaodich2= new GiaoDichVang("A002",LocalDate.of(2023, 5, 4) , 1700000000, 450, "Vang ");
		GiaoDich giaodich3= new GiaoDichTien("A003",LocalDate.of(2022, 2, 12) , 1000000000, 500, "vn");
		GiaoDich giaodich4= new GiaoDichTien("A004",LocalDate.of(2021, 1, 12) , 2100000000, 500, "euro");
		
		
		
		giaodichtList.addGiaoDich(giaodich1);
		giaodichtList.addGiaoDich(giaodich2);
		giaodichtList.addGiaoDich(giaodich3);
		giaodichtList.addGiaoDich(giaodich4);
		
		displayTitleVang();
		displayGiaoDich(giaodichtList.getDanhSachGDVang());
		displayTitleTien();
		displayGiaoDich(giaodichtList.getDanhSachGDTien());
		
		System.out.printf("Số giao dịch Vàng : %d\n",giaodichtList.tongSoGDVang());
		System.out.printf("Số giao dịch Tiền: %d\n",giaodichtList.tongSoGDTien());
		
		System.out.printf("Trung bình thành tiền của giao dịch: %.2f\n",giaodichtList.TrungBinhThanhTiens());
		DanhSachGDLonHon1ty();		
		
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
	
}
