public class Pizza {
    private int price;
    private boolean food_status;
    private int extraCheese = 100;
    private int extraToppings = 150;
    private int carryBag = 20; //true if pizza is veg, false  if pizza is non-veg

    public Pizza(boolean food_status) {
        this.food_status = food_status;
        if(this.food_status){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
    }

    public void addExtraChhese(){
        System.out.println("Extra Cheese Added");
        this.price+=extraCheese;
    }

    public void addExtraToppings(){
        System.out.println("Extra Toppings Added");
        this.price+=extraToppings;
    }

    public void takeAway(){
        System.out.println("Carry Bag Added for Takeaway");
        this.price+=carryBag;
    }

    public void getBill(){
        System.out.println(this.price);
    }
}
