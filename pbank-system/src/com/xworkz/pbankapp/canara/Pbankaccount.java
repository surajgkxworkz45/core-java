package com.xworkz.pbankapp.canara;

public class Pbankaccount {

    public double balence;


    public void debit(int amount){

        if(amount <= balence){
            balence=balence - amount;
            System.out.println("the amount is debit");
        }

    }

    public void credit(int amount){

        this.balence=balence + amount;
        System.out.println("the amount is credited");

    }

    public void transfer(int amount ,Pbankaccount benefisharyaccount){
        this.debit(amount);
        benefisharyaccount.credit(amount);
    }


    public double getbalence(){

        return balence;
    }
}

