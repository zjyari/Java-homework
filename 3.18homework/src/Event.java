import java.util.HashMap;

import java.util.Scanner;
import java.sql.Date;

public class Event {
       private String eventID;
    private String eventName;
    private String eventVenue;
    private Date eventDate;
    private final int capacity = 200;
    private  HashMap<String, Attendee> seatDetails;
    public Event(){

    }
    public Event(String eventID, String eventName, String eventVenue, Date eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
        this.seatDetails = new HashMap<>(capacity, 0.6f);
    }
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }
    public String getEventID() {
        return eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public HashMap<String, Attendee> getSeatDetails() {
        return seatDetails;
    }
    public int getCapacity() {
        return capacity;
    }
    HandleComplementaryPasses txz =new HandleComplementaryPasses();
    HandlePerformances biaoxian = new HandlePerformances();
    Scanner reader = new Scanner(System.in);
    public void organizeEvent(){
        
        System.out.println("1.Add the attendee");
        System.out.println("2.Remove the attendee");
        System.out.println("3.Find the attendee");
        System.out.println("4.Update the attendee");
        System.out.println("5.Handle complementary passes");
        System.out.println("6.Handle performances");
        int choice=reader.nextInt();
        switch (choice) {
            case 1:
                
                System.out.println("Enter the seat number");
                String id = reader.nextLine();
                System.out.println("Enter the name");
                String attendeeName =reader.nextLine();
                System.out.println("Enter the attendee ID");
                String attendeeID = reader.nextLine();
                Attendee newman =new Attendee(attendeeName, id, attendeeID);
                seatDetails.put(id, newman);
                break;
            case 2:
                System.out.println("Enter the attendee ID of the attendee you want to remove");
                String id1 =reader.nextLine();
                seatDetails.remove(id1);
                break;
            case 3:
                System.out.println("Enter the attendee ID of the attendee you want to find");
                String id2 =reader.nextLine();
                System.out.println(seatDetails.get(id2));
                break;
            case 4:
                
                System.out.println("Please enter the seat number of the attendee you want to update");
                String oldid = reader.nextLine();
                System.out.println("Update the seat number");
                String id3 =reader.nextLine();
                System.out.println("Update the name");
                String name =reader.nextLine();
                System.out.println("Update the attendee ID");
                String newid =reader.nextLine();
                Attendee newdata =new Attendee(name, id3, newid);
                seatDetails.put(oldid, newdata);
                Attendee newdata2 =seatDetails.remove(oldid);
                seatDetails.put(newid,newdata2); 
                break;
            case 5:
                txz.handleComplementaryPasses();
                break;
            
            case 6:
                biaoxian.handlePerformances();                
                break;    
            default:
                System.out.println("Illegal chioce");
                break;
        }
        

    }

   

    

}

