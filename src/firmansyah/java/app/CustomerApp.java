package firmansyah.java.app;

import firmansyah.java.data.Customer;
import firmansyah.java.data.Level;

public class CustomerApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Fadhil Firmansyah");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().geteDescription());

        System.out.println("Konversi Cast Level");
        String level = Level.PREMIUM.name();
        System.out.println(level);
        Level valLevel = Level.valueOf("STANDARD");
        System.out.println(valLevel);
        System.out.println("List Of Level");
        int number = 1;
        for(Level val : Level.values()){
            System.out.println(number + ". " + val);
            number++;
        }
    }
}
