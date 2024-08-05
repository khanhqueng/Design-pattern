package Behavioral.strategy;

import java.math.BigDecimal;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        PayGateway gateway= new PayGateway();
        BigDecimal amount= new BigDecimal(scanner.nextLine());
        switch(scanner.nextInt()){
            case 1-> gateway.setStrategy(new PayByMomo());
            case 2 -> gateway.setStrategy(new PayByPaypal());
        }
        gateway.useStrategy(amount);

    }
}
