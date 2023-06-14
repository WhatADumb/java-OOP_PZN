package firmansyah.java.app;

import firmansyah.java.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDB("", "");
    }

    public static void connectDB(String message, String password){
        throw new DatabaseError("Cannot Connect on Database");
    }
}
