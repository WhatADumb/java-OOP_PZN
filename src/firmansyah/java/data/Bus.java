package firmansyah.java.data;

public class Bus implements Car{
    public int getTire() {
        return 8;
    }

    public void drive() {
        System.out.println("Drive");
    }

    public boolean maintenence(){
        return false;
    }

    public String brand(){
        return "BRT";
    }

    public boolean isBig(){
        return true;
    }
}
