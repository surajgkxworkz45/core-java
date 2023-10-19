package com.xworksz.crudapp;

public class TrineeExecuter {


    public static void main(String[] args) {




        Trinee trin =new Trinee();
        trin.providename("suraj");
        trin.providename("surya");
        trin.providename("sunil");
        trin.providename("amit");
        trin.providename("nithish");
        trin.update("surya","uma");
        trin.getname();
        System.out.println("before it deleted");
        trin.goDelete("amit");
        System.out.println("after deleted");
        trin.getread();
    }
}
