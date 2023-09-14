package tuan1_DangKiXe;

import java.util.Scanner;

public class TestXe {
	public static void main(String[] args) {
		System.out.println("Chương Trình Đăng Kí Xe");
		int opt ;
		Vehicle xe1=new Vehicle();
		Vehicle xe2=new Vehicle();
		Vehicle xe3=new Vehicle();
		do 
		{
			opt =menu();
			switch(opt) 
			{
				case 1:
					{
						xe1= nhapMem();
						xe2= nhapMem();
						xe3= nhapMem();
						break;
					
					}
				case 2:
				{
					xuatTieuDeCot();
					System.out.println(xe1);
					System.out.println(xe2);
					System.out.println(xe3);
					break;
				}
				case 3:
				{
					System.out.println("GOOD BYE");
					break;
				}
			}
		}while (opt!=3);
	}



static void xuatTieuDeCot() {
	String str = String.format("%-20s %-20s %10s %10s %10s","Tên chủ xe","Loại xe","Dung Tích","Trị Giá","Thuế");
	System.out.println(str);;
}
static Vehicle nhapMem() {
	String ten= nhapChuoi("Bạn Hãy Nhập Tên");
	String xe= nhapChuoi("Bạn Hãy Nhập Tên Xe");
	int cc= nhapSoNguyen("Bạn Hãy Nhập Dung Tích Xe");
	int tien= nhapSoNguyen("Bạn Hãy Nhập Giá Trị Xe");
	Vehicle xe1= new Vehicle();
	xe1.setTenChu(ten);
	xe1.setTenXe(xe);
	xe1.setGiaTri(tien);
	xe1.setDungTich(cc);
	return xe1;
}
static int nhapSoNguyen(String str) {
	int x;
	System.out.println(str);
	Scanner scn=new Scanner(System.in);
	x= scn.nextInt();
	return x;
}
static String nhapChuoi(String str) {
	String chuoi;
	System.out.println(str);
	Scanner strg=new Scanner(System.in);
	chuoi=strg.nextLine();
	return chuoi;
}
public static int menu()
{
	int chon ;
	System.out.println("****MENU****\n"+
						"1.Nhập cứng\n"+
						"2.Xuất thông tin thuế trước bạ\n"+
						"3.Thoát");
	chon =nhapSoNguyen("Mời Bạn Chọn");
	return chon;
}
}