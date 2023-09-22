package tuan2_PhanSo;

public class PhanSo {
	private int numerator;//tu so
	private int denominator;//mau so
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	public PhanSo(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public PhanSo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int UCLN (int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else{
				b -= a;
			}
		}
		return a;
	}
	//Tối giản phân số
	public void Reduce() {
		int u = UCLN(this.getNumerator(), this.getDenominator());
		this.setDenominator(this.getDenominator() / u);
		this.setNumerator(this.getNumerator() / u);
	}
	//Nghịch đảo phân số
	public PhanSo reciprocal() {
		int ts = this.getDenominator();
		int ms = this.getNumerator();
		PhanSo psnd = new PhanSo(ts,ms);
		return psnd;
	}
	//Cộng 2 phân số
	public PhanSo add(PhanSo ps) {
		int ts = this.getNumerator() * ps.getDenominator() + ps.getNumerator() * ps.getDenominator();
		int ms = this.getDenominator() * ps.getDenominator();
		PhanSo pst = new PhanSo(ts,ms);
		return pst;
	}
	//Trừ 2 phân số
	public PhanSo subtract(PhanSo ps) {
		int ts = this.getNumerator() * ps.getDenominator() - ps.getNumerator() * ps.getDenominator();
		int ms = this.getDenominator() * ps.getDenominator();
		PhanSo pst = new PhanSo(ts,ms);
		return pst;
	}
	//Nhân 2 phân số
	public PhanSo multiply(PhanSo ps) {
		int ts = this.getNumerator() * ps.getNumerator();
		int ms = this.getDenominator() * ps.getDenominator();
		PhanSo psn = new PhanSo(ts,ms);
		return psn;
	}
	//Chia 2 phân số
	public PhanSo divide(PhanSo ps) {
		int ts = this.getNumerator() / ps.getNumerator();
		int ms = this.getDenominator() / ps.getDenominator();
		PhanSo psc = new PhanSo(ts,ms);
		return psc;
	}
	@Override
	public String toString() {
		String str = String.format("\t%d/%d",getNumerator(),getDenominator());
		return str;
	}
	
	
}
