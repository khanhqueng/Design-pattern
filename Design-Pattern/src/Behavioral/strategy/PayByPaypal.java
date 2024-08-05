package Behavioral.strategy;

import java.math.BigDecimal;

public class PayByPaypal implements PayStrategy {
    private BigDecimal budget= BigDecimal.valueOf(600);
    @Override
    public void pay(BigDecimal amount) {
        budget = budget.subtract(amount);
        System.out.println(budget);
    }
}
