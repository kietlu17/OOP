package tuan3_SachKeThuaTruTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QLSach {
	ArrayList<Sach> DS;
	
	public QLSach() {
		DS = new ArrayList<Sach>();
	}
	
	public ArrayList<Sach> getSach(){
		return DS;
	}
	
	public void them(Sach sa) throws Exception {
		if(DS.contains(sa) == false)
			DS.add(sa);
		else 
			throw new Exception("ma Sach da trung");
	}
	
	public ArrayList<Sach> getDSSachGiaoKhoa(){
		ArrayList<Sach> DSSachGiaoKhoa = new ArrayList<Sach>();
		for(Sach sa : DS)
			if(sa instanceof SachGiaoKhoa)
				DSSachGiaoKhoa.add((SachGiaoKhoa)sa);
		return DSSachGiaoKhoa;
	}
	
	public ArrayList<Sach> getDSSachThamKhao(){
		ArrayList<Sach> DSSachThamKhao = new ArrayList<Sach>();
		for(Sach sa : DS)
			if(sa instanceof SachThamKhao)
				DSSachThamKhao.add((SachThamKhao)sa);
		return DSSachThamKhao;
	}
	
	public int timKiemVitri(int maSach) {
		Sach findSa = timKiem(maSach);
		if(findSa != null)
			return DS.indexOf(maSach);
		return -1;
	}
	
	public Sach timKiem(int maSach) {
		for(Sach sa : DS)
			if(sa.getMaSach() == maSach)
				return sa;
		return null;
	}
	
	public void sua(Sach sa) {
		int i = timKiemVitri(sa.getMaSach());
		DS.set(i, sa);
	}
	
	public void sortMaSach() {
		Collections.sort(DS, new Comparator<Sach>() {

			@Override
			public int compare(Sach s1, Sach s2) {
				Integer maSach1 = (Integer) s1.getMaSach();
				Integer maSach2 = (Integer) s2.getMaSach();
				return maSach1.compareTo(maSach2);
			}
			
		});
	}

	public void xoa(Sach sa) {
		DS.remove(sa);
	}

}
