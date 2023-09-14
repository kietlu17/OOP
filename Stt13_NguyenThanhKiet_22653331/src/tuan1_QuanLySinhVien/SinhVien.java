package tuan1_QuanLySinhVien;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private float LT;
	private float TH;

	//xay dung contructor va method
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getLT() {
		return LT;
	}
	public void setLT(float lT) {
		LT = lT;
	}
	public float getTH() {
		return TH;
	}
	public void setTH(float tH) {
		TH = tH;
	}
	public SinhVien(int maSV, String hoTen, float lT, float tH) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		LT = lT;
		TH = tH;
	}
	public float diemTB() {
		float lt=this.getLT();
		float th=getTH();
		float tb=(lt+th)/2;
		return tb;
	}
	@Override
	public String toString() {
		String str = String.format("%10d %-20s %10.2f %10.2f %10.2f", getMaSV(), getHoTen(),getLT(),getTH(),diemTB());
		return str;
	}

}
