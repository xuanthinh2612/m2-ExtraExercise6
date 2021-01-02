public class CongNhan extends CanBo {
    private double bac;

    public CongNhan(String name, String dateOfBirth, String  gender, String address, double bac) {
        super(name, dateOfBirth, gender, address);
        this.bac = bac;
    }

    public double getBac() {
        return bac;
    }

    public void setBac(double bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return super.toString() + "CongNhan{" +
                "bac=" + bac +
                '}';
    }
}
