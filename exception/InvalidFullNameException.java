package exception;

public class InvalidFullNameException extends Exception {
    private String fullname;

    public InvalidFullNameException(String fullname) {
        this.fullname = fullname;
    }

    public InvalidFullNameException() {
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void checkFullname(String fullname_) {
        try {
            if (fullname_.length() >= 10 && fullname_.length() < 50) {
                setFullname(fullname_);
                getFullname();
            } else {
                throw new InvalidFullNameException();
            }
        } catch (Exception e) {
            System.out.println("your fullname is wrong. Please, input again.");
        }
    }

}
