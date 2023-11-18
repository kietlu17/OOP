package tuan3_SachKeThuaTruTuong;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Sach {
	protected int maSach, soLuong;
	protected String nXB;
	protected double donGia;
	protected LocalDate ngayNhap;
	abstract double thanhTien();
	
	public int getMaSach() {
		return maSach;
	}
	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getnXB() {
		return nXB;
	}
	public void setnXB(String nXB) {
		this.nXB = nXB;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maSach);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sach other = (Sach) obj;
		return maSach == other.maSach;
	}

	public Sach(int maSach, int soLuong, String nXB, double donGia, LocalDate ngayNhap) {
		super();
		this.maSach = maSach;
		this.soLuong = soLuong;
		this.nXB = nXB;
		this.donGia = donGia;
		this.ngayNhap = ngayNhap;
	}

	public Sach() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%-10s %15s %20s %15d %20s", maSach, dtf.format(ngayNhap), df.format(donGia), soLuong, nXB);
	}
	
}
