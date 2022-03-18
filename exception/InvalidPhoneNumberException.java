package exception;

public class InvalidPhoneNumberException extends Exception {
    private String error;

    public String getError() {
        return error;
    }

    public InvalidPhoneNumberException(String error) {
        this.error = error;
    }

    public InvalidPhoneNumberException() {

    }

    public void setError(String error) {
        this.error = error;
    }

    public void check(String error) {
        try {
            if (error.length() >= 10 && error.length() < 50) {
                setError(error);
                getError();
            } else {

            }
        } catch (Exception e) {
            System.out.println("your fullname is wrong. Please, input again.");
        }
    }
}
