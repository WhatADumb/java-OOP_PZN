package firmansyah.java.data;

public record LoginRequest(String username, String password) {
    //Compact Constructor
    public LoginRequest{
        System.out.println("Object Created");
    }

    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest(){
        this("", "");
    }
}
