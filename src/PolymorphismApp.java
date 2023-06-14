public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Fadhil");
        employee.sayHello("Megalodon");

        employee = new Manager("Fadhil");
        employee.sayHello("Megalodon");

        employee = new VicePresident("Fadhil");
        employee.sayHello("Megalodon");

        sayWelcome(new Employee("Firmansyah"));
        sayWelcome(new Manager("Firmansyah"));
        sayWelcome(new VicePresident("Firmansyah"));
    }

    public static void sayWelcome(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident)employee;
            System.out.println("Welcome VP, " + vicePresident.name);
        }else if(employee instanceof Manager){
            Manager manager = (Manager)employee;
            System.out.println("Welcome Manager, " + manager.name);
        }else{
            System.out.println("Welcome, " + employee.name);
        }
    }
}
