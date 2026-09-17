public class Headset11 extends Aksesoris11 {
    private boolean wireless;

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public void mendengarkanMusik() {
        System.out.println("Headset digunakan untuk mendengarkan musik.");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Wireless : " + wireless);
        System.out.println("Jenis : Headset");
    }
}