public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Fadhil");
        manager.sayHello("Irwan");

        VicePresident vp = new VicePresident("Firmansyah");
        vp.sayHello("Budi");
    }    
}
