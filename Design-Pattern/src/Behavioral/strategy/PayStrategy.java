package Behavioral.strategy;

import java.math.BigDecimal;

public interface PayStrategy {
    void pay(BigDecimal amount);
}
