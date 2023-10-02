package tuan3_ChuyenXe;

public class NoiThanh extends ChuyenXe{
	private int soTuyen;
	private double soKm;
	public int getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}
	public double getSoKm() {
		return soKm;
	}
	public void setSoKm(double soKm) {
		this.soKm = soKm;
	}
	public NoiThanh(String maCX, String tenTaiXe, String soXe, double doanhThu, int soTuyen, double soKm) {
		super(maCX, tenTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}
	public NoiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NoiThanh(String maCX, String tenTaiXe, String soXe, double doanhThu) {
		super(maCX, tenTaiXe, soXe, doanhThu);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n So Tuyen: " + getSoTuyen() + "\n So Km di duoc:" + getSoKm();
	}
}
