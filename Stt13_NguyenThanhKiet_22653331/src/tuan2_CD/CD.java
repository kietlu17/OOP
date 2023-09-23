package tuan2_CD;

public class CD {
	private int maCD;
	private String tuaCD;
	private String caSi;
	private int soBaiHat;
	private float giaThanh;
	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}
	public String getCaSi() {
		return caSi;
	}
	public void setCaSi(String caSi) {
		this.caSi = caSi;
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public void setSoBaiHat(int soBaiHat) throws Exception {
		if(soBaiHat > 0)
			this.soBaiHat = soBaiHat;
		else 
			throw new Exception("So Bai Hat > 0");
	}
	public float getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(float giaThanh) throws Exception {
		if(giaThanh > 0)
			this.giaThanh = giaThanh;
		else 
			throw new Exception("So tien > 0");
	}
	public CD(int maCD, String tuaCD, String caSi, int soBaiHat, float giaThanh) {
		super();
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.caSi = caSi;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String str = String.format("\t%10d %20s %20s %10d %20f", getMaCD(), getTuaCD(), getCaSi(), getSoBaiHat(), getGiaThanh());
		return str;
	}
	
}
