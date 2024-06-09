package homework9_2;

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
