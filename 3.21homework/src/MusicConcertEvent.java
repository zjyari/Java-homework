public class MusicConcertEvent extends Event{
    private boolean merchandiseRequired;
    private double merchandiseCost;
    

    public MusicConcertEvent() {
        
    }
    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact,
            double eventCost, int totalParticipants, int totalEventDays, boolean merchandiseRequired,
            double merchandiseCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
        
    }
    public boolean isMerchandiseRequired() {
        return merchandiseRequired;
    }
    public void setMerchandiseRequired(boolean merchandiseRequired) {
        this.merchandiseRequired = merchandiseRequired;
    }
    public double getMerchandiseCost() {
        return merchandiseCost;
    }
    public void setMerchandiseCost(double merchandiseCost) {
        this.merchandiseCost = merchandiseCost;
    }
    
    
    @Override
    public double calculateEventCost(){
        double t = 0;
        if(merchandiseRequired){
            t +=getMerchandiseCost()*super.getTotalParticipants()+super.getEventCost();
        }
        return t;
    }
    @Override
    public String toString() {
        return "MusicConcertEvent [merchandiseRequired=" + merchandiseRequired + ", merchandiseCost=" + merchandiseCost
                 + "]";
    }

    
}