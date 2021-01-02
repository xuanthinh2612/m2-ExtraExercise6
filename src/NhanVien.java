public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien(String name, String dateOfBirth, String gender, String address, String congViec) {
        super(name, dateOfBirth, gender, address);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return super.toString() + "NhanVien{" +
                "congViec='" + congViec + '\'' +
                '}';
    }
}
