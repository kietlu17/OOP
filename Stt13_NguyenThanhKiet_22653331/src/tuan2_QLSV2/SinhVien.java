package tuan2_QLSV2;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private String diaChi;
	private String sdt;
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void setSdt(String sdt) throws Exception {
		if(sdt.length() == 10 && sdt.matches("\\d+"))
			this.sdt = sdt;
		else 
			throw new Exception("Số không có độ dài bằng 10 hoặc không phải số điện thoại");
	}
	public String getSdt() {
		return sdt;
	}
	
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SinhVien(int maSV, String hoTen, String sdt, String diaChi) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.sdt = sdt;
	}

	@Override
	public String toString() {
		String str = String.format("\t %20s %30s %30s %30s", getMaSV(), getHoTen(), getSdt(), getDiaChi());
		return str;
	}
}
