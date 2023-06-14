package firmansyah.java.data;

public interface Car extends hasBrand, isMaintenence{
    void drive();
    int getTire();
    //Default Method
    default boolean isBig(){
        return false;
    }
}