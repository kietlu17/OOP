    package tuan1_HinhChuNhat;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("Chương trình Hình Chữ Nhật");
		int opt;
		do
		{
			opt = menu();
			switch (opt) 
			{
				case 1:
				{
					xuatTieuDeCot();
					nhapCung();
					break;
				}
				case 2:
				{
					HinhChuNhat cn1= nhapMem();
					xuatTieuDeCot();
					System.out.println(cn1);
					break;
				}
				case 3:
				{
					System.out.println("GOOD BYE");
					break;
				}

			}
		}
		while(opt!=3);

		}
		static void nhapCung()
		{
			HinhChuNhat cn2=new HinhChuNhat(15,10);
			System.out.println(cn2);
			HinhChuNhat cn3=new HinhChuNhat(8,9);
			System.out.println(cn3);
		}
		static HinhChuNhat nhapMem()
		{
			int cr=nhapSoNguyen("Bạn Nhập Chiều Rộng");
			int cd=nhapSoNguyen("Bạn Nhập Chiều Dài");
			HinhChuNhat cn1=new HinhChuNhat();
			cn1.setChieuDai(cd);
			cn1.setChieuRong(cd);
			return cn1;
		}

		static int nhapSoNguyen(String str) 
		{
			int x;
			System.out.println(str);
			Scanner scn=new Scanner(System.in);
			x= scn.nextInt();
			return x;
		}

		static void xuatTieuDeCot() {
			System.out.println("Chiều Dài"+"  Chiều Rộng"+"  Chu Vi"+"  Diện Tích");
		}

		public static int menu()
		{
			int chon ;
			System.out.println("****MENU****\n"+
								"1.Nhập cứng\n"+
								"2.Nhập mềm\n"+
								"3.Thoát");
			chon =nhapSoNguyen("Mời Bạn Chọn");
			return chon;
		}
		}
		
			
		
	
		