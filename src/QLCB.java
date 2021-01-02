import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<CanBo> findingResult = new ArrayList<>();

    public void addNew(ArrayList<CanBo> list) {
        System.out.println("Nhap So Tuong Ung\n1.Ky Su\n2.Cong Nhan\n3.Can Bo");
        int choice = scanner.nextInt();

        System.out.print("Ho Va Ten: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Ngay Sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Gioi Tinh: ");
        String gender = scanner.nextLine();

        System.out.print("Nhap Dia Chi: ");
        String address = scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Chuyen Nganh: ");
                String chuyenNganh = scanner.nextLine();
                CanBo kySu = new KySu(name, dateOfBirth, gender, address, chuyenNganh);
                list.add(kySu);
                break;
            case 2:
                System.out.print("Bac Cong Nhan: ");
                double bac = scanner.nextDouble();
                CanBo congNhan = new CongNhan(name, dateOfBirth, gender, address, bac);
                list.add(congNhan);

                break;
            case 3:
                System.out.print("Cong Viec: ");
                String congViec = scanner.nextLine();
                CanBo nhanVien = new NhanVien(name, dateOfBirth, gender, address, congViec);
                list.add(nhanVien);

                break;
        }
    }

    public void find(ArrayList<CanBo> list) {
        System.out.println("nhap ten can tim: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        for (CanBo c : list) {
            if (name.equals(c.getName())) {//Loi khong the so sanh chuoi nay
                System.out.println(c);
            }
        }
//        return null;
    }

    public static void main(String[] args) {
        ArrayList<CanBo> canBo = new ArrayList<>();
        QLCB quanLy = new QLCB();
        System.out.println("Menu");
        System.out.println("1.Them Nhan Vien");
        System.out.println("2.Tim Kiem Theo Ten");
        System.out.println("0.Exit");
        int choice = scanner.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    quanLy.addNew(canBo);
                    break;
                case 2:
                    quanLy.find(canBo);
                    break;
                case 0:
                    System.exit(0);

            }
            System.out.println("Menu");
            System.out.println("1.Them Nhan Vien");
            System.out.println("2.Tim Kiem Theo Ten");
            System.out.println("0.Exit");
            choice = scanner.nextInt();
        }
    }
}
