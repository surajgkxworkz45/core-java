class Halticket{


String cadidateName;
int halticketId;
String subCode;
String subName;
String usnNo;




public Halticket(String cadidateName,int halticketId,String subCode,String subName,String usnNo){

this.cadidateName=cadidateName;
this.halticketId=halticketId;
this.subCode=subCode;
this.subName=subName;
this.usnNo=usnNo;
}


public void displayDetailes(){

System.out.println("the candidate name is " +cadidateName);
System.out.println("the halticket id is " +halticketId);
System.out.println("the subject code is " +subCode);
System.out.println("the subject name is " +subName);
System.out.println("the usn no is " +usnNo);


}
}