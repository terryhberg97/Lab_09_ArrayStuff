//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dataPoints[] = new int[100];
        Random rnd = new Random();
        int val = rnd.nextInt(100) + 1;
        int index = rnd.nextInt(dataPoints.length);
        int sum = 0;
        double avg = 0;
        int count = 0;
        int input = SafeInput.getRangedInt(in, "Enter an inclusive integer ", 1, 100);
        int value = SafeInput.getRangedInt(in, "Enter another inclusive integer ", 1, 100);

        System.out.println("The number chosen is: " + input);

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        int min = dataPoints[0];
        int max = dataPoints[0];
        boolean found = false;

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == input)
            {
                count++;
            }
            if (dataPoints[i] == value)
            {
                System.out.println();
                System.out.println("The value " + value + " was found at array index " + i);
                found = true;
                break;
            }
            if (dataPoints[i] < min)
            {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
            System.out.print(dataPoints[i] + " | ");
            sum += dataPoints[i];
        }
        if (!found)
        {
            System.out.println();
            System.out.println("The value " + value + " was not found");
        }

        avg = (double) sum / dataPoints.length;
        System.out.println("The value " + input + " was found " + count + " times");
        System.out.println("The average of the random array dataPoints is: " + avg);
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The maximum value found is " + max + " and the minimum value found is " + min);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

    }

    public static double getAverage(int values[]) {
        int sum = 0;
        for (int i = 0; i < values.length; i++)
        {
            sum += values[i];

        }
        return (double) sum / values.length;
    }
}



