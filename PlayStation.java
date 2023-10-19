class PlayStation{

  int id;
  String name;
  int noOfToys;
  int noOfGames;
  String place;
  
    public PlayStation( int id , String name , int noOfToys , int noOfGames , String place){
		
		this.id = id;
		this.name = name;
		this.noOfToys = noOfToys;
		this.noOfGames = noOfGames;
		this.place = place;
		 }

   public void displayDetails(){
	   
	   System.out.println("PlayStation Id Is:  " + id);
	   System.out.println("PlayStation Name Is:  " + name);
	   System.out.println("PlayStation Total Toys Is:  " + noOfToys);
	   System.out.println("PlayStation Total Games Is:  " + noOfGames);
	   System.out.println("PlayStation Place Is:  " + place);
	   
   }
}
