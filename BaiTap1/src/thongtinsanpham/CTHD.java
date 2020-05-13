package thongtinsanpham;

public class CTHD 
{
    String sanPham;
    int soLuong;
    float donGia;
    int chietKhau;

    public CTHD(String sanPham, int soLuong, float donGia, int chietKhau){
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
       
    }

    @Override
    public String toString(){
        return "Chi tiet: San pham " + sanPham + " " + soLuong + " " + donGia + " " + chietKhau + "\n";
    }
}