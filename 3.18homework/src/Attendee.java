public class Attendee {
    private String attendeeName; 
    private String seatNo; 
    private String attendeeID;
    public Attendee(){}
    public Attendee(String attendeeName, String seatNo, String attendeeID) {
        this.attendeeName = attendeeName;
        this.seatNo = seatNo;
        this.attendeeID = attendeeID;
    }
    public String getAttendeeName() {
        return attendeeName;
    }
    public void setAttendeeName(String attendeeName) {
        this.attendeeName = attendeeName;
    }
    public String getSeatNo() {
        return seatNo;
    }
    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }
    public String getAttendeeID() {
        return attendeeID;
    }
    public void setAttendeeID(String attendeeID) {
        this.attendeeID = attendeeID;
    }
    @Override
    public String toString() {
        return "Attendee {attendeeName=" + attendeeName + ", seatNo=" + seatNo + ", attendeeID=" + attendeeID + "}";
    }
}
