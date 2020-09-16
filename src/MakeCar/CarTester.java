package MakeCar;
import java.util.Scanner;

public class CarTester {
    public static void main(String[] args){
        boolean quit=false;
        String toQuit;
        String model,make;
        int year=0;
        Scanner keyboard= new Scanner(System.in);
        //create empty object

        Car car =new Car("", " ",0);

        while(!quit){
            System.out.println("Please enter the car Make, Model, and year: ");
            make= keyboard.next();
            model= keyboard.next();
            year= keyboard.nextInt();

            //Assign data to object
            car.setMake(make);
            car.setModel(model);
            car.setYear(year);
            keyboard.nextLine();

            System.out.println("Here's the data provided by you :" + car);
            System.out.println("Please press 'Q' to Quit or any key to continue");
            toQuit=keyboard.next();

            if(toQuit.equalsIgnoreCase("Q"))
                quit=true;
        }

        keyboard.close();
        System.out.println("Thank you very much for using my java application, Thank You");

    }

   }