package tuan4_PhongHoc;

public class MayTinh extends PhongHoc{
	private int soMayTinh;

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	@Override
	boolean datChuan() {
		// TODO Auto-generated method stub
		
		if(super.dK1() && super.getDienTich()/1.5 <= soMayTinh )
			return true;
		else
			return false;
	}

	public MayTinh(int maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}

	public MayTinh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MayTinh(int maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}
	
}
