package Behavioral.strategy;

import java.math.BigDecimal;

public class PayGateway {
    private PayStrategy payStrategy;
    public void setStrategy(PayStrategy payStrategy){
        this.payStrategy = payStrategy;
    }
    public void useStrategy(BigDecimal amount){
        payStrategy.pay(amount);
    }
}
