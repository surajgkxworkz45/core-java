class State{


     private String stateName;
	 private int areaInsqkm;	
	 private String cmName;	 
	 private String capitalCity;
	 private String previousName;
	 
    public State(){
	             }
		
	public void setStateName(String stateName){
	  this.stateName = stateName;
	}
	public String getStateName(){
		return stateName;
	}
	public void setAreaInsqkm(int areaInsqkm){
		this.areaInsqkm = areaInsqkm;
    }
	public int getAreaInsqkm(){
		return areaInsqkm;
	}
	public  void setCmName(String cmName){
		this.cmName = cmName;
	}
	public String getCmName(){
		return cmName;
	}

	public void setCapitalCity(String capitalCity){
		this.capitalCity = capitalCity;		
	}
	public String getCapitalCity(){
		return capitalCity;
	} 
	public void setPreviousName(String previousName){
	  this.previousName = previousName;
	}
	public String getPreviousName(){
	   return previousName;
	}
	
	
}
