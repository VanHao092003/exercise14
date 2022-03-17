package exception;

public class OtherException {
    private String error = "Input files have unknow errors !!!";

    public OtherException() {
        System.out.println(getError());
    }

    public String getError() {
        return error;
    }
}
