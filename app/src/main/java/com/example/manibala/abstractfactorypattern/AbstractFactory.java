package com.example.manibala.abstractfactorypattern;
//step5: abstract class (ie AbstractFactory) to get the factories for Bank and Loan Objects.
abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
