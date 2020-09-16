

package MakeCar;

import java.util.Scanner;

public class Car {

    private String the_model;
    private String to_make;
    private int the_year;

    Scanner keyboard= new Scanner(System.in);

    //constructor
    public Car(String the_model, String to_make, int the_year) {
    the_model=the_model;
    to_make=to_make;
    the_year=the_year;
    }

//getters

    public String getModel() {
        return the_model;
    }
    public String getMake(){
            return to_make;
       }
    public int getYear(){
        return the_year;
    }

    //setters

    public void setModel(String model) {
        the_model = model;
    }

    public void setMake(String make) {
        to_make = make;
    }

    public void setYear(int year) {

        //year cannot be < 1900 or more than 2019

        while(year <1900 || year > 2019){
            System.out.println("Please enter a valid year");
            year= keyboard.nextInt();
          }
         the_year=year;
        }
        public String toString(){

        return to_make + " " + the_model + " " + Integer.toString(the_year);
        }



}