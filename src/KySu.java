public class KySu extends CanBo {
    private String chuyenNganh;

    public KySu(String name, String dateOfBirth, String  gender, String address, String chuyenNganh) {
        super(name, dateOfBirth, gender, address);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return super.toString() + "KySu{" +
                "chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }
}
