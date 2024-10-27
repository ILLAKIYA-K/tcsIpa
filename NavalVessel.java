class NavalVessel{

   private int vesselId;
   private String vesselName;
   private int noOfVoyagesPlanned;
   private int noOfVoyagesCompleted;
   private String purpose;

   NavalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose){
    this.vesselId = vesselId;
this.vesselName = vesselName;
this.noOfVoyagesPlanned = noOfVoyagesPlanned;
this.noOfVoyagesCompleted = noOfVoyagesCompleted;
this.purpose = purpose;   
}

public void setVesselId(int vesselId){
this.vesselId = vesselId;

}

public int getVesselId(){
return vesselId;
}

public void setVesselName(String vesselName){

this.vesselName = vesselName;
}

public String getVesselName(){
return vesselName;
}

public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned){
this.noOfVoyagesPlanned = noOfVoyagesPlanned;
}

public int getNoOfVoyagesPlanned(){
return noOfVoyagesPlanned;
}

public void setNoOfVoyagesCompleted(int noOfVoyagesCompleted){
this.noOfVoyagesCompleted = noOfVoyagesCompleted;
}

public int getNoOfVoyagesCompleted(){
  return noOfVoyagesCompleted;
}

public void setPurpose(String purpose){
this.purpose = purpose;
}

public String getPurpose(){
  return purpose;
}



}