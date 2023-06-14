package firmansyah.java.app;

import firmansyah.java.data.LoginRequest;

public class LoginRequestApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("firmansyah", "pass");

        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("firmansyah"));
    }
}
