package tuan3_SachKeThuaTruTuong;

import java.text.DecimalFormat;
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
		String s="mới";
		if(tinhTrang==false) s="cũ";
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%s %15s %20s\n", super.toString(), s, df.format(thanhTien()));
	}
	
	
}
