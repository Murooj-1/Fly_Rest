/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



public class RunMealClass {
  
    /**
     *
     * @param Meals
     */
    public void printTypesOfMeals(TripMeals Meals){
        Meals.TypesOfMeals(); 

    }

    /**
     *
     * @param Meals
     */
    public void printAdvance(TripMeals Meals){   
        Meals.AdvanceReservationOfMeals();
        
    }
  
    /**
     *
     * @param Meals
     * @param choice1
     * @param choice2
     */
    public void Execution(TripMeals Meals,int choice1,int choice2){  
        if ( choice2==0){
         Meals.BookedMeals( choice1);
         Meals.MostBookedMeals(choice1);}
           else{
         Meals.BookedMeals( choice1, choice2);
         Meals.MostBookedMeals(choice1, choice2);}
        
    } 
    
    
   
    
}
