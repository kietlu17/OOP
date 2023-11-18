package tuan3_GiaoDichTienVang;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich {
	private String LoaiVang;

	public String getLoaiVang() {
		return LoaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		LoaiVang = loaiVang;
	}

	public GiaoDichVang(String maGiaoDich, LocalDate ngayGD, double donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngayGD, donGia, soLuong);
		LoaiVang = loaiVang;
	}

	public GiaoDichVang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichVang(String maGiaoDich, LocalDate ngayGD, double donGia, int soLuong) {
		super(maGiaoDich, ngayGD, donGia, soLuong);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String str= String.format("%-10s", getLoaiVang());
		return super.toString() + str;
	}

	@Override
	public double thanhtien() {
		double dongia = this.getDonGia();
		double soluong = this.getSoLuong();
		return dongia*soluong;
	}
}
