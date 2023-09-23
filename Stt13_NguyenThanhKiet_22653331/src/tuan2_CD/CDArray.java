package tuan2_CD;

public class CDArray {	
		private CD[] cds;
		public int SPTT = 0;
		
		public CD[] getCD(){
			return cds;
		}
		public CDArray() {
			super();
			cds =new CD[1];
		}
		public boolean timCD (int maCD) {
			for(int i=0;i<SPTT; i++)
				if (maCD == cds[i].getMaCD())
					return true;
			return false;
		}
		public void add(CD cd) throws Exception
		{
			if (!timCD(cd.getMaCD()))
			{
				if(SPTT == cds.length)
					cds = copyArray(cds, cds.length*2);
				cds[SPTT++]=cd;
			}
			else 
				throw new Exception("CD da ton tai");
		}

		public CD[] copyArray(CD[] arr, int length)
		{
			CD[] newArr= new CD[length];
			for(int i=0; i<SPTT; i++)
				newArr[i]= arr[i];
			return newArr;
		}
		public int searchIndexOfF(int  maCD) {
			for (int i = 0; i < SPTT; i++) 
				if(maCD == cds[i].getMaCD())
					return i;
			return -1;
		}
		public CD searchCD (int maCD) {
			int i = searchIndexOfF(maCD);
			if(i != 1)
				return cds[i];
			else 
				return null;
		}
		public void deleteSV (int maCD) throws Exception {
			int index = searchIndexOfF(maCD);
			if (index != 1) {
				for (int i = index; i < SPTT-1; i++)
					cds[i] = cds[i+1];
				SPTT--;
			}else 
				throw new Exception("Khong Tim Thay CD");
		}
		public void update(CD cd) throws Exception {
			int i = searchIndexOfF(cd.getMaCD());
			if (i != -1)
				cds[i] = cd;
			else 
				throw new Exception("Khong Tim Thay CD");
		}
		
		public CD[] sort() {
			CD[] sorted = copyArray(cds, SPTT);
			CD temp;
			int n = SPTT;
			for (int i = 0; i < n - 1; i++) 
				for(int j = i+1; j < n ; j++) 
					if (sorted[i].getGiaThanh() < sorted[j].getGiaThanh()) {
						temp = sorted[i];
						sorted[i] = sorted[j];
						sorted[j] = temp;
				}
			return sorted;
		}
}


