package tuan2_QLSV2;

public class SinhVienArray {
	private SinhVien[] svs;
	public int SPTT = 0;
	
	public SinhVien[] getSV(){
		return svs;
	}
	public SinhVienArray() {
		super();
		svs =new SinhVien[1];
	}
	public boolean timSV (int maSV) {
		for(int i=0;i<SPTT; i++)
			if (maSV == svs[i].getMaSV())
				return true;
		return false;
	}
	public void add(SinhVien sv) throws Exception
	{
		if (!timSV(sv.getMaSV()))
		{
			if(SPTT == svs.length)
				svs = copyArray(svs, svs.length*2);
			svs[SPTT++]=sv;
		}
		else 
			throw new Exception("Thuc pham da ton tai");
	}

	public SinhVien[] copyArray(SinhVien[] arr, int length)
	{
		SinhVien[] newArr= new SinhVien[length];
		for(int i=0; i<SPTT; i++)
			newArr[i]= arr[i];
		return newArr;
	}
	public int searchIndexOfF(int  maSV) {
		for (int i = 0; i < SPTT; i++) 
			if(maSV == svs[i].getMaSV())
				return i;
		return -1;
	}
	public SinhVien searchSV (int maSV) {
		int i = searchIndexOfF(maSV);
		if(i != 1)
			return svs[i];
		else 
			return null;
	}
	public void deleteSV (int maSV) throws Exception {
		int index = searchIndexOfF(maSV);
		if (index != 1) {
			for (int i = index; i < SPTT-1; i++)
				svs[i] = svs[i+1];
			SPTT--;
		}else 
			throw new Exception("Khong Tim Thay Thuc Pham");
	}
	public void update(SinhVien sv) throws Exception {
		int i = searchIndexOfF(sv.getMaSV());
		if (i != -1)
			svs[i] = sv;
		else 
			throw new Exception("Khong Tim Thay Thuc Pham");
	}
	
	public SinhVien[] sort() {
		SinhVien[] sorted = copyArray(svs, SPTT);
		SinhVien temp;
		int n = SPTT;
		for (int i = 0; i < n - 1; i++) 
			for(int j = i+1; j < n ; j++) 
				if (sorted[i].getMaSV()>sorted[j].getMaSV()) {
					temp = sorted[i];
					sorted[i] = sorted[j];
					sorted[j] = temp;
			}
		return sorted;
	}
}
