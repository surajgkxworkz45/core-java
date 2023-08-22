class Bag{

static String bagBrands[]={"fastrak","globas","american","puma","wild craft"};

static int bagPrizes[]={800,585,900,1000,850};

public static void main(String args[]){

System.out.println("the length of the Bag prizes is " + bagPrizes.length);


for(int suryaIndex=0;suryaIndex<bagPrizes.length;suryaIndex++){
System.out.println(bagPrizes[suryaIndex]);

}
System.out.println("---------------------------------");


for(int suryaIndex=bagPrizes.length-1;suryaIndex>=0;suryaIndex--){
System.out.println(bagPrizes[suryaIndex]);
}
System.out.println("------------------------------------");



}


}