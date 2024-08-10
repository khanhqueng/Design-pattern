package Behavioral.chainofresponsibility;

public abstract class BaseFilter {
    private BaseFilter next;
    public void setNext(BaseFilter filter) {
        this.next= filter;
    }
    public abstract boolean check(Request request);

    public void handle(Request request) {
        System.out.println("On going filter: " + this.getClass().getName());
            if(next == null || !check(request) ){
                System.out.println("End the chain here: " + this.getClass().getName());
                return;
            }
            System.out.println("Filter success: " + this.getClass().getName());
            next.handle(request);
    }
    public static BaseFilter link(BaseFilter first, BaseFilter... chain){
        BaseFilter head = first;
        for(BaseFilter nextInChain: chain){
            head.next= nextInChain;
            head= nextInChain;
        }
        return first;
    }
}
