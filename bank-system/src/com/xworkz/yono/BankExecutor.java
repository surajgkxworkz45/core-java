package com.xworkz.yono;

import com.xworkz.yono.sbi.BankAccount;
import com.xworkz.yono.sbi.savings.SavingsAccount;

public class BankExecutor {


    public static void main(String[] args) {

        BankAccount myaccount=new SavingsAccount();
        myaccount.credited(6000);
        myaccount.credited(5000);
        myaccount.debit(500);
        myaccount.credited(10000);
        System.out.println("available balence is " + myaccount.getbalence());
        System.out.println("----------------------------------------");

        SavingsAccount friendsaccount=new SavingsAccount();
        friendsaccount.credited(500);
        myaccount.transfer(500,friendsaccount);
        myaccount.transfer(1000,friendsaccount);

        System.out.println("my avaiable balence is " + myaccount.getbalence());
        System.out.println("my friends available balence is " + friendsaccount.getbalence());
        System.out.println("----------------------------------------");

         SavingsAccount momaccount=new SavingsAccount();
         momaccount.credited(1000);
         myaccount.transfer(1100,momaccount);

        System.out.println("my avaiable balence is " + myaccount.getbalence());
        System.out.println("my mom available balence is " +momaccount.getbalence());
        System.out.println("----------------------------------------");

        SavingsAccount brotherAccount=new SavingsAccount();
        brotherAccount.credited(5000);
        myaccount.transfer(500,brotherAccount);

        System.out.println("my avaiable balence is " + myaccount.getbalence());
        System.out.println("my brother available balence is " +brotherAccount.getbalence());
        System.out.println("----------------------------------------");

        SavingsAccount dadAccount=new SavingsAccount();
        dadAccount.credited(6500);
        myaccount.transfer(1900,dadAccount);

        System.out.println("my avaiable balence is " + myaccount.getbalence());
        System.out.println("my dads available balence is " +dadAccount.getbalence());
        System.out.println("----------------------------------------");

        SavingsAccount suryasAccount=new SavingsAccount();
        suryasAccount.credited(65);
        myaccount.transfer(1000,suryasAccount);

        System.out.println("my avaiable balence is " + myaccount.getbalence());
        System.out.println("my suryas available balence is " +suryasAccount.getbalence());
        System.out.println("surya nale kodu maga beku");
        System.out.println("----------------------------------------");

        SavingsAccount sisteraccount=new SavingsAccount();
        sisteraccount.credited(4000);
        myaccount.transfer(1000,sisteraccount);

        System.out.println("my avaiable balence is " + myaccount.getbalence());
        System.out.println("my sister available balence is " +sisteraccount.getbalence());
        System.out.println("----------------------------------------");

        suryasAccount.credited(500);
        suryasAccount.transfer(1000,myaccount);

        System.out.println("my avaiable balence is " + myaccount.getbalence());
        System.out.println("my suryas available balence is " +suryasAccount.getbalence());
        System.out.println("surya thanks kano");
        System.out.println("----------------------------------------");

        SavingsAccount stockmarketaccount=new SavingsAccount();
        stockmarketaccount.credited(100);
        myaccount.transfer(2000,stockmarketaccount);

        System.out.println("my avaiable balence is " + myaccount.getbalence());
        System.out.println("my stockmarket available balence is " +stockmarketaccount.getbalence());
        System.out.println("----------------------------------------");

        SavingsAccount mutualfunds=new SavingsAccount();
        mutualfunds.credited(528);
        myaccount.transfer(1500,mutualfunds);

        System.out.println("my avaiable balence is " + myaccount.getbalence());
        System.out.println("my mutualfunds available balence is " +mutualfunds.getbalence());
        System.out.println("----------------------------------------");
    }
}
