package com.example.manibala.abstractfactorypattern;
//step 4: concrete classes that extend Loan abstract class
public class HomeLoan extends Loan {
    @Override
    public void getInterestRate(double r) {
        rate = r;
    }

}// End of HomeLoan class
class BusinessLoan extends Loan{
    public void getInterestRate(double r){
        rate=r;
    }
}// End of BusinessLoan class
class EducationLoan extends Loan{

    @Override
   public void getInterestRate(double r) {
        rate=r;
    }
}// End of Education Loan class
