package tuan1_HinhChuNhat;

public class HinhChuNhat {
	private int  chieuDai;
	private int  chieuRong;
	public int getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}
	public int getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HinhChuNhat(int chieuDai, int chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
		
	public int chuVi()
	{
		int cd= this.getChieuDai();
		int cr= getChieuRong();
		int cv=(cd+cr)*2;
		return cv;
	}
	
	public long dienTich()
	{

		int cd= this.getChieuDai();
		int cr= getChieuRong();
		int dt=(cd*cr);
		return dt;
	}
	@Override
	public String toString() {
		String str=String.format("%10d %10d %10d %10d",getChieuDai(),getChieuRong(),chuVi(),dienTich());
		return str;
	}
	
}
