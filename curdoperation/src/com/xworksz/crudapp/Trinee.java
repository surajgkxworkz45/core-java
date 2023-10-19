package com.xworksz.crudapp;

public class Trinee {


    public String trineeName[] = new String[5];


    int index = 0;

    public void providename(String name) {

        System.out.println("provide the name of the trinee = " + name);
        System.out.println("the postion of th trinee name in the index " + index);
        if (index < trineeName.length) {

            System.out.println("the trinee name is less the array length " + trineeName.length);
            trineeName[index] = name;

            index += 1;

        } else {
            System.out.println("the array is full");
        }
    }

    public void update(String oldName, String newName) {
        System.out.println("this is a update method");
        boolean isfound = false;
        for (int i = 0; i < trineeName.length; i++) {
            if (trineeName[i] == oldName) {
                System.out.println("the name is found " + trineeName[i]);
                trineeName[i] = newName;
                System.out.println(trineeName[i]);
                isfound = true;

            }
        }
        if (isfound == true) {
            System.out.println("the name is updated succfully");
        } else {
            System.out.println("the name is not found");
        }
    }

    public void goDelete(String name) {
        System.out.println("this is a deleate method");
        System.out.println("the name is to be deleted " + name);
        boolean isDelete = false;
        for (int i = 0; i < trineeName.length; i++) {
            if (trineeName[i] == name) {
                System.out.println("the is found " + name);
                trineeName[i] = null;
                System.out.println(trineeName[i]);
                isDelete = true;

            }
        }

        if (isDelete) {
            System.out.println("the name is deleted succesfully ");
        } else {
            System.out.println("the name is not deleted");
        }
    }

    public void getname() {

        for (int i = 0; i < trineeName.length; i++) {
            System.out.println(trineeName[i]);
        }
    }

    public void getread() {
        for (int i = 0; i < trineeName.length; i++) {
            if (trineeName[i] != null) {
                System.out.println(trineeName[i]);
            }
        }
    }
}
