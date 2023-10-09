package tuan3_SachKeThuaTruTuong;

import java.time.LocalDate;

public class SachThamKhao extends Sach {
	private double tax;

	public double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	@Override
	double thanhTien() {
		// TODO Auto-generated method stub
		double tien = soLuong * donGia + ((soLuong * donGia) * tax);
		return tien;
	}

	public SachThamKhao(int maSach, int soLuong, String nXB, double donGia, LocalDate ngayNhap, double tax) {
		super(maSach, soLuong, nXB, donGia, ngayNhap);
		this.tax = tax;
	}

	public SachThamKhao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SachThamKhao(int maSach, int soLuong, String nXB, double donGia, LocalDate ngayNhap) {
		super(maSach, soLuong, nXB, donGia, ngayNhap);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n Thanh Tien" + thanhTien();
	}
}
