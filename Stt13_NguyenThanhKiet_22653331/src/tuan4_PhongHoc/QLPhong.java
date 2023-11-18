package tuan4_PhongHoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class QLPhong implements PhuongThuc_DS{
	ArrayList<PhongHoc> dS;
	public QLPhong () {
		dS = new ArrayList<PhongHoc>();
	}
	
	public ArrayList<PhongHoc> getPhong(){
		return dS;
	}
	@Override
	public boolean them(PhongHoc p) throws Exception {
		if(dS.contains(p) == false)
			dS.add(p);
		else 
			throw new Exception("ma phong hoc da trung");
		return false;
	}
	
	public ArrayList<PhongHoc> getDSPLyThuyet(){
		ArrayList<PhongHoc> DSPLyThuyet = new ArrayList<PhongHoc>();
		for(PhongHoc p : dS)
			if(p instanceof LyThuyet)
				DSPLyThuyet.add((LyThuyet)p);
		return DSPLyThuyet;
	}
	
	public ArrayList<PhongHoc> getDSPMayTinh(){
		ArrayList<PhongHoc> DSPMayTinh = new ArrayList<PhongHoc>();
		for(PhongHoc p : dS)
			if(p instanceof MayTinh)
				DSPMayTinh.add((MayTinh)p);
		return DSPMayTinh;
	}
	
	public ArrayList<PhongHoc> getDSPThiNghiem(){
		ArrayList<PhongHoc> DSPThiNghiem = new ArrayList<PhongHoc>();
		for(PhongHoc p : dS)
			if(p instanceof ThiNghiem)
				DSPThiNghiem.add((ThiNghiem)p);
		return DSPThiNghiem;
	}
	@Override
	public int timKiemViTri(int maPhong) {
		PhongHoc findP = timKiem(maPhong);
		if (findP != null)
			return dS.indexOf(maPhong);
		return -1;
	}
	public PhongHoc timKiem (int maPhong) {
		for(PhongHoc p : dS)
			if(p.getMaPhong() == maPhong)
				return p;
		return null;
	}
	@Override
	public void sortDienTich() {
		Collections.sort(dS, new Comparator<PhongHoc>() {
			@Override
			public int compare(PhongHoc p1, PhongHoc p2) {
				// TODO Auto-generated method stub
				Double dT1 = (Double) p1.getDienTich();
				Double dT2 = (Double) p2.getDienTich();
				return dT1.compareTo(dT2);
			}
		});
	}
	@Override
	public void sortDayNha() {
		Collections.sort(dS, new Comparator<PhongHoc>() {
			@Override
			public int compare(PhongHoc p1, PhongHoc p2) {
				// TODO Auto-generated method stub
				String dN1 = (String) p1.getDayNha();
				String dN2 = (String) p2.getDayNha();
				return dN1.compareToIgnoreCase(dN2);
			}
		});
	}
	
	@Override
	public void sortSoBongDen() {
		Collections.sort(dS, new Comparator<PhongHoc>() {
			@Override
			public int compare(PhongHoc p1, PhongHoc p2) {
				// TODO Auto-generated method stub
				Integer b1 = (Integer) p1.getSoBongDen();
				Integer b2 = (Integer) p2.getSoBongDen();
				return b1.compareTo(b2);
			}
		});
	}
	@Override
	public void xoa(PhongHoc p) {
		dS.remove(p);
	}
	@Override
	public int tongSoPhong() {
		int i=0;
		for(PhongHoc p :dS)
			i++;
		return i;
	}
	
	
	public boolean capNhatSoMayTinh(int maPhong, int soMayTinh) {
		for (PhongHoc p : dS) {
			if (p instanceof MayTinh) {
				if (p.getMaPhong() == maPhong) {
					((MayTinh) p).setSoMayTinh(soMayTinh);;
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public ArrayList<PhongHoc> layDsDatChuan(){
		ArrayList<PhongHoc> kq = new ArrayList<PhongHoc>();
		for(PhongHoc p : dS)
			if(p.datChuan())
				kq.add(p);
		return kq;
	}


}
