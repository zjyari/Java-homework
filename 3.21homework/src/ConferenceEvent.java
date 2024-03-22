public class ConferenceEvent extends Event{
  private boolean breakfastRequired;
  private boolean lunchRequired;
  private boolean dinnerRequired;
  private double breakfastCost;
  private double lunchCost;
  private double dinnerCost;
  private double ConferenceEventcost;
 
  public ConferenceEvent (){    
  }
  public ConferenceEvent(String eventID, String eventName, String eventLocation,
          String eventPointOfContact, double eventCost, int totalParticipants, int totalEventDays,
          boolean breakfastRequired, boolean lunchRequired, boolean dinnerRequired, double brefakfastCost,
          double lunchCost, double dinnerCost) {
      super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
      this.breakfastRequired = breakfastRequired;
      this.lunchRequired = lunchRequired;
      this.dinnerRequired = dinnerRequired;
      this.breakfastCost = brefakfastCost;
      this.lunchCost = lunchCost;
      this.dinnerCost = dinnerCost;
      
  }

  public boolean isBreakfastRequired() {
      return breakfastRequired;
  }


  public void setBreakfastRequired(boolean breakfastRequired) {
      this.breakfastRequired = breakfastRequired;
  }


  public boolean isLunchRequired() {
      return lunchRequired;
  }


  public void setLunchRequired(boolean lunchRequired) {
      this.lunchRequired = lunchRequired;
  }


  public boolean isDinnerRequired() {
      return dinnerRequired;
  }


  public void setDinnerRequired(boolean dinnerRequired) {
      this.dinnerRequired = dinnerRequired;
  }


  public double getBrefakfastCost() {
      return breakfastCost;
  }


  public void setBrefakfastCost(double brefakfastCost) {
      this.breakfastCost = brefakfastCost;
  }


  public double getLunchCost() {
      return lunchCost;
  }


  public void setLunchCost(double lunchCost) {
      this.lunchCost = lunchCost;
  }


  public double getDinnerCost() {
      return dinnerCost;
  }

  

  public void setDinnerCost(double dinnerCost) {
      this.dinnerCost = dinnerCost;
  }
  


  public double getConferenceEventcost() {
      return ConferenceEventcost;
  }


  public void setConferenceEventcost(double conferenceEventcost) {
      ConferenceEventcost = conferenceEventcost;
  }
  @Override
  public double calculateEventCost(){
      double ConferenceEventcost = super.getEventCost();
      if(breakfastRequired)
      {
          ConferenceEventcost=breakfastCost*super.getTotalParticipants()+ConferenceEventcost;
      }else if (lunchRequired) {
          ConferenceEventcost=lunchCost*super.getTotalParticipants()+ConferenceEventcost;
      }
      else if(dinnerRequired)
      {
          ConferenceEventcost=lunchCost*super.getTotalParticipants()+ConferenceEventcost;
      }  
      return ConferenceEventcost;
  }



  @Override
  public String toString() {
      return "ConferenceEvent [breakfastRequired=" + breakfastRequired + ", lunchRequired=" + lunchRequired
              + ", dinnerRequired=" + dinnerRequired + ", brefakfastCost=" + breakfastCost + ", lunchCost="
              + lunchCost + ", dinnerCost=" + dinnerCost + ", ConferenceEventcost=" + ConferenceEventcost + "]";
  }

}