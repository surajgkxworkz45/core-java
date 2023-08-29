class LenskartExicuter{

public static void main(String arg[]){

Lenskart lenskart =new Lenskart();
lenskart.lenskartplatforms="glass";
lenskart.lenskartProducts=1;
lenskart.lenskartid=125;
lenskart.lenskartmaterials="plastic";
lenskart.lenskartheadquoter="benglure";

System.out.println("the lenskartId " + lenskart.lenskartid ); 
System.out.println("the lenskart platform " + lenskart.lenskartplatforms );
System.out.println("the lenskart products " + lenskart.lenskartProducts);
System.out.println("the lenskart materials they used is " + lenskart.lenskartmaterials);
System.out.println("the lenskart location " + lenskart.lenskartheadquoter);

lenskart.produceproducts();
}
}