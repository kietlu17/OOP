package tuan3_ChuyenXe;

import java.util.Objects;

public class ChuyenXe {
	protected String maCX, tenTaiXe, soXe;
	protected double doanhThu;
	
	public String getMaCX() {
		return maCX;
	}

	public void setMaCX(String maCX) {
		this.maCX = maCX;
	}

	public String getTenTaiXe() {
		return tenTaiXe;
	}

	public void setTenTaiXe(String tenTaiXe) {
		this.tenTaiXe = tenTaiXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maCX);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChuyenXe other = (ChuyenXe) obj;
		return Objects.equals(maCX, other.maCX);
	}
	
	
	public ChuyenXe(String maCX, String tenTaiXe, String soXe, double doanhThu) {
		super();
		this.maCX = maCX;
		this.tenTaiXe = tenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	

	public ChuyenXe() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ChuyenXe [maCX=" + maCX + ", tenTaiXe=" + tenTaiXe + ", soXe=" + soXe + ", doanhThu=" + doanhThu + "]";
	}
	
}
