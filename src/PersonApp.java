public class PersonApp {
    public static void main(String[] args) {
        //3 Ways to make object
        var person1 = new Person("Fadhil", "Semarang");

        Person person2 = new Person("Firmansyah", "Mranggen");

        Person person3;
        person3 = new Person("Priyatama", "Purbalingga"); 
        ////

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Deksa");
    }
}
