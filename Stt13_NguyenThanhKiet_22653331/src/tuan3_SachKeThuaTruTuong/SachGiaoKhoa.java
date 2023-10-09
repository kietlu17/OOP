package tuan3_SachKeThuaTruTuong;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach{
	private boolean tinhTrang;
	
	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Override
	double thanhTien() {
		// TODO Auto-generated method stub
		// true == moi; false == cu
		double tien;
		if(isTinhTrang())
			tien = soLuong * donGia;
		else 
			tien = soLuong * donGia * 0.5;
		return tien;
	}

	public SachGiaoKhoa(int maSach, int soLuong, String nXB, double donGia, LocalDate ngayNhap, boolean tinhTrang) {
		super(maSach, soLuong, nXB, donGia, ngayNhap);
		this.tinhTrang = tinhTrang;
	}

	public SachGiaoKhoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SachGiaoKhoa(int maSach, int soLuong, String nXB, double donGia, LocalDate ngayNhap) {
		super(maSach, soLuong, nXB, donGia, ngayNhap);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n Tinh Trang: "+ isTinhTrang() + "\n Thanh Tien: " + thanhTien() ;
	}
	
	
}
