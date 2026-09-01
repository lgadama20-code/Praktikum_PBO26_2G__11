public class Handphone11 extends Elektronik11 {
    private String sistemOperasi;

    public void setSistemOperasi(String sistemOperasi) {
        this.sistemOperasi = sistemOperasi;
    }

    public void menelepon() {
        System.out.println("Handphone digunakan untuk menelepon.");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Sistem Operasi : " + sistemOperasi);
        System.out.println("Jenis : Handphone");
    }
}