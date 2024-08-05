package Behavioral.strategy;

import java.math.BigDecimal;

public class PayByMomo implements PayStrategy {
    private BigDecimal budget= BigDecimal.valueOf(600);
    @Override
    public void pay(BigDecimal amount) {
        budget = budget.add(amount);
        System.out.println(budget);
    }
}
