package Computer;

public class Computer {
    String My_name;
    int My_price;
    String My_computer_color;



    public Computer() {

    }


    public Computer(String name){
        this.My_name=name;
        System.out.println(this.My_name);
    }
    public Computer(String name, int price,String color){
        this.My_name=name;
        this.My_price=price;
        this.My_computer_color=color;
        System.out.println("This first computer and its Name is " + " " +name+ "," + " " + " and the price is "+" " +price);
    }

    public Computer(String microsoft_surface, int price) {


    }



    public static void My_computer_Infomation(){
        String name=" iPad ";
        int price=700;
        String color="Blue";
        System.out.println("This is second computer : "+" "+name+" and the price is : " + " "+price+" " + "Color is: " + " "+color);

    }
    public static void My_computer_Infomation_1(String name_1,int price_1,String color_1){
        String name=name_1;
        int price=price_1;
        String color=color_1;
        System.out.println("This is third computer : " + " "+name+" and the price is : " + " " +price+ " " + " Color is: " + " "+color);

    }


    public static void main(String[] args) {

        System.out.println("Welcome to My Computer's outlet");
        Computer obj=new Computer();
        Computer obj1=new Computer(" This is Windows Computer ");
        Computer obj2=new Computer("Microsoft Surface",1500);
        Computer.My_computer_Infomation();
        Computer.My_computer_Infomation_1("MacbookPro",3500,"Black");
    }

}

