import java.util.Date;

public class NormalStudent extends Student {
    private double englishScore;
    private double entryTestScore;

    public NormalStudent(String fullname, Date birthDay, String sex, String phoneNumber, String universityName,
            String graduateName, double englishScore, double entryTestScore) {
        super(fullname, birthDay, sex, phoneNumber, universityName, graduateName);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public double getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(double entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    public void showMyInformation() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Information of good student[ Fullname: " + fullname + ", Birth day: " + birthDay + ", sex: " + sex
                + ", Phone number: " + phoneNumber + ", English score: " + englishScore + ", English test score: "
                + entryTestScore + " ]";
    }
}
