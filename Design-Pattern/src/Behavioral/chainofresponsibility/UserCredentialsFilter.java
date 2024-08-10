package Behavioral.chainofresponsibility;

public class UserCredentialsFilter  extends BaseFilter{


    @Override
    public boolean check(Request request) {
        return !request.username().isBlank() && !request.password().isBlank()
                && request.username().equals("admin") && request.password().equals("admin");
    }
}
