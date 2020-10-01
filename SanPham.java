import java.io.Serializable;

public class SanPham implements Serializable {
    private String maSanPham;
    private String tenSp;
    private String HangSX;
    private double gia;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSp, String hangSX, double gia) {
        this.maSanPham = maSanPham;
        this.tenSp = tenSp;
        HangSX = hangSX;
        this.gia = gia;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getHangSX() {
        return HangSX;
    }

    public void setHangSX(String hangSX) {
        HangSX = hangSX;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSp='" + tenSp + '\'' +
                ", HangSX='" + HangSX + '\'' +
                ", gia=" + gia +
                '}';
    }
}
