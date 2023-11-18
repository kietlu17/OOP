package tuan3_GiaoDichTienVang;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Objects;

public abstract class GiaoDich {
	protected String MaGiaoDich;
	protected LocalDate ngayGD;
	protected double DonGia;
	protected int SoLuong;
	public abstract double thanhtien();
	public String getMaGiaoDich() {
		return MaGiaoDich;
	}
	public void setMaGiaoDich(String maGiaoDich) {
		MaGiaoDich = maGiaoDich;
	}
	public LocalDate getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}
	public double getDonGia() {
		return DonGia;
	}
	public void setDonGia(double donGia) {
		DonGia = donGia;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public GiaoDich(String maGiaoDich, LocalDate ngayGD, double donGia, int soLuong) {
		super();
		MaGiaoDich = maGiaoDich;
		this.ngayGD = ngayGD;
		DonGia = donGia;
		SoLuong = soLuong;
	}
	public GiaoDich() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(DonGia, MaGiaoDich, SoLuong, ngayGD);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GiaoDich other = (GiaoDich) obj;
		return Double.doubleToLongBits(DonGia) == Double.doubleToLongBits(other.DonGia)
				&& Objects.equals(MaGiaoDich, other.MaGiaoDich) && SoLuong == other.SoLuong
				&& Objects.equals(ngayGD, other.ngayGD);
	}
	@Override
	public String toString() {
		DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String ngayGiaoDich=ngayGD.format(dateFormatter);
		Locale localeVN=new Locale("vi","VN");
		String str = String.format("%-15s%-18s%-18.2f%-20d", getMaGiaoDich(),ngayGiaoDich,getDonGia(), getSoLuong());
		return str;
	}
}
