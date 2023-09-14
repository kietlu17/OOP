package tuan1_DangKiXe;

public class Vehicle {
	public String tenChu;
	public String tenXe;
	public int dungTich;
	public int giaTri;
	public String getTenChu() {
		return tenChu;
	}
	public void setTenChu(String tenChu) {
		this.tenChu = tenChu;
	}
	public String getTenXe() {
		return tenXe;
	}
	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}
	public int getGiaTri() {
		return giaTri;
	}
	public void setGiaTri(int giaTri) {
		this.giaTri = giaTri;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String tenChu, String tenXe, int dungTich, int giaTri) {
		super();
		this.tenChu = tenChu;
		this.tenXe = tenXe;
		this.dungTich = dungTich;
		this.giaTri = giaTri;
	}
	
	public int thue() {
		int x;
		if (this.getDungTich()>=200) {
			x=(getGiaTri()/100)*5;
		}
		else if (getDungTich()>=100) {
			x=(getGiaTri()/100)*3;
		}
		else {
			x=(getGiaTri()/100)*1;
		}
		return x;
	}
	@Override
	public String toString() {
		String str=String.format("%-20s %-20s %10d %10d %10d",getTenChu(),getTenXe(),getDungTich(),getGiaTri(),thue());
		return str;
	}
	
}
