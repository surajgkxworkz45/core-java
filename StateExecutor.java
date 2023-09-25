class StateExecutor{

 public static void main(String args[]){
 
 State stat = new State();
 
 stat.setStateName("Karnataka");
 stat.setAreaInsqkm(191791);
 stat.setCmName("Siddaramaiah");
 stat.setCapitalCity("BANGALORE");
 stat.setPreviousName("Bendakalur");
 
    Country country = new Country();
	
	
	//has-A relation
	country.state = stat;
	country.managedBy = "Govt of INDIA";
	System.out.println(country.managedBy);
	System.out.println(country.state.getStateName());
    System.out.println(country.state.getAreaInsqkm());
	System.out.println(country.state.getCmName());	
	System.out.println(country.state.getCapitalCity());
	System.out.println(country.state.getPreviousName());
}

}
