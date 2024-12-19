package zad4;

public class AuthenticationTest {
    public static void main(String[] args) {
        AdminAuthentication admin = new AdminAuthentication();
        admin.login("aaa", "bbb");
        admin.logout();
        admin.resetPassword("aaa", "bbb", "ccc");
        UserAuthentication user = new UserAuthentication();
        user.login("aaaaaaa", "aaA");
        user.logout();
        user.resetPassword("aa", "bb","cc");
    }
}
