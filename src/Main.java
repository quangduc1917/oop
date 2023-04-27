import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        String choose = null;
        boolean exit = false;

        List<ThiSinh> ds_ts = new ArrayList<ThiSinh>();
        List<GiamThi> ds_gt = new ArrayList<GiamThi>();




            System.out.print("Nhap so luong sinh vien: ");
            int n = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap danh sach sinh vien: ");
            for (int i = 0; i < n; i++) {
                System.out.println("Sinh vien thu " + (i + 1) + " la:");
                ThiSinh ts = new ThiSinh();
                ts.setSBD(inputSBD());
                ts.setHo_Ten(inputHoten());
                ts.setGioi_Tinh(inputGioiTinh());
                ts.setNamSinh(inputNamSinh());
                ts.setQue_Quan(inputQueQuan());
                ts.setDiem_Thi(inputDiemThi());
                ts.setDiem_UuTien(inputDiemUuTien());


                System.out.println("Nhập số nguyện vọng của sinh viên "+ts.getHo_Ten());
                int nv = Integer.parseInt(scanner.nextLine());
                List<NguyenVong> ds_nguyenvong = new ArrayList<NguyenVong>();
                for (int j= 0; j < nv;j++) {
                    NguyenVong nv_ts= new NguyenVong();
                    nv_ts.setMa_Nganh(inputMaNganh());

                    nv_ts.setTen_Nganh(inputTenNganh());
                    nv_ts.setMa_Truong(inputMaTruong());
                    nv_ts.setKhoi_XetTuyen(inputKhoi());
                    nv_ts.setDiem_Thi(ts.getDiem_Thi()+ ts.getDiem_UuTien());
                    nv_ts.setThiSinh(ts);
                    ds_nguyenvong.add(nv_ts);
                }
                ts.setList_NguyenVong(ds_nguyenvong);
                ds_ts.add(ts);
            }
        System.out.print("Nhap so luong giam thi: ");
        int sl_gt = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap danh sach giám thị: ");
        for (int sl = 0; sl < sl_gt; sl++) {
            System.out.println("Giám thị thứ " + (sl + 1) + " la:");
            GiamThi gt = new GiamThi();
            gt.setMa_GiamThi(inputMGT());
            gt.setDon_ViCT(inputMaTruong());
            gt.setHo_Ten(inputHoten());
            gt.setGioi_Tinh(inputGioiTinh());
            gt.setNam_Sinh(inputNamSinh());
            gt.setQue_Quan(inputQueQuan());

            ds_gt.add(gt);

        }
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Nhập SBD sinh vien cần chỉnh sửa:");
                    String SBD = scanner.nextLine();
                    boolean isExisted = false;
                    int size = ds_ts.size();
                    for (int i = 0; i < size; i++) {
                        if (ds_ts.get(i).getSBD().equals(SBD)) {
                            isExisted = true;
//                            ds_ts.get(i).setSBD(inputSBD();
                            ds_ts.get(i).setHo_Ten(inputHoten());
                            ds_ts.get(i).setGioi_Tinh(inputGioiTinh());
                            ds_ts.get(i).setNamSinh(inputNamSinh());
                            ds_ts.get(i).setQue_Quan(inputQueQuan());
                            ds_ts.get(i).setDiem_Thi(inputDiemThi());
                            ds_ts.get(i).setDiem_UuTien(inputDiemUuTien());

                        }
                    }
                    if (!isExisted) {
                        System.out.printf("SBD = %d not existed.\n", SBD);
                    } else {
                    }
                    break;
                case "3":
                    System.out.println("Nhập mã giám thị cần chỉnh sửa:");
                    String maGT = scanner.nextLine();

                    int size_gt = ds_gt.size();
                    for (int i = 0; i < size_gt; i++) {
                        if (ds_gt.get(i).getMa_GiamThi().equals(maGT))
                        {
//                            ds_ts.get(i).setSBD(inputSBD();
                            ds_gt.get(i).setDon_ViCT(inputDVCT());
                            ds_gt.get(i).setHo_Ten(inputHoten());
                            ds_gt.get(i).setGioi_Tinh(inputGioiTinh());
                            ds_gt.get(i).setNam_Sinh(inputNamSinh());
                            ds_gt.get(i).setQue_Quan(inputQueQuan());


                        }
                    }

                    break;
                case "4":

                    System.out.println("Nhập mã ngành:");
                    String ma_Nganh = scanner.nextLine();
                    System.out.println("Nhập điểm chuẩn để xét tuyển");
                    Float diem_Chuan = Float.valueOf(scanner.nextLine());

                    int size1 = ds_ts.size();
                    List<ThiSinh> sx_ts2= new ArrayList<ThiSinh>();

                    for (int i = 0; i < size1; i++) {
                        if(ds_ts.get(i).showTrungTuyen(ds_ts.get(i),ma_Nganh,diem_Chuan)!=null)
                        {
                            sx_ts2.add(ds_ts.get(i));
                        }
                    }
                    System.out.println("Danh sách những sinh viên trúng truyển mã ngành "+ma_Nganh+" là:");
                    for (ThiSinh student : sx_ts2) {
                        System.out.println(student.toString());
                    }

                    break;
                case "5":
                    System.out.println("Nhập mã ngành:");
                    String ma_Nganh1 = scanner.nextLine();
                    System.out.println("Nhập điểm chuẩn để xét tuyển:");
                    Float diem_Chuan1 = Float.valueOf(scanner.nextLine());

                    int size3 = ds_ts.size();
                    List<ThiSinh> sx_ts= new ArrayList<ThiSinh>();
                    for (int i = 0; i < size3; i++) {
                        if(ds_ts.get(i).showTrungTuyen1(ds_ts.get(i),ma_Nganh1,diem_Chuan1)!=null)
                        {
                            sx_ts.add(ds_ts.get(i));
                        }
                    }
                    Collections.sort(sx_ts, new Comparator<ThiSinh>() {
                        @Override
                        public int compare(ThiSinh o1, ThiSinh o2) {
                            return o1.getDiem_Thi() < o2.getDiem_Thi() ? 1 : -1;
                        }
                    });
                    // show list students
                    System.out.println("Danh sách trúng tuyển ngành "+ma_Nganh1+" theo thứ tự giảm dần là: \n");
                    for (ThiSinh student : sx_ts) {
                        System.out.println(student.toString());
                    }
                    break;
                case "6":
                    System.out.println("Danh sách những giám thị quê TPHCM là \n");

                    int size_gt1 = ds_gt.size();
                    for (int i = 0; i < size_gt1; i++) {
                        if (ds_gt.get(i).getQue_Quan().equals("TPHCM"))
                        {
                            ds_gt.get(i).toString();
                        }
                    }

                    break;
                case "0":

                default:

            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }
    private static String inputSBD() {
        System.out.print("Nhập SBD: ");
        return scanner.nextLine();
    };
    private static String inputMGT() {
        System.out.print("Nhập mã giám thị: ");
        return scanner.nextLine();
    };
    private static String inputDVCT() {
        System.out.print("Nhập Đơn vị công tác: ");
        return scanner.nextLine();
    };
    private static Integer inputNamSinh() {
        System.out.print("Nhập Năm Sinh: ");
        return Integer.parseInt(scanner.nextLine());
    };
    private static String inputQueQuan() {
        System.out.print("Nhập Quê Quán: ");
        return scanner.nextLine();
    };
    private static String inputHoten() {
        System.out.print("Nhập Ho ten: ");
        return scanner.nextLine();
    };

    private static String inputGioiTinh() {
        System.out.print("Nhập giới tính: ");
        return scanner.nextLine();
    };
    private static Float inputDiemThi() {
        System.out.print("Nhập Điểm Thi: ");
        return Float.parseFloat(scanner.nextLine());
    };
    private static Float inputDiemUuTien() {
        System.out.print("Nhập Điểm Ưu Tiên: ");
        return Float.parseFloat(scanner.nextLine());
    };

    private static String inputMaNganh() {
        System.out.print("Nhập mã ngành: ");
        return scanner.nextLine();
    };

    private static String inputTenNganh() {
        System.out.print("Nhập tên ngành: ");
        return scanner.nextLine();
    };
    private static String inputKhoi() {
        System.out.print("Nhập khoi xét tuyển: ");
        return scanner.nextLine();
    };
    private static String inputMaTruong() {
        System.out.print("Nhập mã trường: ");
        return scanner.nextLine();
    };


    public static void showMenu()
    {
        System.out.println("-----------Quản lý danh sách thi sinh------------");
        System.out.println("1. Chỉnh sửa thí sinh");
        System.out.println("2. Chỉnh sửa nguyen vong");
        System.out.println("3. Chỉnh sửa giam thi");
        System.out.println("4. Danh sách trúng truyển");
        System.out.println("5. Danh sách trúng truyển giảm dần");
        System.out.println("6. Những giám thị có quê ở TPHCM.");
        System.out.println("---------------------------");
        System.out.print("Vui lòng chọn: ");
    }
}