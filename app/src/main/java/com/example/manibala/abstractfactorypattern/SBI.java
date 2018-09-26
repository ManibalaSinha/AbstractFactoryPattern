package com.example.manibala.abstractfactorypattern;

public class SBI implements Bank {
    private  final String BName;
    public SBI(){
        BName="SBI Bank";
    }
    public String getBankName(){
        return BName;
    }
}
