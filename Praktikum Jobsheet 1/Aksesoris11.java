public class Aksesoris11 extends perangkat11 {
    private String warna;

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void gunakan() {
        System.out.println("Aksesoris sedang digunakan.");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Warna : " + warna);
    }
}