package com.example.manibala.abstractfactorypattern;
//Step6: careated Factory classes that inherit AbstractFactory class to generate the object of concrete class
public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        if(bank==null){
            return null;
        }
        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        } else if(bank.equalsIgnoreCase("ICICI")){
            return new ICICI();
        } else if(bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}//End of BankFactory class
class LoanFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if(loan==null){
            return null;
        }
        if (loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        }
        else if(loan.equalsIgnoreCase("Business")){
            return new BusinessLoan();
        }
        else if(loan.equalsIgnoreCase("Education"))
            return new EducationLoan();
        return null;
    }
}
