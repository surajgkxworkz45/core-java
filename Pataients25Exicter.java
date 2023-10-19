class Pataients25Exicter{
 
 public static void main(String args[]){
 
  Pataients25 past =new  Pataients25("surya","zatka",201,"cancer","satnaryana","suraka");
  past.setName("surya");
  System.out.println("the name of the patients " + past.getName());
  System.out.println("---------------------------------------------");
  past.setConsultantDocter("zatka");
  System.out.println("the name of the docter " + past.getConsultantDocter());
  System.out.println("---------------------------------------------");
  past.setRoomNo(201);
  System.out.println("the room no  " + past.getRoomNo());
  System.out.println("---------------------------------------------");
  past.setHealthIssue("cancer");
  System.out.println("the patients healt issue  " + past.getHealthIssue());
  System.out.println("---------------------------------------------");
  past.setGuardian("satnaryana");
  System.out.println("gaurdian name is " + past.getGuardian());
  System.out.println("---------------------------------------------");
  past.setHospitalName("suraka");
  System.out.println("the hospital name is  " + past.getHospitalName());
  System.out.println("---------------------------------------------");
 
 
 }
 
 
 
 
 
 
 }