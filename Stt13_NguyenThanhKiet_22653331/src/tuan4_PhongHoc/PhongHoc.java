package tuan4_PhongHoc;

import java.util.Objects;

public abstract class PhongHoc {
	private int maPhong;
	private String dayNha;
	private double dienTich;
	private int soBongDen;
	abstract boolean datChuan();
	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return maPhong == other.maPhong;
	}
	public int getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(int maPhong) {
		this.maPhong = maPhong;
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}
	public PhongHoc(int maPhong, String dayNha, double dienTich, int soBongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}
	public PhongHoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean dK1() {
		if(dienTich/soBongDen >= 10)
			return true;
		else 
			return false;
	}
	public String toString() {
		return String.format("%-10s %-15s %15.2f %15d", maPhong, dayNha, dienTich, soBongDen);
	}
}
