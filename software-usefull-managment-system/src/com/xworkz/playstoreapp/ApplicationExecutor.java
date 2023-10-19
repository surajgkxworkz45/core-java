package com.xworkz.playstoreapp;

import com.xworkz.playstoreapp.application.Application;
import com.xworkz.playstoreapp.hub.SoftwareHub;
public class ApplicationExecutor {

    public static void main(String[] args) {
        Application application =new Application();
        application.setApplicationId(1);
        application.setApplicationName("instagram");
        application.setApplicationSizeInMb(45.6);
        application.setApplicationType("socialmedia");
        application.setAppVerstion("v-1.8");


        Application application1 =new Application();
        application1.setApplicationId(2);
        application1.setApplicationName("watsapp");
        application1.setApplicationSizeInMb(43.6);
        application1.setApplicationType("socialmaga");
        application1.setAppVerstion("v-2.0");

        Application application2 =new Application();
        application2.setApplicationId(3);
        application2.setApplicationName("facebook");
        application2.setApplicationSizeInMb(44.6);
        application2.setApplicationType("social");
        application2.setAppVerstion("v-3.0");

        Application application3 =new Application();
        application3.setApplicationId(4);
        application3.setApplicationName("twiter");
        application3.setApplicationSizeInMb(32.6);
        application3.setApplicationType("socialmedia");
        application3.setAppVerstion("v-4.1");

        Application application4=Application.builder().applicationId(5).applicationName("pubg")
                .applicationSizeInMb(1000).applicationType("gaming").appVerstion("v-5.2").build();




        SoftwareHub soft=new SoftwareHub();

        soft.getaddall(application);
        soft.getaddall(application1);
        soft.getaddall(application2);
        soft.getaddall(application3);
        soft.getaddall(application4);
        soft.updateApplicationverstionByName("v-1.9","instagram");
        soft.updateapplicationVerstionandSizeAndCompanyBYName("v-4.2"
                ,35.6,"socialmedia And entertainment ","twiter");
        System.out.println();

        soft.deleteApplicationbyName("instagram");
//  soft.getallapplications();

      /*  Application appli=soft.getapplicationByName("instagram");
        System.out.println(appli.getApplicationName()+ "    "+appli.getApplicationId()+"  "+
                appli.getApplicationType()+"  "+appli.getApplicationSizeInMb()+" "+appli.getAppVerstion());

        Application applia=soft.getapplicationByType("gaming");
        System.out.println(applia.getApplicationName()+ "    "+applia.getApplicationId()+"  "+
                applia.getApplicationType()+"  "+applia.getApplicationSizeInMb());

        Application appliat=soft.getapplicationBySize(32.6);
        System.out.println(appliat.getApplicationName()+ "    "+appliat.getApplicationId()+"  "+
                appliat.getApplicationType()+"  "+appliat.getApplicationSizeInMb());

        Application appliati=soft.getapplicationById(1);
        System.out.println(appliati.getApplicationName()+ "    "+appliati.getApplicationId()+"  "+
                appliati.getApplicationType()+"  "+appliati.getApplicationSizeInMb());

       String applicatio=soft.getapplicationTypeByName("pubg");
        System.out.println(applicatio);


       int app=soft.getapplicationIdbyName("instagram");
        System.out.println(app);


        double applli= soft.getapplicationSizeByName("pubg");
        System.out.println(applli);

*/

    }
}
