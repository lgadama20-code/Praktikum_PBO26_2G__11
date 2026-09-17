public class Elektronik11 extends perangkat11 {
    private int daya;

    public void setDaya(int daya) {
        this.daya = daya;
    }

    public void nyalakan() {
        System.out.println("Perangkat dinyalakan.");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Daya : " + daya + " Watt");
    }
}