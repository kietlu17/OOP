package tuan3_GiaoDichTienVang;

import java.util.ArrayList;
import java.util.List;

public class GiaoDichArray {
	List<GiaoDich> Danhsach;
	List k;
	public GiaoDichArray()
	{
		Danhsach= new ArrayList<GiaoDich>();
	}
	public List<GiaoDich> getDanhSach(){
		return Danhsach;
	}
	public List<GiaoDich> getDanhSachGDVang(){
		List<GiaoDich> DSGiaoDichVang= new ArrayList<GiaoDich>();
		for(GiaoDich giaodich : Danhsach) {
			if(giaodich instanceof GiaoDichVang) {
				DSGiaoDichVang.add( giaodich);
			}
		}
		return DSGiaoDichVang;
	}
	public List<GiaoDich> getDanhSachGDTien(){
		List<GiaoDich> DSGiaoDichTien= new ArrayList<GiaoDich>();
		for(GiaoDich giaodich : Danhsach) {
			if(giaodich instanceof GiaoDichTien) {
				DSGiaoDichTien.add( giaodich);
			}
		}
		return DSGiaoDichTien;
	}
	public void addGiaoDich(GiaoDich giaodich) throws Exception{
		if(Danhsach.contains(giaodich)==false)
		{
			Danhsach.add(giaodich);
		}
		else
			throw new Exception("Không thể thêm do trùng mã Giao dịch!");
	}
	public int tongSoGDVang()
	{
		int i=0;
		for(GiaoDich giaodich : Danhsach) {
			if(giaodich instanceof GiaoDichVang) {
				i++;
			}
		}
		return i;
	}
	public int tongSoGDTien()
	{
		int i=0;
		for(GiaoDich giaodich : Danhsach) {
			if(giaodich instanceof GiaoDichTien){
				i++;
			}
		}
		return i;
	}
	public double TrungBinhThanhTiens()
	{
		double Tong=0;
		int i=0;
		for(GiaoDich giaodich : Danhsach) {
			if(giaodich instanceof GiaoDichTien) {
				i++;
				GiaoDichTien giaodich1=(GiaoDichTien) giaodich;
				Tong=Tong+giaodich1.thanhTien();
			}
		}
		return Tong/i;
	}
	public List<GiaoDich> getDanhSachGDTienLonHon1Ty(){
		List<GiaoDich> DSGiaoDichTien= new ArrayList<GiaoDich>();
		for(GiaoDich giaodich : Danhsach) {
			if(giaodich instanceof GiaoDichTien && ((GiaoDichTien) giaodich).thanhTien()>1000000000) {
				DSGiaoDichTien.add( giaodich);
				
			}
			
	}
		return DSGiaoDichTien;
		}
	public List<GiaoDich> getDanhSachGDVangLonHon1Ty(){
		List<GiaoDich> DSGiaoDichVang= new ArrayList<GiaoDich>();
		for(GiaoDich giaodich : Danhsach) {
			if(giaodich instanceof GiaoDichVang && ((GiaoDichVang) giaodich).ThanhTien()>1000000000) {
				DSGiaoDichVang.add( giaodich);
				
			}
			
	}
		return DSGiaoDichVang;
		}
}
