package com.xworkz.playstoreapp.hub;

import com.xworkz.playstoreapp.application.Application;

import java.util.Arrays;

public class SoftwareHub {


    Application application[] = new Application[5];

    int index = 0;

    public boolean getaddall(Application application) {
        System.out.println("getall method created ");
        boolean isadded = false;
        if (application != null) {
            System.out.println("the start add application");
            this.application[index++] = application;
            // index = index++;
            isadded = true;


        }
        if (isadded == true) {
            System.out.println("added all applications created succesfully");
        } else {
            System.out.println("the application is full");

        }
        return isadded;
    }

    public void getallapplications() {
        for (int index = 0; index < application.length; index++) {
            System.out.println("the application types are:");
            System.out.println(application[index].getApplicationId());
            System.out.println(application[index].getApplicationName());
            System.out.println(application[index].getApplicationSizeInMb());
            System.out.println(application[index].getApplicationType());
            System.out.println(application[index].getAppVerstion());

            System.out.println("-------------------------------------------");
        }

    }

    public Application getapplicationByName(String appName) {
        System.out.println("getapplication name method is created");
        Application application1 = null;
        for (int appindex = 0; appindex < this.application.length; appindex++) {

            if (application[appindex].getApplicationName() == appName) {
                application1 = application[appindex];
                System.out.println("application is found please collect the application");
            }
        }


        return application1;
    }

    public Application getapplicationByType(String apptype) {
        System.out.println("getapplication by type is method is created");
        Application applica = null;
        for (int appindex = 0; appindex < this.application.length; appindex++) {
            if (application[appindex].getApplicationType() == apptype) {
                applica = application[appindex];
                System.out.println("the application is found collect the application");
            }

        }
        return applica;
    }

    public Application getapplicationBySize(double appSize) {
        Application applicat = null;
        for (int appindex = 0; appindex < this.application.length; appindex++) {
            if (application[appindex].getApplicationSizeInMb() == appSize) {
                applicat = application[appindex];
                System.out.println("the application is found collect the application");
            }
        }


        return applicat;

    }

    public Application getapplicationById(int appId) {
        System.out.println("get application by id is created");
        Application applicati = null;
        for (int appindex = 0; appindex < this.application.length; appindex++) {
            if (application[appindex].getApplicationId() == appId) {
                applicati = application[appindex];
                System.out.println("the application is found collect the application");
            }
        }
        return applicati;
    }

    public String getapplicationTypeByName(String appname) {
        System.out.println("the get application type by name");
        String appType = null;
        for (int appindex = 0; appindex < this.application.length; appindex++) {
            if (application[appindex].getApplicationName() == appname) {
                appType = application[appindex].getApplicationType();
                System.out.println("the application is found collect the application");
            }
        }
        return appType;
    }

    public int getapplicationIdbyName(String appname) {
        System.out.println("the get application id by name created");
        int appId = 0;
        for (int appindex = 0; appindex < this.application.length; appindex++) {
            if (application[appindex].getApplicationName() == appname) {
                appId = application[appindex].getApplicationId();
                System.out.println("the application is found collect the application");
            }
        }
        return appId;

    }


    public double getapplicationSizeByName(String appName){
        System.out.println("the get application size  by name is created");
        double appsize=0.0;
        for(int appindex=0;appindex<this.application.length;appindex++){
            if(application[appindex].getApplicationName()==appName);{
                appsize=application[appindex].getApplicationSizeInMb();
                System.out.println("the application is found collect the application");
            }
            }
        return appsize;
        }

        public boolean updateApplicationverstionByName(String updatedverstion, String existingName){

        boolean isverstionUpdated=false;

        for(int appindex=0;appindex<this.application.length;appindex++){
            if(application[appindex].getApplicationName()==existingName){
                application[appindex].setAppVerstion(updatedverstion);

                isverstionUpdated=true;
                System.out.println("the application is found ");
                System.out.println("the verstion is updated succesfully collect the application");
            }
        }
        return isverstionUpdated;
        }



        public boolean updateapplicationVerstionandSizeAndCompanyBYName(String updatedVerstion,double ubdatedSize
        ,String updateapptype,String existingName){
        boolean isupdatednaguru=false;
            for(int appindex=0;appindex<this.application.length;appindex++){
                if(application[appindex].getApplicationName()==existingName){
                    application[appindex].setAppVerstion(updatedVerstion);
                    application[appindex].setApplicationSizeInMb(ubdatedSize);
                    application[appindex].setApplicationType(updateapptype);

                    System.out.println("the application is found");
                    isupdatednaguru=true;
                }

            }
            return  isupdatednaguru;
        }



    public  void deleteApplicationbyName(String applicationName) {
        System.out.println("invoke the delete application by name ");
        Application newapplication[]=new Application[this.application.length-1];
        int appindex, newindex=0;
        for ( appindex=0, newindex=0; appindex < this.application.length; appindex++) {
            if (application[appindex].getApplicationName() != applicationName) {
                application[newindex++]=application[appindex];
                System.out.println("the given app is delete the app from this software");
            }
            }
           application= Arrays.copyOf(application,newindex);
        getallNewapplication(application);
        }

        public void getallNewapplication(Application[] application){





        for(int i=0;i<application.length;i++){
            System.out.println(application[i].getApplicationId());
            System.out.println(application[i].getApplicationName());
            System.out.println(application[i].getApplicationSizeInMb());
            System.out.println(application[i].getApplicationType());
            System.out.println(application[i].getAppVerstion());
            System.out.println("----------------------------------------");
        }



        }


    }





















