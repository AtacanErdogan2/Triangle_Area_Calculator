import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        double firstSide, secondSide, thirdSide;

        // Retrieving data from the user
        System.out.print("Please enter the length of first side : ");
        firstSide = input.nextDouble();
        System.out.print("Please enter the length of second side : ");
        secondSide = input.nextDouble();
        System.out.print("Please enter the length of first side : ");
        thirdSide = input.nextDouble();

        // Calculation Section
        double perimeter, area, u;

        perimeter = firstSide + secondSide + thirdSide;
        u = perimeter / 2;
        area = Math.sqrt(u * (u - firstSide) * (u - secondSide) * (u- thirdSide));

        System.out.println("Perimeter of the triangle : " + perimeter);
        System.out.println("Area of the triangle : " + area);

    }
}