package firmansyah.java.app;

public class StackTraceApp {
    public static void main(String[] args) {
        sampleError();
    }

    public static void sampleError() {
        try {
            String[] names = {"Rangga", "Fadhil", "Firmansyah"};
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
