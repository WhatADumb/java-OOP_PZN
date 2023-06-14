package firmansyah.java.data;

public class Civic implements Car{
    public void drive(){
        System.out.println("Engines start, and drive");
    }
    public int getTire(){
        return 4;
    }

    public String brand(){
        return "Honda";
    }

    public boolean maintenence(){
        return false;
    }
}
