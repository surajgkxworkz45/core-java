class Microwave{

static boolean isconnected;
static int currentvolume;
static int maxvolume=5;
static int minvolume;
public static boolean onOroff(){

if(isconnected==false){
isconnected=true;
System.out.println("turn on the microwave");
}
else if(isconnected==true){
isconnected=false;
System.out.println("turn off the microwave");


}

return isconnected;
}


public static void incresevolume(){

if(isconnected==true){
if(currentvolume < maxvolume){
	
	currentvolume=currentvolume+1;
	System.out.println("the microwave having a current volum is " + currentvolume);
	
}
	else{
		System.out.println("the microwave volume reached the maximum condition");
	}
	
}
else{
	System.out.println("surya first microwave on mado");
}
	

}

public static void decresevolume(){
	
	if(isconnected==true){
	if(currentvolume > minvolume){
		
		currentvolume=currentvolume-1;
		System.out.println("the microwave having a current volume is " +currentvolume);
		
		
	}
	
else{
	System.out.println("the microwave volume reached the minimum condition");
	}	
}
	else{
		System.out.println("surya loo first microwave on mado");
		
	}
	
}
}

