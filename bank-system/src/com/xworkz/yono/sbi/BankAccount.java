package com.xworkz.yono.sbi;

public class BankAccount {

    public double balence;

        public void debit(int amount) {
            if (balence >= amount) {
                balence = balence - amount;
                System.out.println("amount debeted");
            }
        }
         public void credited(int amount){
            this.balence=balence+amount;

            System.out.println("amount credeted");
         }

         public void transfer(int amount,BankAccount benifisharyAccount){
            this.debit(amount);
            benifisharyAccount.credited(amount);
         }

         public double getbalence(){

            return balence;
         }
}
