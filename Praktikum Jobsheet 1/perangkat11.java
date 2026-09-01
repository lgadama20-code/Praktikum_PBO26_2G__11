public class perangkat11 {
    private String nama;
    private String merk;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void tampilkanInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Merk : " + merk);
    }
}