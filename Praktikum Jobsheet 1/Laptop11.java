public class Laptop11 extends Elektronik11 {
    private String processor;

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void mengetik() {
        System.out.println("Laptop digunakan untuk mengetik.");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Processor : " + processor);
        System.out.println("Jenis : Laptop");
    }
}