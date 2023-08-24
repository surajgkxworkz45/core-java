class SpeakerJbl{
      
	  static boolean isconnected;
      static int maxvolume=8;
	  static int currentvolume;
	  static int minvolume;
public static boolean onOroff(){


if(isconnected==false){
isconnected=true;
System.out.println("the speaker is turned on");
}
else if(isconnected==true){
isconnected=false;
System.out.println("the speaker is turned of");
}



return isconnected;
}
  

 public static void increasevolume(){
	 
	 if(isconnected==true){
		 if(currentvolume < maxvolume){
			 
			 currentvolume=currentvolume+1;
			 System.out.println("the current volum is " + currentvolume );
		 }
		 else{
			 System.out.println ("the maximum value rached");
		 }
	 }
	 else{
		  System.out.println ("surya loo first speaker on mado");
		 
	 }
	 
	 
	
	 
	 
 }
     public static void decreasevolume(){
		 if(isconnected==true){
		 if(currentvolume > minvolume){
			 
			 currentvolume=currentvolume-1;
			 System.out.println("the current volum is " + currentvolume );
		 }
    else{
		System.out.println ("the minimum value rached");
	}
	}
	else{
		System.out.println ("surya loo first speaker on mado");
	}
	 }
}