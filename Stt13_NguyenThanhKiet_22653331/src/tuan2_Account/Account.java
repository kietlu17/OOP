package tuan2_Account;

public class Account {
	private long soTaiKhoan;
	private String tenTaiKhoan;
	private double soTienTrongTK;
	private final double LAIXUAT = 0.035;
	public long getSoTaiKhoan() {
		return soTaiKhoan;
	}
	public void setSoTaiKhoan(long soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}
	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}
	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}
	public double getSoTienTrongTK() {
		return soTienTrongTK;
	}
	public void setSoTienTrongTK(double soTienTrongTK) {
		this.soTienTrongTK = soTienTrongTK;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(long soTaiKhoan, String tenTaiKhoan, double soTienTrongTK) {
		super();
		this.soTaiKhoan = soTaiKhoan;
		this.tenTaiKhoan = tenTaiKhoan;
		this.soTienTrongTK = soTienTrongTK;
	}
	public Account(long soTaiKhoan, String tenTaiKhoan) {
		super();
		this.soTaiKhoan = soTaiKhoan;
		this.tenTaiKhoan = tenTaiKhoan;
		this.soTienTrongTK = 50000;
	}
	public void napTienTaiKhoan(double tienThemVao) throws Exception
	{
		if (tienThemVao>0)
		{
			this.soTienTrongTK+= tienThemVao;
		}
		else 
			throw new Exception("Tiền Nạp Phải >0");
	}
	public void rutTienTaiKhoan(double tienRutRa, double phiRutTien)
	{
		if (tienRutRa>0&& this.soTienTrongTK-phiRutTien>50000)
		{
			this.soTienTrongTK-=(tienRutRa+phiRutTien);
		}
	}
	public boolean chuyenKhoan(Account nguoiNhan,double soTienChuyen) throws Exception
	{
		if (soTienChuyen > 0&& this.soTienTrongTK-soTienChuyen-(soTienChuyen*0.003)>50000)
		{
			this.rutTienTaiKhoan(soTienChuyen, soTienChuyen*0.003);
			nguoiNhan.napTienTaiKhoan(soTienChuyen);
			return true;
		}
		return false;
	}
	public void daohan()
	{
		this.soTienTrongTK+=(this.soTienTrongTK*LAIXUAT);
	}
	@Override
	public String toString() {
		String str= String.format("%20d %-30s %-20.2f",getSoTaiKhoan(),getTenTaiKhoan(),getSoTienTrongTK());
		return str;
	}
	
}
