package tuan3_GiaoDichTienVang;

import java.time.LocalDate;

public class GiaoDichTien extends GiaoDich{
	private String TyGia;

	public String getTyGia() {
		return TyGia;
	}

	public void setTyGia(String tyGia) {
		TyGia = tyGia;
	}

	public GiaoDichTien(String maGiaoDich, LocalDate ngayGD, double donGia, int soLuong, String tyGia) {
		super(maGiaoDich, ngayGD, donGia, soLuong);
		TyGia = tyGia;
	}

	public GiaoDichTien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichTien(String maGiaoDich, LocalDate ngayGD, double donGia, int soLuong) throws Exception {
		super(maGiaoDich, ngayGD, donGia, soLuong);
		// TODO Auto-generated constructor stub
		if((TyGia.equalsIgnoreCase("vn")||TyGia.equalsIgnoreCase("usd") || TyGia.equalsIgnoreCase("euro")))
		{
			this.TyGia = TyGia;
		}
		else
		{
			throw new Exception("Loại phải là vn, usd hoac euro!");
		}
	}
	public double thanhTien()
	{
		double soluong= this.getSoLuong();
		double donGia= this.getDonGia();
		String TyGia= this.getTyGia();
		return TyGia.equalsIgnoreCase("vn")? soluong*donGia : soluong*donGia;
	}
	@Override
	public String toString() {
		String str= String.format("%-13s", getTyGia());
		return super.toString() + str;
	}
}
