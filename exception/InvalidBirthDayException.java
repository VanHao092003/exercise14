package exception;
public class InvalidBirthDayException extends Exception{
    private String error;

    public InvalidBirthDayException(String error) {
        
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    
}
