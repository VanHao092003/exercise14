package exception;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class InvalidBirthDayException extends Exception {
    private Date birthDay;

    public InvalidBirthDayException(Date birthDay) {
        this.birthDay = birthDay;
    }

    public InvalidBirthDayException() {
    }

    public Date getError() {
        return birthDay;
    }

    public void setError(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void checkBirthDay(String errorDay) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = (Date) format.parse(errorDay);
            if (date instanceof Date) {
                setError(date);
            } else {
                throw new InvalidBirthDayException();
            }
        } catch (Exception e) {
            System.err.println("Your birthday is wrong. Please, input again.");
        }
    }

}
