package tuan2_HangThucPham;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ThucPham {
	private String code, name;
	private double price;
	private LocalDate ngSX;
	private LocalDate ngHH;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getNgSX() {
		return ngSX;
	}
	public void setNgSX(LocalDate ngSX) {
		this.ngSX = ngSX;
	}
	public LocalDate getNgHH() {
		return ngHH;
	}
	public void setNgHH(LocalDate ngHH) {
		this.ngHH = ngHH;
	}

	public ThucPham(String code, String name, double price, LocalDate ngSX, LocalDate ngHH) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.ngSX = ngSX;
		this.ngHH = ngHH;
	}
	
	public ThucPham(String code) {
		super();
		this.code = code;
	}
	public ThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean kiemTraHetHan() {
		if (this.ngHH.isBefore(LocalDate.now()))
			return true;
		return false;
	}
	@Override
	public String toString() {
		DecimalFormat fm= new DecimalFormat("#,##0.00");
		String dg = fm.format(this.price);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String daySX = dtf.format(this.ngSX);
		String dayHH = dtf.format(this.ngHH);
		
		String ghiChu="";
		if (kiemTraHetHan() == true) 
			ghiChu="Hàng hết hạn";
		
		return String.format("\t%-7s %20s %30s %30s %30s", getCode(), getName(), getPrice(), daySX, dayHH,ghiChu);
	}
	
	
}
