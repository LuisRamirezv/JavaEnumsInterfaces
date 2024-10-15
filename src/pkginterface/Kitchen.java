/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class Kitchen {
    
    // This is the kitchen
    // the food will be served from here
    
    // we need to capture the number of food we are preparing
    // Collection of the foods
    
    private ArrayList<Food> orders = new ArrayList<>();
    
    // we want to know how many orders we have in the kitchen list
    
    public int numRemaningOrders(){
        // return the size of the arraylist wich in theory should be 
        // the numbers of order we have
        
        return orders.size();
    
    }
    
    // Create a method to populate the collection of orders
    // take in the orders
    
    public void add(Food food){
    
    // Since we are working with an Arraylist we can use
    orders.add(food);
        System.out.println("Added: " + food.getName());
        
        
        
    
    // Create the logic to check for allergens
    // Sunce the allergens are inherent to the foodingredient
    // in order for us to check the allergens we can check
    // instance of the allergens in this particular food
    
    
    if(food instanceof Allergic){
    
    // The check here is through the list of allergens 
    
        System.out.println("Warning this order contains the followings. allergens: ...");
        
        Allergens[] allergens((Allergic) food).ListAllergens;
        
        for (Allergen)
        
        
        
    }
    
    
    
    
    
    
    
    }
    
    
    
}
