package firmansyah.java.app;

public class NameApp {
    public static void main(String[] args) {
        String first = "Fadhil";
        first = first + " " + "Firmansyah";
        System.out.println(first);

        String second = "Fadhil Firmansyah";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Fadhil Firmansyah";
        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
