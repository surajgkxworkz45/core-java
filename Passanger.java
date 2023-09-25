class Passanger{


     private String passangerName;
	 private int ticketPrice;	
	 private String gender;	 
	 private int age;
	 private String destination;
	 
    public Passanger(){
	             }
		
	public void setPassangerName(String passangerName){
	  this.passangerName = passangerName;
	}
	public String getPassangerName(){
		return passangerName;
	}
	public void setTicketPrice(int ticketPrice){
		this.ticketPrice = ticketPrice;
    }
	public int getTicketPrice(){
		return ticketPrice;
	}
	public  void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}

	public void setAge(int age){
		this.age = age;		
	}
	public int getAge(){
		return age;
	} 
	public void setDestination(String destination){
	  this.destination = destination;
	}
	public String getDestination(){
	   return destination;
	}
	
	
}
