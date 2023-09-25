class CellExicuter{

public static void main(String args[]){

Cell cll= new Cell();

cll.setTypeOfWatch("mens watch");
cll.setWatchName("boatxp");
cll.setWatchPrizes(1531);
cll.setWatchColour("black");
cll.setCompanyName("boat");
cll.setShopName("surya");


Watch24 wat = new Watch24();
wat.cell=cll;

wat.managedBy="boat";

System.out.println(wat.managedBy);

wat.forWatchTime();
System.out.println(wat.cell.getTypeOfWatch());
System.out.println(wat.cell.getWatchName());
System.out.println(wat.cell.getWatchPrizes());
System.out.println(wat.cell.getWatchColour());
System.out.println(wat.cell.getCompanyName());
System.out.println(wat.cell.getShopName());

}




}