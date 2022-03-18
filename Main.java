import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exception.InvalidBirthDayException;
import exception.InvalidFullNameException;
import exception.InvalidPhoneNumberException;
import exception.OtherException;

public class Main {
    public static void main(String[] args)
            throws InvalidFullNameException, InvalidBirthDayException, InvalidPhoneNumberException, OtherException {
        Scanner scanner = new Scanner(System.in);
        Manage manage = new Manage();
        while (true) {
            System.out.println("-------------------------MENU--------------------------");
            System.out.println("Choose 1: To add student.");
            System.out.println("Choose 2: To show student.");
            System.out.println("Choose 3: To find student for company.");
            System.out.println("Choose 4: To exit.");
            System.out.print("Choose here: ");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1: {
                    System.out.println("--------------------------Enter information--------------------------");
                    System.out.print("Fullname: ");
                    String fullname = scanner.nextLine();
                    System.out.print("Birth day: ");
                    String birthDay = scanner.nextLine();

                    System.out.print("Sex: ");
                    String sex = scanner.nextLine();
                    System.out.print("Phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("University name: ");
                    String universityName = scanner.nextLine();
                    System.out.print("Graduate name: ");
                    String graduateName = scanner.nextLine();
                    System.out.print("Type student: ");
                    String typeStudent = scanner.nextLine();
                    if (typeStudent.equals("good")) {
                        System.out.print("Point medium: ");
                        String pointMedium = scanner.nextLine();
                        System.out.print("Best reward name: ");
                        String bestRewardName = scanner.nextLine();
                        Student goodStudent = new GoodStudent(fullname, date, sex, phoneNumber, universityName,
                                graduateName, pointMedium, bestRewardName);
                        manage.addStudentForGoodStudentAndNormal(goodStudent);
                    } else if (typeStudent.equals("normal")) {
                        System.out.print("English score: ");
                        double englishScore = scanner.nextDouble();
                        System.out.print("Entry test score: ");
                        double entryTestScore = scanner.nextDouble();
                    } else {

                    }

                    break;
                }
                case 2: {

                    break;
                }
                case 3: {

                    break;
                }
                case 4: {
                    scanner.close();
                    return;
                }

                default:
                    System.out.println("Invalid. Please, choose again.");
                    break;
            }
        }
    }
}
