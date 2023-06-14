package firmansyah.java.util;

import firmansyah.java.data.LoginRequest;
import firmansyah.java.error.ValidationException;
import firmansyah.java.error.ValidationRuntime;

public class ValidateUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException{
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is Null");
        }else if(loginRequest.username().isBlank()){
            throw new ValidationException("Username is Blank");
        }else if(loginRequest.password() == null){
            throw new NullPointerException("Password is Null");
        }else if(loginRequest.password().isBlank()){
            throw new ValidationException("Password is Blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest){
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is Null");
        }else if(loginRequest.username().isBlank()){
            throw new ValidationRuntime("Username is Blank");
        }else if(loginRequest.password() == null){
            throw new NullPointerException("Password is Null");
        }else if(loginRequest.password().isBlank()){
            throw new ValidationRuntime("Password is Blank");
        }
    }
}
