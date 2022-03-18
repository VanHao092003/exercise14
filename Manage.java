import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import exception.OtherException;

public class Manage {
    Scanner scanner = new Scanner(System.in);
    private List<Student> students;

    public Manage() {
        students = new ArrayList<>();
    }

    public void errorNumberStudent(int number) throws OtherException {
        try {
            if (number >= 11 && number <= 15) {
            } else {
                throw new OtherException();
            }
        } catch (Exception e) {
            ((OtherException) e).OtherException();
        }
    }

    public List<Student> filterGoodStudent(int number) {
        return this.students.stream().filter(o -> o instanceof GoodStudent)
                .collect(Collectors.toList());
    }

    public List<Student> filterNormalStudent(int number) {
        return this.students.stream().filter(o -> o instanceof NormalStudent).collect(Collectors.toList());
    }

    public void filterTypeStudent1(int number) {

        if (filterGoodStudent(number).size() > number) {
            List<Student> ListGoodStudentCaching = filterGoodStudent(number);
            List<GoodStudent> typeGoodStudent = new ArrayList<>();
            for (int i = 0; i < number; i++) {
                typeGoodStudent.add((GoodStudent) ListGoodStudentCaching.get(i));
            }
            typeGoodStudent.sort((s1, s2) -> {
                if (s1.getPointMedium().compareTo(s2.getPointMedium()) > 0) {
                    return 1;
                } else if (s1.getPointMedium().compareTo(s2.getPointMedium()) < 0) {
                    return -1;
                } else {
                    if (s1.getFullname().compareTo(s2.getFullname()) > 0) {
                        return 1;
                    } else if (s1.getFullname().compareTo(s2.getFullname()) < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            });
        } else if (filterGoodStudent(number).size() < number) {
            List<Student> ListNormalStudentCaching = new ArrayList<>();
            List<NormalStudent> typeNormalStudent = new ArrayList<>();
            for (int i = 0; i < number; i++) {
                typeNormalStudent.add((NormalStudent) ListNormalStudentCaching.get(i));
            }
            typeNormalStudent.sort((s1, s2) -> {
                if (s1.getEnglishScore() - s2.getEnglishScore() > 0) {
                    return 1;
                } else if (s1.getEnglishScore() - s2.getEnglishScore() < 0) {
                    return -1;
                } else {
                    if (s1.getFullname().compareTo(s2.getFullname()) > 0) {
                        return 1;
                    } else if (s1.getFullname().compareTo(s2.getFullname()) < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            });
        }
    }

    public void addStudentForGoodStudentAndNormal(Student student) {
        students.add(student);
    }

    public void sortStudent() {
        students.sort((s1, s2) -> {
            if (s1.getFullname().compareTo(s2.getFullname()) > 0) {
                return 1;
            } else if (s1.getFullname().compareTo(s2.getFullname()) < 0) {
                return -1;
            } else {
                if (s1.getPhoneNumber().compareTo(s2.getPhoneNumber()) > 0) {
                    return 1;
                } else if (s1.getPhoneNumber().compareTo(s2.getPhoneNumber()) < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

    }

    public void showStudentBySort() {
        students.stream().forEach(o -> System.err.println(o));
    }

}