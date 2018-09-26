package com.example.manibala.abstractfactorypattern;
//Step2: concrete classes that implement Bank interface
 public class ICICI implements Bank {
    private final String BName;
    public ICICI(){
        BName ="ICICI Bank";
    }
    public String getBankName(){
        return BName;
    }
}
