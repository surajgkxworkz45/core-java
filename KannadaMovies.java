class KannadaMovies{
public static void main(String[] args){

String kannada[] ={"777charlie","VR","KGF","KGF2","Kantara","Kranthi","Jamese","Ajay","Appu","Guli","Hostel hudugaru","Kabza","Tobey",
              "Addhuri","A","A. K. 47","Aadarshasathi","Aadithya","Aakrosha","Aaha Brahmachari","Aakasmika ","Aaru Mooru Ombhatthu","Aaha Nanna Maduveyanthe","Kotigoba","Mandya","Abhi","Kiss","Barjari"};
String telgu[]={ "Ave Kallu"," Ave Kallu ","Drushyam", "D 16", "Goodachari" , "Evaru" ,"Agent"," Sai Srinivasa Athreya"," Game Over ",
        "Seven ","Chakravyuham" ,"Pushpa", "Virupaksha", "Yashoda"};
int imdb[]={8,65,6,9,9,8,8,7,2,25,9,7,5,5,2};
int imdb1[]={4,56,2,5,5,4,8,2,4,8,25,8,5,4,5};

allmovies(kannada);
allmovies(telgu);
allmovies(imdb);
allmovies(imdb1);	  
}  
			  
			  
  public static void allmovies(String array[]){                                 
  
			  
			 for(int index=0;index<array.length;index++){
				 System.out.println("the movies from left to right are"+array[index]);
				 
			 }
			 
			 System.out.println("-------------------------------------->");
			 for(int index=array.length-1;index>=0;index--){
				 System.out.println("the movies from right to left are"+array[index]);
				 
			 }
			 System.out.println("-------------------------------------->");
			  }
	    public static void allmovies(int array[]){
		for(int index=0;index<array.length;index++){
				 System.out.println("the movies from left to right are"+array[index]);
				 
			 }
			 System.out.println("-------------------------------------->");
			 
			 for(int index=array.length-1;index>=0;index--){
				 System.out.println("the movies from right to left are"+array[index]);
			
			 }
			 System.out.println("-------------------------------------->");
			  }
			  
  }

