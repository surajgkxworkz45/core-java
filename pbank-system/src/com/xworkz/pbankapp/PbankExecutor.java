package com.xworkz.pbankapp;

import com.xworkz.pbankapp.canara.Pbankaccount;
import com.xworkz.pbankapp.savings.PsavingsAccount;

public class PbankExecutor {


    public static void main(String args[]){

        Pbankaccount myaccount=new PsavingsAccount(1000);
        myaccount.credit(50000);
        myaccount.debit(8000);

        System.out.println("my account balene is " +myaccount.getbalence());

        PsavingsAccount mysavingsaccount= (PsavingsAccount) myaccount;
        mysavingsaccount.calculateIntrestrate();


        System.out.println(mysavingsaccount.calculateIntrestrate());


        System.out.println("balence after the intersestrate is " + mysavingsaccount.getbalence());
        myaccount.debit(4000);
        System.out.println("Available balence is " +myaccount.getbalence());

      /*  PsavingsAccount friendsaccount=new PsavingsAccount();
        friendsaccount.credit(6500);
        myaccount.transfer(3500,friendsaccount);

        System.out.println("my account balene is " +myaccount.getbalence());
        System.out.println("my friend account balene is " +friendsaccount.getbalence());

        friendsaccount.transfer(4000,myaccount);
        System.out.println("my account balene is " +myaccount.getbalence());
        System.out.println("my friend account balene is " +friendsaccount.getbalence());


        PsavingsAccount motheraccount=new PsavingsAccount();
        motheraccount.credit(5000);
        motheraccount.transfer(5000,friendsaccount);
        System.out.println("my friend account balene is " +friendsaccount.getbalence());
        System.out.println("my mother account balene is " +motheraccount.getbalence());*/
    }

}
