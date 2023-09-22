package tuan2_PhanSo;

import java.util.Scanner;

public class TestPhanSo {
	public static void main(String[] args) {
		System.out.println("Chuong Trinh Tinh Phan So");
		PhanSo ps1 = createDefaul();
		PhanSo ps2 = createRational();
		PhanSo psn = ps1.multiply(ps2) ;
		psn.Reduce();
//		PhanSo psnd = ps1.reciprocal();
		System.out.println(psn);
		
		
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
}
