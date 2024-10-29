    package buoi3;
    public class An107445 { 
    public static String gioiTinh(boolean gt){
         return gt? "nam":"nữ";
}
public static void main(String[] args) {
    String maSV = "107445", hoVaTen = "Huỳnh Trần Bình An", ngaySinh = "24/12/2002",
    lop = "IT24A", khoa ="Công Nghệ Thông Tin", diaChi = "Đà Nẵng"; 
    int tuoi = 22;
    boolean gt = false;
    System.out.println("----------TTHÔNG TIN SINH VIÊN----------");
    System.out.println("Mã Sinh Viên: "+maSV);
    System.out.println("Họ Và Tên: "+hoVaTen);
    System.out.println("Ngày Sinh: "+ngaySinh);
    System.out.println("Tuổi:"+tuoi);
    System.out.println("Giới Tính: "+gioiTinh(gt));
    System.out.println("Lớp: "+lop);
    System.out.println("Khóa: "+khoa);
    System.out.println("Địa Chỉ: "+diaChi);
    System.out.println("-------HếT-------");

    }
}
