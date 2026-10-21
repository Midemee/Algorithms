public class RegexValidation {

    public static boolean isEmailValidation(String email) {
        String regex = "^[a-z]\\.[a-z]+@native\\.semicolon\\.africa$";
        return email.matches(regex);
    }

    public static boolean isPasswordValidation(String password) {
        String regex = "^(?=.*\\d)(?=.*[@_+#])\\S{8,16}$";

        return  password.matches(regex);
    }

}


