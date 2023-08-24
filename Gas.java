class Gas{

static boolean isconnected;
static int currentvolume;
static int maxvolume=4;
static int minvolume;
public static boolean onOroff(){

if(isconnected==false){
isconnected=true;
System.out.println("turn on the gas");
}
else if(isconnected==true){
isconnected=false;
System.out.println("turn off the gas");


}

return isconnected;
}


public static void incresevolume(){

if(isconnected==true){
if(currentvolume < maxvolume){
	
	currentvolume=currentvolume+1;
	System.out.println("the gas having a current volum is " + currentvolume);
	
}
	else{
		System.out.println("the gas volume reached the maximum condition");
	}
	
}
else{
	System.out.println("surya first gas on mado");
}
	

}

public static void decresevolume(){
	
	if(isconnected==true){
	if(currentvolume > minvolume){
		
		currentvolume=currentvolume-1;
		System.out.println("the gas having a current volume is " +currentvolume);
		
		
	}
	
else{
	System.out.println("the gas volume reached the minimum condition");
	}	
}
	else{
		System.out.println("surya loo first gas on mado");
		
	}
	
}
}

