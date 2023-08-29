class ApartmentExicuter{



public static void main(String arg[]){


Apartment apartment=new Apartment();
apartment.apartmentId=25;
apartment.apartmentName="Surya weeds suraka";
apartment.apartmentlocation="basvangudi";
apartment.apartmentFlores=50;
apartment.apartmentNoOfoneBhk=180;
apartment.apartmentNoOftwoBhk=100;

System.out.println("the apartmentId " + apartment.apartmentId ); 
System.out.println("appartment name is " + apartment.apartmentName );
System.out.println("appartment location " +apartment.apartmentlocation);
System.out.println("appartment flores " + apartment.apartmentFlores );
System.out.println("number one bhk " + apartment.apartmentNoOfoneBhk );
System.out.println("the number of " + apartment.apartmentNoOftwoBhk);

apartment.providingAccomadation();

Apartment apartment1=new Apartment();
apartment1.apartmentId=24;
apartment1.apartmentName="Surya weeds jaya";
apartment1.apartmentlocation="rajajinagar";
apartment1.apartmentFlores=45;
apartment1.apartmentNoOfoneBhk=150;
apartment1.apartmentNoOftwoBhk=121;

System.out.println("the apartmentId " + apartment1.apartmentId ); 
System.out.println("appartment name is " + apartment1.apartmentName );
System.out.println("appartment location " +apartment1.apartmentlocation);
System.out.println("appartment flores " + apartment1.apartmentFlores );
System.out.println("number one bhk " + apartment1.apartmentNoOfoneBhk );
System.out.println("the number of " + apartment1.apartmentNoOftwoBhk);


apartment1.providingAccomadation();



}




}