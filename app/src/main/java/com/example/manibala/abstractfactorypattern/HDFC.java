package com.example.manibala.abstractfactorypattern;
//step2: concrete classes that implement the Bank interface
public class HDFC implements Bank{

    private final String BName;
    public HDFC(){
        BName="HDFC Bank";

    }
    public String getBankName(){
        return BName;
    }
}
