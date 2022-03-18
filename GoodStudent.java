import java.util.Date;

public class GoodStudent extends Student {
    private String pointMedium;
    private String bestRewardName;

    public GoodStudent(String fullname, Date birthDay, String sex, String phoneNumber, String universityName,
            String graduateName, String pointMedium, String bestRewardName) {
        super(fullname, birthDay, sex, phoneNumber, universityName, graduateName);
        this.pointMedium = pointMedium;
        this.bestRewardName = bestRewardName;
    }

    public String getPointMedium() {
        return pointMedium;
    }

    public void setPointMedium(String pointMedium) {
        this.pointMedium = pointMedium;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    public void showMyInformation() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Information of good student[ Fullname: " + fullname + ", Birth day: " + birthDay + ", sex: " + sex
                + ", Phone number: " + phoneNumber + ", University name: " + universityName + ", Graduate name: "
                + graduateName + " ]";
    }
}