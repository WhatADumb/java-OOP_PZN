package firmansyah.java.app;

import firmansyah.java.data.LoginRequest;
import firmansyah.java.error.ValidationException;
import firmansyah.java.util.ValidateUtil;

public class LoginValidationApp {
    public static void main(String[] args) {
        LoginRequest login = new LoginRequest("", "");

        try {
            ValidateUtil.validate(login);
            System.out.println("Login Sukses");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }finally{
            System.out.println("Login Done");
        }

        LoginRequest login2 = new LoginRequest("", "");
        ValidateUtil.validateRuntime(login2);
        System.out.println("Login Done");
    }
}
