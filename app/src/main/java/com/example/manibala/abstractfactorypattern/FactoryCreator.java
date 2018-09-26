package com.example.manibala.abstractfactorypattern;
//Step7: create FactoryCreator class to get the factories by passing information such as Bank or Loan

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Bank")){
            return new BankFactory();

        }else if(choice.equalsIgnoreCase("Loan")){
            return new LoanFactory();
        }
        return null;
    }
}// end of Factory Creator
