import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ThiSinh {

    private String SBD;
    private String ho_Ten;
    private String gioi_Tinh;
    private int namSinh;
    private String que_Quan;
    private Float diem_Thi;
    private Float diem_UuTien;


    public List<NguyenVong> getList_NguyenVong() {
        return list_NguyenVong;
    }

    public void setList_NguyenVong(List<NguyenVong> list_NguyenVong) {
        this.list_NguyenVong = list_NguyenVong;
    }

    private List<NguyenVong> list_NguyenVong;


    public ThiSinh() {

    }

    public ThiSinh(String SBD, String ho_Ten, String gioi_Tinh, int namSinh, String que_Quan, Float diem_Thi, Float diem_UuTien, List<NguyenVong> list_NguyenVong) {
        this.SBD = SBD;
        this.ho_Ten = ho_Ten;
        this.gioi_Tinh = gioi_Tinh;
        this.namSinh = namSinh;
        this.que_Quan = que_Quan;
        this.diem_Thi = diem_Thi;
        this.diem_UuTien = diem_UuTien;
        this.list_NguyenVong = list_NguyenVong;
    }

    public ThiSinh(String SBD, String ho_Ten, String gioi_Tinh, int namSinh, String que_Quan, Float diem_Thi, Float diem_UuTien) {
        this.SBD = SBD;
        this.ho_Ten = ho_Ten;
        this.gioi_Tinh = gioi_Tinh;
        this.namSinh = namSinh;
        this.que_Quan = que_Quan;
        this.diem_Thi = diem_Thi;
        this.diem_UuTien = diem_UuTien;
    }

    public String getSBD() {
        return SBD;
    }

    public void setSBD(String SBD) {
        this.SBD = SBD;
    }

    public String getHo_Ten() {
        return ho_Ten;
    }

    public void setHo_Ten(String ho_Ten) {
        this.ho_Ten = ho_Ten;
    }

    public String getGioi_Tinh() {
        return gioi_Tinh;
    }

    public void setGioi_Tinh(String gioi_Tinh) {
        this.gioi_Tinh = gioi_Tinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getQue_Quan() {
        return que_Quan;
    }

    public void setQue_Quan(String que_Quan) {
        this.que_Quan = que_Quan;
    }

    public Float getDiem_Thi() {
        return diem_Thi;
    }

    public void setDiem_Thi(Float diem_Thi) {
        this.diem_Thi = diem_Thi;
    }

    public Float getDiem_UuTien() {
        return diem_UuTien;
    }

    public void setDiem_UuTien(Float diem_UuTien) {
        this.diem_UuTien = diem_UuTien;
    }




    public ThiSinh showTrungTuyen(ThiSinh ts, String ma_Nganh, float diem_Chuan) {
        int size = ts.list_NguyenVong.size();
        for (int i = 0; i < size; i++) {
            if (ts.getList_NguyenVong().get(i).getMa_Nganh().equals(ma_Nganh)) {

                if (ts.getList_NguyenVong().get(i).getDiem_Thi() > diem_Chuan) {

                    return ts;

                }
            }
        }

        return null;
    }
    public ThiSinh showTrungTuyen1(ThiSinh ts, String ma_Nganh, float diem_Chuan) {
        int size = ts.list_NguyenVong.size();
        for (int i = 0; i < size; i++) {
            if (ts.getList_NguyenVong().get(i).getMa_Nganh().equals(ma_Nganh))
            {
                if (ts.getList_NguyenVong().get(i).getDiem_Thi() > diem_Chuan) {

                    return ts;
                }

            }

        }
        return null;
        }

    @Override
    public String toString() {
        float diem_tong=this.diem_Thi+this.diem_UuTien;
        return "ThiSinh{" +
                "SBD='" + SBD + '\'' +
                ", ho_Ten='" + ho_Ten + '\'' +
                ", gioi_Tinh='" + gioi_Tinh + '\'' +
                ", namSinh=" + namSinh +
                ", que_Quan='" + que_Quan + '\'' +
                ", diem_Thi=" + diem_Thi +
                ", diem_UuTien=" + diem_UuTien +
                ", diem_tong là" + diem_tong +
                '}';
    }

//    public void nhapThongTin(Scanner sc) {
//
//    }
}
