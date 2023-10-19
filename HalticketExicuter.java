class HalticketExicuter{


public static void main(String arg[]){


Halticket ticket =new Halticket("surya",39854154,"18EC21","Network theory","4JN19EC099");

//	Halticket hal=null;
Exam eam =new Exam(ticket);
eam.fees=1300;


//has-a realationship

eam.write();

}




}