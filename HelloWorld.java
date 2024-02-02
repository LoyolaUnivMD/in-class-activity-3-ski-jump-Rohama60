import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the hill type (normal, large): ");
        String hillType = input.next();
        System.out.println("Enter the par value: ");
        int par = input.nextInt();

        int height;
        double pointsPerMeter;
        int distance;

        if (hillType.equals("normal")) {
            height = 46;
            pointsPerMeter = 2.0;
            distance = 90;
        } else if (hillType.equals("large")) {
            height = 70;
            pointsPerMeter = 1.8;
            distance = 120;
        } else {
            height = 0;
            pointsPerMeter = 0.0;
            distance = 0;
        }

        int points;
        if (distance > par) {
            points = ((distance - par) * (int) pointsPerMeter);
        } else {
            points = 60;
        }

        System.out.println("The hill type is " + hillType);
        System.out.println("The total points earned: " + points);

        if (points >= 61) {
            System.out.println("Great job for doing better than par!");
        } else if (points < 10) {
            System.out.println("What happened??");
        } else {
            System.out.println("Sorry you didn’t go very far");
        }
    }
}