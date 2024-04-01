import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
  
public class Main {  
    public static void main(String[] args) {  
        String filePath = "D:\\PORG2-2024\\java homework\\FileReader practice exercise\\Groceries.txt";  
        double totalPrice = 0.0;  
  
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {  
            String line;  
            while ((line = reader.readLine()) != null) {  
               
                String[] parts = line.split(",");  
                if (parts.length == 4) {  
                    
                    String id = parts[0].trim();  
                    String name = parts[1].trim();  
                    String quantity = parts[2].trim();  
                    double price = Double.parseDouble(parts[3].trim());  
  
                   
                    System.out.println("ID: " + id + ", Name: " + name + ", Quantity: " + quantity + ", Price: " + price);  
  
                   
                    totalPrice += price;  
                } else {  
                    System.out.println("Error: Invalid line format in file.");  
                }  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    
        System.out.println("Total Price of all quantities bought: " + totalPrice);  
    }  
}