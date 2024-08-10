package Behavioral.chainofresponsibility;

public class JwtCredentialsFilter extends BaseFilter{

    @Override
    public boolean check(Request request) {
        return (!request.key().isBlank()) && request.key().equals("JWT_key");
    }
}
