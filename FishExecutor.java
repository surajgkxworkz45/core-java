class FishExecutor{

 public static void main(String args[]){
 
 Fish fishh = new Fish();
 fishh.setFishName("Bangude");
 fishh.setPrice(400);
 fishh.setColour("Black");
 fishh.setRiverName("Kauvery");
 
 
    Water water = new Water();
	
	
	//has-A relation
	water.fish = fishh;
	water.managedBy = "Kauvery Nigam";
	System.out.println(water.managedBy);
	System.out.println(water.fish.getFishName());
    System.out.println(water.fish.getPrice());
	System.out.println(water.fish.getColour());	
	System.out.println(water.fish.getRiverName());
	}

}
