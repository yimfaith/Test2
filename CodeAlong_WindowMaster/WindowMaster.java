import java.util.Scanner;

public class WindowMaster {
    public static void main(String[] args) {
        //introduce the program
        System.out.println("Hello! We will be taking the measurements for you windows so that we can calculate the total cost to replace.");
        System.out.println("Please follow the directions.");

        //declare the variables for height and width
        float height= 0;
        float width= 0;

        //declare other variables
        float area= 0;
        float perimeter= 0;
        
        //declare and initialize the scanner
        Scanner myScanner= new Scanner(System.in);

       //prompt the user for input
        System.out.println("Please input the height of your window: ");
        height= myScanner.nextFloat();
        System.out.println("Please input the width of your window: ");
        width= myScanner.nextFloat();

       //do the calculations
        area= height * width;
        perimeter= (width+height)*2;
       float cost= ((3.50f * area) + (2.25f * perimeter));


        //print the results
        System.out.println("The height of your window is: " + height);
        System.out.println("The width of your window is: " + width);
        System.out.println("The area of your window is: " + area);
        System.out.println("The perimeter of your window is: " + perimeter);
        System.out.println("The cost of your window is: " + cost);
    }

}
