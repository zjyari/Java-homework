import java.util.Scanner;

public class Main {
    public static double sum=0;
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the event ID ");
      String eventID = sc.nextLine();
      System.out.println("Enter the event name ");
      String eventName = sc.nextLine();
      System.out.println("Enter the event location ");
      String eventLocation = sc.nextLine();
      System.out.println("Enter the point of contact ");
      String eventPointOfContact = sc.nextLine();
      System.out.println("Enter the total participants");
      int totalParticipants = sc.nextInt();
      System.out.println("Enter the total event days");
      int totalEventDays = sc.nextInt();
      
      for(int i=0;i<totalEventDays;i++){
        System.out.println("Please choose event");
        System.out.println("1.Conference ");  
        System.out.println("2.Music Concert ");  
        int choice=sc.nextInt();
        switch (choice) {
          case 1:
            System.out.println("Please choose whether breakfast repuire (true or false) ");
            boolean breakfast = sc.nextBoolean();
           
            System.out.println("Please enter the cost of breakfast ");
            double breakfastcost = sc.nextDouble();
            
            System.out.println("Please choose whether lunch repuire (true or false) ");
           boolean lunch = sc.nextBoolean();
          
              System.out.println("Please enter the cost of lunch ");
              double  lunchcost = sc.nextDouble();
            
           
            
            System.out.println("Please choose whether dinner repuire (true or false) ");
            boolean dinner = sc.nextBoolean();
           
            System.out.println("Please enter the cost of dinner ");
            double  dinnercost = sc.nextDouble();
            ConferenceEvent conferenceEvent = new ConferenceEvent( eventID,  eventName,  eventLocation,
             eventPointOfContact,sum, totalParticipants, totalEventDays, breakfast,  lunch,  dinner,  breakfastcost,
            lunchcost, dinnercost);
            sum=sum+conferenceEvent.calculateEventCost();
            break;
        
          case 2:
            System.out.println("Please enter whether merchandise require");
            boolean merchandiseRequire = sc.nextBoolean();
            System.out.println("Please enter the cost of merchandise ");
            double merchandiseCost = sc.nextDouble();
            MusicConcertEvent musicConcertEvent = new MusicConcertEvent(eventID, eventName, eventLocation, eventPointOfContact, sum, totalParticipants, totalEventDays, merchandiseRequire, merchandiseCost);
            sum=sum+musicConcertEvent.calculateEventCost();
            break;
        }
      }
      System.out.print("The total cost is "+sum);
      sc.close();
    }
}

