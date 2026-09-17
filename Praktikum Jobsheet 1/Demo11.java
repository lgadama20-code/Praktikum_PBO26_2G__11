public class Demo11 {
    public static void main(String[] args) {

        Laptop11 laptop = new Laptop11();
        laptop.setNama("VICTUS 15");
        laptop.setMerk("HP");
        laptop.setDaya(200);
        laptop.setProcessor("Ryzen 5 8645hs");

        System.out.println("===== LAPTOP =====");
        laptop.tampilkanInfo();
        laptop.nyalakan();
        laptop.mengetik();

        System.out.println();

        Handphone11 handphone = new Handphone11();
        handphone.setNama("REDMI NOTE 13 5G");
        handphone.setMerk("XIOAMI");
        handphone.setDaya(87);
        handphone.setSistemOperasi("Android");

        System.out.println("===== HANDPHONE =====");
        handphone.tampilkanInfo();
        handphone.nyalakan();
        handphone.menelepon();

        System.out.println();

        Headset11 headset = new Headset11();
        headset.setNama("WH-1000XM5");
        headset.setMerk("FHX");
        headset.setWarna("Hitam");
        headset.setWireless(false);

        System.out.println("===== HEADSET =====");
        headset.tampilkanInfo();
        headset.gunakan();
        headset.mendengarkanMusik();

        System.out.println();

        Charger11 charger = new Charger11();
        charger.setNama("XIOAMI CHARGER");
        charger.setMerk("XIOAMI");
        charger.setWarna("Putih");
        charger.setPanjangKabel(100);

        System.out.println("===== CHARGER =====");
        charger.tampilkanInfo();
        charger.gunakan();
        charger.mengisiDaya();
    }
}