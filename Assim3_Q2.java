/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assim3_q2;

/**
 *
 * @author HP
 */
public class Assim3_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     Mammals A1=new Mammals("Elephant");
        A1.NoOfLegs(4);
        A1.FavFood("Leaves", "stems ", "roots");
        System.out.println("The Animal is "+A1.getname());
        A1.printNoOfLegs();
        A1.printFavFood();
        System.out.println("--------------------------------");
        Mammals A2=new Mammals("Cat");
        A2.NoOfLegs(4);
        A2.FavFood("Milk", "Meat ", "Fish");
        System.out.println("The Animal is "+A2.getname());
        A2.printNoOfLegs();
        A2.printFavFood();
    }
    
}
