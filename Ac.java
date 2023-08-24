class Ac{

static boolean isconnected;
static int currentvolume;
static int maxvolume=8;
static int minvolume;
public static boolean onOroff(){

if(isconnected==false){
isconnected=true;
System.out.println("turn on the ac");
}
else if(isconnected==true){
isconnected=false;
System.out.println("turn off the ac");


}

return isconnected;
}


public static void incresevolume(){

if(isconnected==true){
if(currentvolume < maxvolume){
	
	currentvolume=currentvolume+1;
	System.out.println("the ac having a current moad is " + currentvolume);
	
}
	else{
		System.out.println("the ac moad reached the maximum condition");
	}
	
}
else{
	System.out.println("surya first on mado");
}
	

}

public static void decresevolume(){
	
	if(isconnected==true){
	if(currentvolume > minvolume){
		
		currentvolume=currentvolume-1;
		System.out.println("the ac having a current moad is " +currentvolume);
		
		
	}
	
else{
	System.out.println("the ac moad reached the minimum condition");
	}	
}
	else{
		System.out.println("surya loo first ac on mado");
		
	}
	
}
}

