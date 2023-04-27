import java.util.Scanner;

public class NguyenVong {

    private String ma_Nganh;
    private String ten_Nganh;
    private String ma_Truong;
    private String khoi_XetTuyen;
    private Float diem_Thi;

    private ThiSinh thiSinh;



    public ThiSinh getThiSinh() {
        return thiSinh;
    }

    public void setThiSinh(ThiSinh thiSinh) {
        this.thiSinh = thiSinh;
    }

    public NguyenVong()
    {

    }

    public NguyenVong(String ma_Nganh, String ten_Nganh, String ma_Truong, String khoi_XetTuyen, Float diem_Thi) {
        this.ma_Nganh = ma_Nganh;
        this.ten_Nganh = ten_Nganh;
        this.ma_Truong = ma_Truong;
        this.khoi_XetTuyen = khoi_XetTuyen;
        this.diem_Thi = diem_Thi;
    }

    public String getMa_Nganh() {
        return ma_Nganh;
    }

    public void setMa_Nganh(String ma_Nganh) {
        this.ma_Nganh = ma_Nganh;
    }

    public String getTen_Nganh() {
        return ten_Nganh;
    }

    public void setTen_Nganh(String ten_Nganh) {
        this.ten_Nganh = ten_Nganh;
    }

    public String getMa_Truong() {
        return ma_Truong;
    }

    public void setMa_Truong(String ma_Truong) {
        this.ma_Truong = ma_Truong;
    }

    public String getKhoi_XetTuyen() {
        return khoi_XetTuyen;
    }

    public void setKhoi_XetTuyen(String khoi_XetTuyen) {
        this.khoi_XetTuyen = khoi_XetTuyen;
    }

    public Float getDiem_Thi() {
        return diem_Thi;
    }

    public void setDiem_Thi(Float diem_Thi) {
        this.diem_Thi = diem_Thi;
    }

    @Override
    public String toString() {
        return "NguyenVong{" +
                "ma_Nganh='" + ma_Nganh + '\'' +
                ", ten_Nganh='" + ten_Nganh + '\'' +
                ", ma_Truong='" + ma_Truong + '\'' +
                ", khoi_XetTuyen='" + khoi_XetTuyen + '\'' +
                ", diem_Thi=" + diem_Thi +
                ", thiSinh=" + thiSinh +
                '}';
    }


}
