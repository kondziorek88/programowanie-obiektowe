package zad4;

public interface Authentication {
    abstract boolean login(String username, String password);
        //return true;
    //}
    abstract void logout();
    abstract boolean resetPassword(String username, String oldPassword, String newPassword);//{
        //return true;
    //}
}
