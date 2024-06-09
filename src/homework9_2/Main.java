package homework9_2;

public class Main {

    public static void main(String[] args) {
        try {
            boolean isValid = validate("myLogin", "password19", "password1");
            System.out.println("Validation result: " + isValid);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean validate(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Login must be less than 20 characters and should not contain spaces.");
        }

        if (password.length() >= 20 || password.contains(" ") || !password.contains("1")) {
            throw new WrongPasswordException("Password must be less than 20 characters, should not contain spaces, and must include at least one '1'.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirmPassword must be equal.");
        }

        return true;
    }
}

