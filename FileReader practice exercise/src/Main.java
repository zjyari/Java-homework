import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        String inputFileName = "Groceries.txt";
        String outputFileName = "GroceriesFormatted.txt";
        double totalCost = 0;

        try (FileReader fileReader = new FileReader(inputFileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(outputFileName);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write("****************************************************");
                bufferedWriter.newLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];
                String itemName = data[1];
                String quantity = data[2];
                double price = Double.parseDouble(data[3]);
                totalCost += price;

                System.out.println(line);

                String formattedLine = id + " " + itemName + " " + quantity + " " + price + ".";
                bufferedWriter.write(formattedLine);
                bufferedWriter.newLine();
            }
           
            String totalCostLine = "The grocery shopping total is: €" + totalCost;
            System.out.println(totalCostLine);
            bufferedWriter.write("****************************************************");
            bufferedWriter.newLine();
            bufferedWriter.write(totalCostLine);
            bufferedWriter.newLine();
            bufferedWriter.write("****************************************************");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
