import java.util.*;
public class Main{
//Colour codes
    public static final String ANSI_RESET = "\u001B[0M";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] prices = {300,450,475,500,525,560,700,850};
        int[] varieties = {1,2,3,4,5,6,7,8};

        System.out.println(ANSI_PURPLE + "              Welcome to Rajlabdhi Pizzeria         " + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Enter your name: " + ANSI_RESET);
        String name = sc.nextLine();
        System.out.println(ANSI_CYAN + "Enter your Phone Number: " + ANSI_RESET);
        int phone = sc.nextInt();
        System.out.println(ANSI_BLUE + "----------------------------------------------------------------");
        System.out.println("           Here is the Menu for our Pizzeria         ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Sr.No.    Pizza Name              Veg         Non-Veg");
        System.out.println("  1       Margherita              300           400  ");
        System.out.println("  2       Farmhouse               450           550  ");
        System.out.println("  3       Peri-Peri               475           575  ");
        System.out.println("  4       Paneer Delight          500           525  ");
        System.out.println("  5       English Retreat         525           625  ");
        System.out.println("  6       Burn to Hell            560           660  ");
        System.out.println("  7       Veg Extravaganza        700           800  ");
        System.out.println("  8       Rajlabdhi Special       850           950  ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("          Extra Cheese      ::    100");
        System.out.println("          Extra Toppings    ::    150");
        System.out.println("----------------------------------------------------------------");
        System.out.println("  For Takeaways, Bag Charge ::    020");
        System.out.println("----------------------------------------------------------------" + ANSI_RESET);
        
        int totalprice = 0;
        System.out.println(ANSI_CYAN + "Enter the number of pizzas you want to order: " + ANSI_RESET);
        int pizzasNumber = sc.nextInt();

        for(int i = 1; i <= pizzasNumber;i++){
            int eachprice = 0;
            System.out.println("Pizza number: " + i);
            System.out.println("Enter the pizza number you want: ");
            int pizzaChoice = sc.nextInt();
            System.out.println("Press 0 for veg and 1 for non-veg: ");
            int veg = sc.nextInt();
            if(veg==0){
                Pizza p = new Pizza(prices[pizzaChoice-1],true);
            }
            else{
                Pizza p = new Pizza(prices[pizzaChoice-1],false);
            }
            System.out.println("Press 1 if you want extra cheese, otherwise press 0");
            int eC = sc.nextInt();
            System.out.println("Press 1 if you want extra toppings, otherwise press 0");
            int eT = sc.nextInt();
            System.out.println("Press 1 if you want takeaway and 0 for dine-in");
            int dineIn = sc.nextInt();



        }
    }
}
