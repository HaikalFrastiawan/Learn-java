package Haikal.util;

import Haikal.Error.ValidationExceptions;
import Haikal.application.LoginRequest;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationExceptions {
        if (loginRequest.username() == null) {
            throw new ValidationExceptions("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationExceptions("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new ValidationExceptions("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationExceptions("Password is blank");
        }
    }

}