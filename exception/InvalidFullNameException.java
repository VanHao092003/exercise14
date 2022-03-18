package exception;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InvalidFullNameException extends Exception {
    private String errorDay;

    public InvalidFullNameException(String errorDay) {
        this.errorDay = errorDay;
    }

    public String getErrorDay() {
        return errorDay;
    }

    public void setErrorDay(String errorDay) {
        this.errorDay = errorDay;
    }

    public void check(String errorDay) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = format.parse(errorDay);
            if (date instanceof Date) {
                setErrorDay(errorDay);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.err.println("Your birthday is wrong. Please, input again.");
        }
    }

}
