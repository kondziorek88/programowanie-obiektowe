package zad4;

public class UserAuthentication implements Authentication{



    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public void logout() {
        System.out.println("Wylogowano użytkownika");

    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        System.out.println("Zresetowano hasło dla użytokownika");
        return false;
    }


}
