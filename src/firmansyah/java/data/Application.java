package firmansyah.java.data;

public class Application {
    public static final int PROCESSORS;

    static{
        PROCESSORS = Runtime.getRuntime().availableProcessors();
        System.out.println("Hello There");
    }
}
