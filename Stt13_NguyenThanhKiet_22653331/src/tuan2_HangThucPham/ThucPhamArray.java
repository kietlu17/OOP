package tuan2_HangThucPham;


public class ThucPhamArray {
	private ThucPham[] foods;
	public int SPTT = 0;
	public ThucPham[] getFood() {
		return foods;
	}
	public ThucPhamArray() {
		super();
		foods =new ThucPham[1];
	}
	public boolean timTP (String code) {
		for(int i=0;i<SPTT; i++)
			if (code.equals(foods[i].getCode()))
				return true;
		return false;
	}
	public void add(ThucPham food) throws Exception
	{
		if (!timTP(food.getCode()))
		{
			if(SPTT == foods.length)
				foods = copyArray(foods, foods.length*2);
			foods[SPTT++]=food;
		}
		else 
			throw new Exception("Thuc pham da ton tai");
	}

	public ThucPham[] copyArray(ThucPham[] arr, int length)
	{
		ThucPham[] newArr= new ThucPham[length];
		for(int i=0; i<SPTT; i++)
			newArr[i]= arr[i];
		return newArr;
	}
	public int searchIndexOfF(String code) {
		for (int i = 0; i < SPTT; i++) 
			if(code.equals(foods[i].getCode()))
				return i;
		return -1;
	}
	public ThucPham searchFD (String code) {
		int i = searchIndexOfF(code);
		if(i != 1)
			return foods[i];
		else 
			return null;
	}
	public void deletFood (String code) throws Exception {
		int index= searchIndexOfF(code);
		if (index != 1) {
			for (int i= index; i < SPTT-1; i++)
				foods[i] = foods[i+1];
			SPTT--;
		}else 
			throw new Exception("Khong Tim Thay Thuc Pham");
	}
	public void update(ThucPham food) throws Exception {
		int i = searchIndexOfF(food.getCode());
		if (i != -1)
			foods[i] = food;
		else 
			throw new Exception("Khong Tim Thay Thuc Pham");
	}
	
	public ThucPham[] sort () {
		ThucPham[]sorted = copyArray(foods, SPTT);
		ThucPham temp;
		int n = SPTT;
		for (int i = 0; i < n - 1; i++) 
			for(int j = 0; j < n - i - 1; j++) 
				if (sorted[j].getPrice()>sorted[j].getPrice()) {
					temp = sorted[i];
					sorted[j] = sorted[j + 1];
					sorted[j + 1] = temp;
			}
		return sorted;
	}
}
