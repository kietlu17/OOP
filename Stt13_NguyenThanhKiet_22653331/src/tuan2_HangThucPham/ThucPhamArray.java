package tuan2_HangThucPham;

import tuan2_Account.Account;

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
}
