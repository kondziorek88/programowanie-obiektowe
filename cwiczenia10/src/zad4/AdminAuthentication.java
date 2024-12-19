package zad4;

import javax.naming.AuthenticationException;

public class AdminAuthentication implements Authentication {


    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public void logout() {
        System.out.println("Wylogowano jako admin");

    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        return false;
    }


}
