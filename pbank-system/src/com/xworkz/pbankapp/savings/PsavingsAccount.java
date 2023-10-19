package com.xworkz.pbankapp.savings;

import com.xworkz.pbankapp.canara.Pbankaccount;

public class PsavingsAccount  extends Pbankaccount {


public double intersestrate=6.5;

public PsavingsAccount() {

}

public PsavingsAccount(double minBalence){

    this.credit((int)minBalence);
}

public double calculateIntrestrate() {

    double interestAmount = (intersestrate * getbalence() / 100);
    this.credit((int) interestAmount);
    return interestAmount;
}



    }
