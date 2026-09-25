import java.util.Scanner;

public class TransformerTemperature {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Transformer Temperature (°C): ");
        double temperature = sc.nextDouble();

        System.out.println("\n--- Transformer Temperature Monitoring ---");
        System.out.println("Temperature: " + temperature + " °C");

        if (temperature < 50) {
            System.out.println("Status: NORMAL");
            System.out.println("Cooling Fan: OFF");
            System.out.println("Alarm: OFF");
        }
        else if (temperature < 70) {
            System.out.println("Status: WARM");
            System.out.println("Cooling Fan: ON");
            System.out.println("Alarm: OFF");
        }
        else if (temperature < 90) {
            System.out.println("Status: HIGH TEMPERATURE");
            System.out.println("Cooling Fan: ON");
            System.out.println("Alarm: ON");
        }
        else {
            System.out.println("Status: CRITICAL!");
            System.out.println("Cooling Fan: ON");
            System.out.println("Alarm: ON");
            System.out.println("Transformer: SHUTDOWN REQUIRED");
        }

        sc.close();
    }
}
