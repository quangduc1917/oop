import com.sun.org.glassfish.gmbal.GmbalException;

public class GiamThi {

    private String ma_GiamThi;
    private String don_ViCT;
    private String ho_Ten;
    private String gioi_Tinh;
    private int nam_Sinh;
    private String que_Quan;


    public GiamThi()
    {}

    public GiamThi(String ma_GiamThi, String don_ViCT, String ho_Ten, String gioi_Tinh, int nam_Sinh, String que_Quan) {
        this.ma_GiamThi = ma_GiamThi;
        this.don_ViCT = don_ViCT;
        this.ho_Ten = ho_Ten;
        this.gioi_Tinh = gioi_Tinh;
        this.nam_Sinh = nam_Sinh;
        this.que_Quan = que_Quan;
    }

    public String getMa_GiamThi() {
        return ma_GiamThi;
    }

    public void setMa_GiamThi(String ma_GiamThi) {
        this.ma_GiamThi = ma_GiamThi;
    }

    public String getDon_ViCT() {
        return don_ViCT;
    }

    public void setDon_ViCT(String don_ViCT) {
        this.don_ViCT = don_ViCT;
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

    public int getNam_Sinh() {
        return nam_Sinh;
    }

    public void setNam_Sinh(int nam_Sinh) {
        this.nam_Sinh = nam_Sinh;
    }

    public String getQue_Quan() {
        return que_Quan;
    }

    public void setQue_Quan(String que_Quan) {
        this.que_Quan = que_Quan;
    }



    @Override
    public String toString() {
        return "GiamThi{" +
                "ma_GiamThi='" + ma_GiamThi + '\'' +
                ", don_ViCT='" + don_ViCT + '\'' +
                ", ho_Ten='" + ho_Ten + '\'' +
                ", gioi_Tinh='" + gioi_Tinh + '\'' +
                ", nam_Sinh=" + nam_Sinh +
                ", que_Quan='" + que_Quan + '\'' +
                '}';
    }


}
