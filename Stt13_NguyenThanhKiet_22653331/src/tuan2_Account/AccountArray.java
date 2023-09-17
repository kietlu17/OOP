package tuan2_Account;

import java.net.SocketTimeoutException;

public class AccountArray {
	private  Account[] accounts;
	public int SPTT=0;
	public Account[] getAccount()
	{
		return accounts;
	}
	
	public AccountArray()
	{
		super();
		accounts =new Account[1];
	}
	
	public boolean isExistingAccNumber(long accountNumber)
	{
		for(int i=0;i<SPTT; i++)
			if (accountNumber == accounts[i].getSoTaiKhoan())
					return true;
		return false;
	}
	
	public void add(Account acc) throws Exception
	{
		if (!isExistingAccNumber(acc.getSoTaiKhoan()))
		{
			if(SPTT == accounts.length)
				accounts = copyArray(accounts, accounts.length*2);
			accounts[SPTT++]=acc;
		}
		else 
			throw new Exception("So TK da ton tai");
	}
	public Account[] copyArray(Account[] arr, int length)
	{
		Account[] newArr= new Account[length];
		for(int i=0; i<SPTT; i++)
			newArr[i]= arr[i];
		return newArr;
	}
	
	public int searchIndexOfAcc(long accNumber) {
		for (int i = 0; i < SPTT; i++) 
			if(accounts[i].getSoTaiKhoan() == accNumber)
				return i;
		return -1;
	}
	
	public Account searchAcc (long accNumber) {
		int i = searchIndexOfAcc(accNumber);
		if(i != 1)
			return accounts[i];
		else 
			return null;
	}
	public void deletAccount (long accNumber) throws Exception {
		int index= searchIndexOfAcc(accNumber);
		if (index != 1) {
			for (int i= index; i < SPTT-1; i++)
				accounts[i] = accounts[i+1];
			SPTT--;
		}else 
			throw new Exception("Khong Tim Thay Tai Khoan");
	}
	public void update(Account acc) throws Exception {
		int i = searchIndexOfAcc(acc.getSoTaiKhoan());
		if (i != -1)
			accounts[i] = acc;
		else 
			throw new Exception("Khong tim thay tai khoan");
	}
	
	public Account[] sort () {
		Account[]sorted=copyArray(accounts, SPTT);
		Account temp;
		int n=SPTT;
		for (int i=0; i<n-1;i++) 
			for(int j=i;j<n;j++) 
				if (sorted[i].getSoTienTrongTK()>sorted[j].getSoTienTrongTK()) {
					temp = sorted[i];
					sorted[i] = sorted[j];
					sorted[j] = temp;
			}
		return sorted;
	}
}

