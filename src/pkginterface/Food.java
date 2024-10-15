/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author felip
 */
public class Food {
    
    // The attributes for a food are as follows
    // A price a name and course type
    
    private String name;
    private double price;
    private Courses type;
    
    // The next thing is that these fooods will be prepared in a kitchen
    // thereford we need to have a kitchen attribute to see which
    
    private static Kitchen kitchen;
    
    // Set the kitchen that the food is being made out of 
    public static void setKitchen(Kitchen newKitchen){
    
        kitchen = newKitchen;
    
    
    }
    
    // The constructor will take tine information
    // from the user add them to the list of food

    public Food(String name, double price, Courses type) {
        
        this.name = name;
        this.price = price;
        this.type = type;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    
    
    
    
    
    
}
