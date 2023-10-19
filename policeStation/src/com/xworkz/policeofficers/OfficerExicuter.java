package com.xworkz.policeofficers;

import com.xworkz.policeofficers.officer.Officers;
import com.xworkz.policeofficers.poclice.PoliceStation;

import java.util.Scanner;


public class OfficerExicuter {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of officers to be added");

        int size=sc.nextInt();
        PoliceStation poli = new PoliceStation(size);

        for (int index = 0; index < size; index++){
         Officers officer=new Officers();
            
            System.out.println("enter the "   +(index+1)+  " for name of the officeris:");
        officer.setOfficerName(sc.next());
            System.out.println("enter the "  +(index+1)+  " for officer post name is :");
        officer.setOfficerPost(sc.next());
            System.out.println("enter the "  +(index+1)+  " for age of the officer is :");
        officer.setAge(sc.nextInt());
            System.out.println("enter the "   +(index+1)+  " for gender of the officer is :");
        officer.setGender(sc.next());
            System.out.println("enter the "   +(index+1)+  " for location of the officer is :");
        officer.setLocation(sc.next());




       poli.addAllOfficers(officer);
            System.out.println(".............................................");
    }




     String input=null;

     do{

         System.out.println("press 1:to get all application");
         System.out.println("press 2:to get officer by ID  ");
         System.out.println("press 3:to get officer age by name");
         System.out.println("press 4:to get officer location by Id");
         System.out.println("press 5:to get officer post name by name");

         int options=sc.nextInt();
         switch(options){
             case 1:
                 System.out.println("enter the applicacation");
                 poli.getAllOfficers();
                 break;

             case 2:
                 System.out.println("enter the ID");
                 Officers offi=poli.getOfficersById(sc.nextInt());
                 System.out.println(offi.getOfficerId());
                 System.out.println(offi.getOfficerName());
                 System.out.println(offi.getOfficerPost());
                 System.out.println(offi.getAge());
                 System.out.println(offi.getGender());
                 System.out.println(offi.getLocation());

                 break;

             case 3:
                 System.out.println("enter the  name");
                int offic1 =poli.getOfficersAgeByName(sc.next());
                 System.out.println(offic1);
                 break;
             case 4:
                 System.out.println("enter the  id");
                 String officeersg=poli.getOfficerLocationById(sc.nextInt());
                 System.out.println(officeersg);
                 break;
             case 5:
                 System.out.println("enter the name ");
                String off= poli.getOfficersPostNameByName(sc.next());
                 System.out.println(off);
                 break;
             default:
                 System.out.println("invalied input");
         }
         System.out.println("do you want contin  Y/N");
         input=sc.next();
     }while(input.equals("Y"));

        System.out.println("thank you");



        }
/*
      //  poli.getallofficers();
     poli.updatePostNamebyOfficerName("commisner","Madhan");
     poli.updateofficergenderbyId(3,"female");
   //  poli.deleteoffersinfobyname("Madhan");
     poli.deletetheofficerinformationbyId(1);
     poli.getallNewoffic();






 */
      /*  System.out.println("get the officername by post name");
       String offic = poli.getOfficerNamebyPostname(sc.next());
        System.out.println(offic);

        System.out.println("get officer location by Id");
        String office=poli.getOfficerlocationbyId(sc.nextInt());
        System.out.println(office);

        System.out.println("get officer information by id");
        Officers offi=poli.getOfficersbyId(sc.nextInt());
        System.out.println(offi.getOfficerId());
        System.out.println(offi.getOfficerName());
        System.out.println(offi.getOfficerPost());
        System.out.println(offi.getAge());
        System.out.println(offi.getGender());
        System.out.println(offi.getLocation());

        System.out.println("get officer age by name");
        int offi1=poli.getOfficersagebyname(sc.next());
        System.out.println(offi1);

        System.out.println("get officer post name by name");
        String offer=poli.getOfficersPostnamebyname(sc.next());
        System.out.println(offer);

        System.out.println("get officer post name by Id");
        String offers=poli.getofficersPostnamebyId(sc.nextInt());
        System.out.println(offers);



       */
    }




