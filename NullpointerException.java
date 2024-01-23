package exception;

public class NullpointerException {
    public static void main(String[] args) {
        String s = "abcd";
        
        try {
            foo(null);
        } catch (java.lang.NullPointerException e) {
            System.out.println("Terjadi Exception");
            System.out.println(e.getMessage());
        }
    }

    static void foo(String x) {
        if (x != null) {
            System.out.println("Karakter Pertama adalah : " + x.charAt(0));
        } else {
            throw new java.lang.NullPointerException("String tidak boleh null");
        }
    }
}
