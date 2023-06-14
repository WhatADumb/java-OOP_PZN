package firmansyah.java.app;

import firmansyah.java.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        //Anonymous Class
        
        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello There");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hai kamu");
            }
            
            @Override
            public void sayHello(String name) {
                System.out.println("Hai " + name);
            }
        };

        english.sayHello();
        english.sayHello("Fadhil Firmansyah");
        indonesia.sayHello();
        indonesia.sayHello("Fadhil Firmansyah");
    }
}
