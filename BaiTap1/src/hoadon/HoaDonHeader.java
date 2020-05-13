package hoadon;

public class HoaDonHeader {
    String maHD, ngayBan, tenKH;

    public HoaDonHeader(String maHD, String ngayBan, String tenKH){
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }
    @Override
    public String toString(){
        return "Thong tin chung: " + maHD + " " + ngayBan + " " + tenKH + "\n";
    }
}