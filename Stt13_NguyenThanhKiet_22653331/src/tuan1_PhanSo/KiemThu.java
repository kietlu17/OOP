package tuan1_PhanSo;

import java.util.Scanner;

public class KiemThu {
	public static void main(String[] args) {
		System.out.println("Chuong Trinh Tinh Phan So");
		int opt;
		do
		{
			opt = menu();
			switch (opt) 
			{
				case 1:
				{
					PhanSo a = createDefaul();
					System.out.println(a);
					break;
				}
				case 2:
				{
					PhanSo b = createRational();
					System.out.println(b);
					break;
				}
				case 3:{
					PhanSo a = createRational();
					PhanSo b = createRational();
					PhanSo psn = a.multiply(b); 
					psn.Reduce();
					System.out.println(psn);
					break;
				}
				case 4:{
					PhanSo a = createRational();
					PhanSo b = createRational();
					PhanSo psn = a.divide(b); 
					psn.Reduce();
					System.out.println(psn);
					break;
				}
				case 5:{
					PhanSo a = createRational();
					PhanSo b = createRational();
					PhanSo psn = a.add(b); 
					psn.Reduce();
					System.out.println(psn);
					break;
				}
				case 6:{
					PhanSo a = createRational();
					PhanSo b = createRational();
					PhanSo psn = a.subtract(b); 
					psn.Reduce();
					System.out.println(psn);
					break;
				}
				case 7:{
					PhanSo a = createRational();
					PhanSo psn = a.reciprocal(); 
					psn.Reduce();
					System.out.println(psn);
					break;
				}
				case 8:
				{
					System.out.println("GOOD BYE");
					break;
				}

			}
		}
		while(opt!=3);

		}
	
	static int inputInt (String str) {
		int x;
		System.out.println(str);
		Scanner scn = new Scanner(System.in);
		x = scn.nextInt();
		return x;
	}
	public static PhanSo createDefaul () {
		PhanSo ps1 = new PhanSo(3,9);
		return ps1;
	}
	public static PhanSo createRational () {
		int ts = inputInt("Bạn Hãy Nhập Tử Số");
		int ms = inputInt("Bạn Hãy Nhập Mẫu Số");
		PhanSo ps = new PhanSo();
		ps.setNumerator(ts);
		ps.setDenominator(ms);
		return ps;
	}
	public static int menu()
	{
		int chon ;
		System.out.println("****MENU****\n"+
							"1.Nhập cứng\n"+
							"2.Nhập mềm\n"+
							"3.Nhân"+
							"4.Chia"+
							"5.Cộng"+
							"6.Trừ"+
							"7.Nghịch đảo"+
							"8.Thoát");
		chon =nhapSoNguyen("Mời Bạn Chọn");
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
}
