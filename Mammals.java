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
public class Mammals implements Animal
{
   public String animalname;
   public int noOfLegs;
    
    String favfood1,favfood2,favfood3;
    public Mammals(String ainmalname)
    {
        this.animalname=ainmalname;
    }
    public void eat()
    {
        
    }
     public void travel()
    {
        
    }
     public String getname()
     {
        return animalname;
     }
     public void NoOfLegs(int num)
     {
         noOfLegs=num;
         
     }
      public void printNoOfLegs()
     {
         System.out.println("The number of legs = "+ noOfLegs);
     }
      public void FavFood(String f1 ,String f2,String f3)
      {
          favfood1=f1;
          favfood2=f2;
          favfood3=f3;
      }
       public void printFavFood()
     {
         System.out.println("The Favorite Food is  "+favfood1+", "+favfood2+"and  "+favfood3);
     }
}
