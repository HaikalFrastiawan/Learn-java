package Haikal.application;

import Haikal.Error.ValidationExceptions;
import Haikal.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, null);
        //methoid yg  akan mengembalikan error

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationExceptions exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        } finally {
            System.out.println("selalu di eksekusi");
        }

    }
}