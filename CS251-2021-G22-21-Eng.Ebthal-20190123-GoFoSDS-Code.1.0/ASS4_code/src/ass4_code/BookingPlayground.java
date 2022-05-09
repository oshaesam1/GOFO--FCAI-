/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass4_code;

/**
 *
 * @author Hoda
 */


import java.util.*;

public class BookingPlayground {

    
    /**
     *
     * default constructor
     */
    public BookingPlayground(){
    }
    
    /**
     * display the booked playground details  
     * @param i number of Playground 
     * @param myPlayground that will be displayed
     */
    public void display ( int i,Playground myPlayground)
    {
        System.out.println("playground number : "+i);
        System.out.println("playground name : "+myPlayground.getName());
        //System.out.println("ActivateState"+myPlayground.isActivateState());
        System.out.println("playground size : "+myPlayground.getSize());
        System.out.println(" playground location : "+myPlayground.getLocation());
        System.out.println("playground price per hour : "+myPlayground.getPriceperhour());
       // System.out.println("BookedSlots : "+myPlayground.getBookedSlots());
       // System.out.println("playground cancellation period : "+myPlayground.getCancellationperiod());
        System.out.print("playground Available hours : ");
        for (int j=0 ; j<myPlayground.getavailablehours().size() ;j++){
            System.out.print(myPlayground.getavailablehours().get(j)+"  ");
        }
        System.out.println();
        
    }
    /**
     * check if chosen hours are valid
     * @param get  booked playground
     * @param hour to be checked
     * @return boolean check
     */
    private boolean checkisValidHour(Playground get, int hour) {
        boolean check=false;
        for(int i=0;i<get.getavailablehours().size();i++)
        {
            if(get.getavailablehours().get(i)==hour)
            {
                check=true;
                get.getavailablehours().remove(i);
            }
        }
        return  check;
    }
    
    /**
     * book playground 
     * @param arrPlayground registered playgrounds
     * @param loc playground Location
     */
    public void Booking(ArrayList<Playground> arrPlayground , String loc) {
        ArrayList<Integer>index=new ArrayList<>();
        //System.out.println("arrPlayground.size"+arrPlayground.size());
       for(int i=0 ;i<arrPlayground.size();i++)
       {
          // System.out.println("arrPlayground.get(i).getLocation()"+arrPlayground.get(i).getLocation());
           if(loc.equals(arrPlayground.get(i).getLocation()))
           {
               index.add(i);
               display(i,arrPlayground.get(i));
               
           }
       }
       if(index.size()==0)
       {
           System.out.println("No Playground ");
       }
       else{
           int flag=0;
       System.out.println("Choose playground number");
       Scanner in = new Scanner(System.in);
       int choose_index=in.nextInt();
       for(int i=0; i<index.size();i++)
       {
           if(choose_index==index.get(i))
           {
               flag=1;
               break;
           }
       }
       if(flag==0)
       {
           System.out.println("Invalid Number ");
       }
       else{
       Scanner input = new Scanner(System.in);
       ArrayList<Integer> hours=new ArrayList<>();
       
       while(true)
       {
           System.out.println("enter hours \n if you want to end press 0");
           int hour=input.nextInt();
           if(hour==0)
           {
               break;
           }
           else if(checkisValidHour(arrPlayground.get(choose_index),hour))
           {
               
               
               //System.out.println("thanks god");
               //display(choose_index, arrPlayground.get(choose_index));
              // arrPlayground.get(choose_index).setavailablehours=0;
               hours.add(hour);
           }
           else System.out.println("It's already Booked");
       }
       ///////////////////////////////////////////////////////////////////////////////////////////
       float totalPrice=CalculatingTotalPrice(arrPlayground.get(choose_index),hours.size());
        System.out.println("Total Price is :"+totalPrice);
       //////////////////////////////////////////////////////////////////////////////////////////
       }}
    }
    /**
     * Calculating Total Price
     * @param get
     * @param numOfHours
     * @return TotalPrice
     */
     private float CalculatingTotalPrice(Playground get, int numOfHours) {
       
       return get.getPriceperhour()*numOfHours;

    }
      

}
