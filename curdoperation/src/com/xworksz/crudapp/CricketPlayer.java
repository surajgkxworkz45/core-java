package com.xworksz.crudapp;

public class CricketPlayer {


    public String players[] = new String[6];

    int index = 0;

    public void getNamesOfPlayers(String name) {
        System.out.println("create method is created");
        System.out.println("the player name is : " + name);
        System.out.println("the players in the position of the index is : " + index);

        if (index < players.length) {
            System.out.println("the players name less than the array length " + players.length);
            players[index++] = name;
           // index += 1;


        } else {
            System.out.println("the players are full wait for the next session");
        }
    }

    public void update(String oldName, String newName) {
        System.out.println("update method is created");
        boolean isfound = false;
        for (int i = 0; i < players.length; i++) {
            if (players[i] == oldName) {
                System.out.println("the name is found :" + players[i]);
                players[i] = newName;
                System.out.println("the updted name is :" + players[i]);
                isfound = true;
            }
        }
        if (isfound == true) {
            System.out.println("the name is updated succesfully");
        } else {
            System.out.println("the name is not found");


        }
    }


    public void deletname(String name){
        System.out.println("delet method");
        System.out.println("the name is to be delete is "+name);
       boolean isdelet=false;
        for(int i=0;i< players.length;i++){
            if(players[i]==name){
                System.out.println(name);
                players[i]=null;
                System.out.println(players[i]);
                isdelet=true;
            }

        }
        if(isdelet==true){
            System.out.println("the name is deleted succesfully");

        }
        else{
            System.out.println("the name is not deleted");
        }

    }
    public void getnames() {
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
    }

    public void getread(){
        for(int i=0;i< players.length;i++){
            if(players[i]!=null){
                System.out.println("the players are "+players[i]);
            }
        }

    }
}
