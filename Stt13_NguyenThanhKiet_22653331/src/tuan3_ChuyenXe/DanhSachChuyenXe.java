package tuan3_ChuyenXe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachChuyenXe {
	ArrayList<ChuyenXe> DS;
	
	public DanhSachChuyenXe() {
		DS = new ArrayList<ChuyenXe>();
	}
	
	public ArrayList<ChuyenXe> getDS(){
		return DS;
	}
	public void them(ChuyenXe xe) throws Exception {
		if(DS.contains(xe) == false)
			DS.add(xe);
		else 
			throw new Exception("Ma Xe Da Bi Trung");
	}
	
	public ArrayList<ChuyenXe> getDSNoiThanh() {
		ArrayList<ChuyenXe> DSxeNoiThanh = new ArrayList<ChuyenXe>();
		for(ChuyenXe xe : DS)
			if(xe instanceof NoiThanh)
				DSxeNoiThanh.add((NoiThanh)xe);
		return DSxeNoiThanh;
	}
	
	public ArrayList<ChuyenXe> getDSNgoaiThanh() {
		ArrayList<ChuyenXe> DSxeNgoaiThanh = new ArrayList<ChuyenXe>();
		for(ChuyenXe xe : DS)
			if(xe instanceof NgoaiThanh)
				DSxeNgoaiThanh.add((NgoaiThanh)xe);
		return DSxeNgoaiThanh;
	}
	public int timKiemViTri(String maCX) {
		ChuyenXe findXe = timKiem(maCX);
		if(findXe != null)
			return DS.indexOf(timKiem(maCX));
		return -1;
	}
	
	public ChuyenXe timKiem(String maCx) {
		for(ChuyenXe xe : DS)
			if(xe.getMaCX().equalsIgnoreCase(maCx))
				return xe;
		return null;
	}
	
	public void xoa(ChuyenXe xe) {
		DS.remove(xe);
	}
	
	public double tinhDoanhThu() {
		double s = 0;
		for(ChuyenXe xe : DS)
			s += xe.getDoanhThu();
		return s;
	}
	
	public void sua(ChuyenXe xe) {
		int i = timKiemViTri(xe.getMaCX());
		DS.set(i, xe);
	}
	
	public void sortDoanhThu() {
		Collections.sort(DS, new Comparator<ChuyenXe>() {

			@Override
			public int compare(ChuyenXe xe1, ChuyenXe xe2) {
				Double doanhThuXe1 = (Double) xe1.getDoanhThu();
				Double doanhThuXe2 = (Double) xe2.getDoanhThu();
				return doanhThuXe1.compareTo(doanhThuXe2);
			}
		});
	}
	
	public void sortTenTaiXe() {
		Collections.sort(DS, new Comparator<ChuyenXe>() {

			@Override
			public int compare(ChuyenXe tai1, ChuyenXe tai2) {
				return tai1.getTenTaiXe().compareToIgnoreCase(tai2.getTenTaiXe());
			}	
		});
	}
}
