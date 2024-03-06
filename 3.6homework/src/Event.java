import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Event {
    private String eventID;
    private String eventName;
    private String eventVenue;
    private LocalDate eventDate;
    private ArrayList<String> eventAttendees;

    public Event(String eventID, String eventName, String eventVenue, LocalDate eventDate)
    {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
        this.eventAttendees = new ArrayList<>();
    }

    public String getEventID() 
    {
        return eventID;
    }

    public void setEventID(String eventID) 
    {
        this.eventID = eventID;
    }

    public String getEventName() 
    {
        return eventName;
    }

    public void setEventName(String eventName) 
    {
        this.eventName = eventName;
    }

    public String getEventVenue() 
    {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) 
    {
        this.eventVenue = eventVenue;
    }

    public LocalDate getEventDate() 
    {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) 
    {
        this.eventDate = eventDate;
    }

    public ArrayList<String> getEventAttendees() 
    {
        return eventAttendees;
    }

    public void setEventAttendees(ArrayList<String> eventAttendees) 
    {
        this.eventAttendees = eventAttendees;
    }

    public void addAttendee(String attendeeName)
    {
        eventAttendees.add(attendeeName);
    }

    public void removeAttendee(String attendeeName) 
    {
        eventAttendees.remove(attendeeName);
    }

    public void updateAttendee(String oldName, String newName)
    {
        int index = eventAttendees.indexOf(oldName);
        if (index != -1) {
            eventAttendees.set(index, newName);
        } else {
            System.out.println("Attendee not found!");
        }
    }

    public String findAttendee(String attendeeName) 
    {
        int index = eventAttendees.indexOf(attendeeName);
        if (index != -1) {
            return "Attendee found at index: " + index;
        } else {
            return "Attendee not found!";
        }
    }

    public int getTotalAttendees() 
    {
        return eventAttendees.size();
    }

    @Override
    public String toString() 
    {
        return "Event{" +
                "eventID='" + eventID + '\'' +
                ", eventName='" + eventName + '\'' +
                ", eventVenue='" + eventVenue + '\'' +
                ", eventDate=" + eventDate +
                ", eventAttendees=" + eventAttendees +
                '}';
    }

    public void organizeEvent() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter event ID: ");
        setEventID(scanner.nextLine());

        System.out.print("Enter event name: ");
        setEventName(scanner.nextLine());

        System.out.print("Enter event venue: ");
        setEventVenue(scanner.nextLine());

        System.out.print("Enter event date (yyyy-MM-dd): ");
        String dateInput = scanner.nextLine();
        setEventDate(LocalDate.parse(dateInput));

        boolean done = false;
        while (!done) {
            System.out.println("Available operations:");
            System.out.println("1. Add attendee");
            System.out.println("2. Remove attendee");
            System.out.println("3. Update attendee");
            System.out.println("4. Find attendee");
            System.out.println("5. Exit");

            System.out.print("Enter operation number: ");
            int operation = scanner.nextInt();
            scanner.nextLine(); 

            switch (operation) {
                case 1:
                    System.out.print("Enter attendee name: ");
                    String attendeeName = scanner.nextLine();
                    addAttendee(attendeeName);
                    break;
                case 2:
                    System.out.print("Enter attendee name to remove: ");
                    attendeeName = scanner.nextLine();
                    removeAttendee(attendeeName);
                    break;
                case 3:
                    System.out.print("Enter old attendee name: ");
                    String oldName = scanner.nextLine();
                    System.out.print("Enter new attendee name: ");
                    String newName = scanner.nextLine();
                    updateAttendee(oldName, newName);
                    break;
                case 4:
                    System.out.print("Enter attendee name to find: ");
                    attendeeName = scanner.nextLine();
                    System.out.println(findAttendee(attendeeName));
                    break;
                case 5:
                    done = true;
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
            }
        }

        System.out.println("Total attendees: " + getTotalAttendees());
    }

    public static void main(String[] args) {
        Event event = new Event("1", "Example Event", "123 Main Street", LocalDate.now());
        event.organizeEvent();
    }
}
