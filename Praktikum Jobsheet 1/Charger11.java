public class Charger11 extends Aksesoris11 {
    private int panjangKabel;

    public void setPanjangKabel(int panjangKabel) {
        this.panjangKabel = panjangKabel;
    }

    public void mengisiDaya() {
        System.out.println("Charger digunakan untuk mengisi daya.");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Panjang Kabel : " + panjangKabel + " cm");
        System.out.println("Jenis : Charger");
    }
}