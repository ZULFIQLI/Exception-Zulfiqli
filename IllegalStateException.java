package exception;

public class IllegalStateException {
    public int panjang;

    public void setPanjang(int panjang) {
        if (panjang < 1) {
            throw new IllegalArgumentException("Panjang harus lebih dari 0");
        } else {
            this.panjang = panjang;
        }
    }

    public static void main(String[] args) {
        IllegalStateException panjang1 = new IllegalStateException();

        try {
            panjang1.setPanjang(-5);
            System.out.println("Panjang dari objek adalah: " + panjang1.panjang);
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
}
