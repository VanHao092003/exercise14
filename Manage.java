import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exception.OtherException;

public class Manage {
    Scanner scanner = new Scanner(System.in);
    private List<Student> students;

    public Manage() {
        students = new ArrayList<>();
    }

    public void studentNumber(int number) throws OtherException {
        try {

            if (number >= 11 && number <= 15) {

            } else {
                throw new OtherException();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
