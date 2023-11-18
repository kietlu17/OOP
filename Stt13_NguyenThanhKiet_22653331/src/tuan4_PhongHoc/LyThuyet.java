package tuan4_PhongHoc;

public class LyThuyet extends PhongHoc {
	private boolean mayChieu;
	
	public boolean isMayChieu() {
		return mayChieu;
	}

	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}
	
	public LyThuyet(int maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.mayChieu = mayChieu;
	}
	
	public LyThuyet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LyThuyet(int maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean datChuan() {
		if(mayChieu == true && dK1() )
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		String s="có";
		if(mayChieu==false) s="không";
		return String.format("%s %15s\n", super.toString(), s);
	}
	
}
