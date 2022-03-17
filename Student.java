import java.util.Date;

public abstract class Student {
    protected String fullname;
    protected Date birthDay;
    protected String sex;
    protected String phoneNumber;
    protected String universityName;
    protected String graduateName;

    
    public Student(String fullname, Date birthDay, String sex, String phoneNumber, String universityName,
            String graduateName) {
        this.fullname = fullname;
        this.birthDay = birthDay;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.graduateName = graduateName;
    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public Date getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getUniversityName() {
        return universityName;
    }
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    public String getGraduateName() {
        return graduateName;
    }
    public void setGraduateName(String graduateName) {
        this.graduateName = graduateName;
    }
    
}
