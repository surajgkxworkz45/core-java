class PassangerExecutor{

 public static void main(String args[]){
 
 Passanger pass = new Passanger();
 
 pass.setPassangerName("Ching-Chang");
 pass.setTicketPrice(800);
 pass.setGender("Male");
 pass.setAge(40);
 pass.setDestination("Beijing");
 
    Train train = new Train();
	
	
	//has-A relation
	train.passanger = pass;
	train.managedBy = "IRCTC";
	System.out.println(train.managedBy);
	System.out.println(train.passanger.getPassangerName());
    System.out.println(train.passanger.getTicketPrice());
	System.out.println(train.passanger.getGender());	
	System.out.println(train.passanger.getAge());
	System.out.println(train.passanger.getDestination());
}

}
