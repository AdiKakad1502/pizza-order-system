public class Pizza {
    private int price;
    private boolean food_status; //true if pizza is veg, false  if pizza is non-veg
    private int extraCheese = 100;
    private int extraToppings = 150;
    private int carryBag = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isTakeawayChosen = false; 

    public Pizza(int price,boolean food_status) {
        this.food_status = food_status;
        if(this.food_status){
            this.price = price;
        }
        else{
            this.price+=100;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraChhese(){
        System.out.println("Extra Cheese Added");
        isExtraCheeseAdded = true;
        this.price+=extraCheese;
    }

    public void addExtraToppings(){
        System.out.println("Extra Toppings Added");
        isExtraToppingAdded = true;
        this.price+=extraToppings;
    }

    public void takeAway(){
        System.out.println("Carry Bag Added for Takeaway");
        isTakeawayChosen = true;
        this.price+=carryBag;
    }

    public void getBill(){
        
        if(food_status){
            System.out.println("Pizza - Veg : " + 300);
        }
        else{
            System.out.println("Pizza - Non-Veg : " + 400);
        }
        if(isExtraCheeseAdded){
            System.out.println("Extra Cheese Added : " + extraCheese);
        }

        if(isExtraToppingAdded){
            System.out.println("Extra Toppings Added : " + extraToppings);
        }

        if(isTakeawayChosen){
            System.out.println("Takewaay Bag Added : " + carryBag);
        }
        System.out.println("Bill: " + this.price);
    }
}


