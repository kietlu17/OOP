package tuan4_PhongHoc;

public class ThiNghiem extends PhongHoc {
	private String chuyenNganh;
	private int sucChua;
	private boolean bonRua;
	
	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public int getSucChua() {
		return sucChua;
	}

	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	public boolean isBonRua() {
		return bonRua;
	}

	public void setBonRua(boolean bonRua) {
		this.bonRua = bonRua;
	}
	

	public ThiNghiem(int maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua,
			boolean bonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.bonRua = bonRua;
	}
	
	public ThiNghiem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThiNghiem(int maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean datChuan() {
		// TODO Auto-generated method stub
		if (dK1() && bonRua == true)
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		String s = "có";
		if(bonRua == false)
			s = "không";
		return String.format("%s %15s %15d %15s\n", super.toString(), chuyenNganh, sucChua, s);
	}
}
