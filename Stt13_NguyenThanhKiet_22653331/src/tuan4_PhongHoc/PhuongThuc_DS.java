package tuan4_PhongHoc;

import java.util.ArrayList;

public interface PhuongThuc_DS {
	ArrayList<PhongHoc> getPhong();
	ArrayList<PhongHoc> layDsDatChuan() throws Exception;
	int timKiemViTri(int maPhong);
	void xoa(PhongHoc p);
	boolean them(PhongHoc p) throws Exception;
	PhongHoc timKiem(int maPhong);
	boolean capNhatSoMayTinh(int maPhong, int soMayTinh);
	int tongSoPhong();
	void sortDayNha();
	void sortDienTich();
	void sortSoBongDen();
}
 