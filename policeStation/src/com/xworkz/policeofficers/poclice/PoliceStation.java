package com.xworkz.policeofficers.poclice;


import com.xworkz.policeofficers.officer.Officers;

import java.util.Arrays;

public class PoliceStation {


    Officers officers[];

    public PoliceStation(int size){

        officers=new Officers[size];
    }

    int index=0;
int id=1;
    public boolean addAllOfficers(Officers officers){

        boolean isAdded=false;
        System.out.println("invoke add officers method");
        if(officers!=null){

            officers.setOfficerId(id++);
            this.officers[index++]=officers;

            isAdded=true;

            System.out.println("all the officers information is added succesfully");

        }
        return isAdded;
    }

         public void getAllOfficers(){
         for(int index=0;index<officers.length;index++){

             System.out.println(officers[index].getOfficerId());
             System.out.println(officers[index].getOfficerName());
             System.out.println(officers[index].getOfficerPost());
             System.out.println(officers[index].getAge());
             System.out.println(officers[index].getGender());
             System.out.println(officers[index].getLocation());

             System.out.println(".....................................................");



         }


         }

    public String getOfficerNamebyPostName(String officerPost){
        System.out.println("Invoke the get officer name by postname");
        String officerName=null;
        for(int index=0;index<officers.length;index++){
            if (officers[index].getOfficerPost().equals(officerPost)) {
                officerName=officers[index].getOfficerName();
                System.out.println("the name is found");
            }
        }
        return officerName;
    }


    public String getOfficerLocationById(int officerId){
        System.out.println("the officer location by id");
        String officerLocation=null;
        for(int index=0;index<officers.length;index++){
            if (officers[index].getOfficerId()==officerId) {
                officerLocation=officers[index].getLocation();
                System.out.println("the name is found");
            }
        }
    return officerLocation;
    }



    public Officers getOfficersById(int officerId){
        System.out.println("invoke officer information by Id");
        Officers officer=null;
        for(int index=0;index<officers.length;index++){
            if (officers[index].getOfficerId()==officerId) {
                officer=officers[index];
                System.out.println("the name is found");
            }
        }
        return officer;

    }

    public int getOfficersAgeByName(String officerName){
        System.out.println("invoke officer information by name");
        int officerage=0;
        for(int index=0;index<officers.length;index++){
            if (officers[index].getOfficerName().equals(officerName)) {
                officerage=officers[index].getAge();
                System.out.println("the name is found");

            }
        }
        return officerage;

    }

    public String getOfficersPostNameByName(String officerName){
        System.out.println("invoke postname by name");
        String officerPostName=null;
        for(int index=0;index<officers.length;index++){
            if (officers[index].getOfficerName().equals(officerName)) {
                officerPostName=officers[index].getOfficerPost();
                System.out.println("the name is found");
            }
        }
        return officerPostName;

    }

    public String getOfficersPostNameById(int officerId){
        System.out.println("invoke the postname by name");
        String officerPostName=null;
        for(int index=0;index<officers.length;index++){
            if (officers[index].getOfficerId()==officerId) {
                officerPostName=officers[index].getOfficerPost();
                System.out.println("the name is found");
            }
        }
        return officerPostName;
    }


    public boolean updatePostNameByOfficerName(String newPost,String existingName){
        boolean isUpdated=false;

        for(int index=0;index<officers.length;index++){
            if(officers[index].getOfficerName().equals(existingName)){
                officers[index].setOfficerPost(newPost);
                System.out.println("the officer is found");
                isUpdated=true;
                System.out.println("the officer post is succesfully updated");

            }
        }

        return isUpdated;

    }


    public boolean updateOfficerGenderById(int existingId,String newGender) {
        boolean isGenderisUpdated = false;
        for (int index = 0; index < officers.length; index++) {
            if (officers[index].getOfficerId() == existingId) {
                officers[index].setGender(newGender);
                isGenderisUpdated = true;
                System.out.println("the gender by name is sucessfully updated");
            }
        }
       return isGenderisUpdated;
    }



    public void deleteOffersInfoByName(String officersName) {
        Officers newOfficer[] = new Officers[this.officers.length - 1];
        int index,newindex = 0;
        for (index=0,newindex=0; index <this.officers.length; index++) {
            if(!officers[index].getOfficerName().equals(officersName)){
                officers[newindex++]=officers[index];
                System.out.println("the offier information is succesfully deleted");
            }
        }
        officers= Arrays.copyOf(officers,newindex);
      //  getAllNewOffic(officers);
    }


    public void deleteTheOfficerInformationById(int officerId){
        System.out.println("invoke the delete the officers information by Id");
        int index,newindex=0;
        for(index=0,newindex=0;index<officers.length;index++){
            if(officers[index].getOfficerId()!=officerId){
                officers[newindex++]=officers[index];
                System.out.println("the officer information is deleted succesfully");
            }
        }
        officers=Arrays.copyOf(officers,newindex);
    }
        public void getAllNewOffic() {
            for (int index = 0; index < this.officers.length; index++) {

                System.out.println(this.officers[index].getOfficerId());
                System.out.println(this.officers[index].getOfficerName());
                System.out.println(this.officers[index].getOfficerPost());
                System.out.println(this.officers[index].getAge());
                System.out.println(this.officers[index].getGender());
                System.out.println(this.officers[index].getLocation());
                System.out.println("-----------------------------------------");
            }
        }


    }
