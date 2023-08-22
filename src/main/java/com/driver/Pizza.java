package com.driver;

public class Pizza {

    private int cheesePrice ;

    private int basePrice;

    private int toppingPrice;

    private int papperBagPrice;

    String bill;

    private int totalPrice;

    boolean isCheeseAdded;

    boolean isToppingAdded;

    boolean isPapperBagAdded;

    boolean isBillGenerated;
    public Pizza(Boolean isVeg){

        // your code goes here
        if(isVeg)
        {
            basePrice = 300;
            toppingPrice = 70;
        }
        else
        {
            // non veg case
            basePrice = 400;
            toppingPrice = 120;

        }

        papperBagPrice = 120;
        cheesePrice = 80;

        isCheeseAdded = false;
        isToppingAdded = false;
        isPapperBagAdded = false;

        totalPrice = basePrice;
        bill = "Base Price of the Pizza:"+basePrice + "\n";

    }

    public int getPrice(){
       return totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false)
        {
            this.totalPrice = totalPrice + cheesePrice;
            isCheeseAdded = true;

        }


    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded == false)
        {
            this.totalPrice = totalPrice + toppingPrice;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPapperBagAdded == false)
        {
            totalPrice = totalPrice + papperBagPrice;
            isPapperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false)
        {
            if(isCheeseAdded == true)
            {
                bill = bill +"Extra Cheese Added: "+cheesePrice+"\n";
            }
            if(isToppingAdded == true)
            {
                bill = bill + "Extra Toppings Added: " +toppingPrice + "\n";
            }
            if(isPapperBagAdded == true)
            {
                bill = bill + "Papperbag Added: "+papperBagPrice + "\n";
            }
            bill = bill + "Total Price: "+totalPrice + "\n";
            isBillGenerated =  true;
        }

        return bill;

    }
}
