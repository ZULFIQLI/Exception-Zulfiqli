package exception;

public class ArithmeticException {
    public int hasil;

    public void bagiDua(int angka) {
        if (angka == 0) {
            throw new java.lang.ArithmeticException("Tidak dapat melakukan pembagian dengan nol");
        } else {
            this.hasil = 10 / angka;
        }
    }

    public static void main(String[] args) {
        ArithmeticException kalkulator = new ArithmeticException();

        try {
            kalkulator.bagiDua(0);
            System.out.println("Hasil pembagian adalah: " + kalkulator.hasil);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Terjadi Exception Aritmetika");
            System.out.println(e.getMessage());
        }
    }
}
