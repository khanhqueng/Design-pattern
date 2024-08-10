package Behavioral.chainofresponsibility;

public class Demo {
    public static void main(String[] args){
            Request request=new Request("admin", "admin", "JWT_key");
            BaseFilter baseFilter= BaseFilter.link(
                    new UserCredentialsFilter(),
                    new JwtCredentialsFilter()
            );
            baseFilter.handle(request);
    }
}
