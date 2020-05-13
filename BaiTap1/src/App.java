import hoadon.*;
import thongtinsanpham.*;
public class App {
    public static void main(String [] args) {
        HoaDon HD = new HoaDon.Builder().setHeader( new HoaDonHeader("MHD01", "11/5/2020", "Nguyen Y Van"))
        .addDSHD( new CTHD("thit ", 10, 1000, 1))
        .build();
        System.out.println(HD.toString());
    }
}