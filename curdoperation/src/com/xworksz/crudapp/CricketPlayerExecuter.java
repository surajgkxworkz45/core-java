package com.xworksz.crudapp;

public class CricketPlayerExecuter {


    public static void main(String[] args) {
        CricketPlayer cric =new CricketPlayer();
        cric.getNamesOfPlayers("virat kohli");
        cric.getNamesOfPlayers("Rohit Sherma");
        cric.getNamesOfPlayers("Shubman gill");
        cric.getNamesOfPlayers("Surya kumar yadav");
        cric.getNamesOfPlayers("Ms Dhoni");
        cric.getNamesOfPlayers("Ishan");
        //cric.getNamesOfPlayers("hardik pandya");
        cric.update("Ishan","KL Rahul");

        cric.deletname("Ms Dhoni");
        cric.getnames();
        cric.getread();
    }
}
