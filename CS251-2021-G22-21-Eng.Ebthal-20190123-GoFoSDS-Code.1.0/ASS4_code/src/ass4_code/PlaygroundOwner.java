/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass4_code;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hoda
 */
public class PlaygroundOwner extends User {
    ArrayList<Playground> myPlaygrounds;
    
    /**
     * default constructor
     */
    public PlaygroundOwner(){
        myPlaygrounds= new ArrayList<>();
    }

   
    /**
     * registerPlayground
     * @return registered Playground
     */
    public Playground registerPlayground(){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> hours=new ArrayList<>();
        System.out.print(
                        "playground name ");
        String name = in.nextLine();
        System.out.println("playground location");
        String location = in.nextLine();
        System.out.println("playground size ");
        String size = in.nextLine();
        System.out.println("playground Available hours ");
        Scanner input= new Scanner(System.in);
        int hour=input.nextInt();
        hours.add(hour);
        while(true)
        {
            System.out.println("enter hours \n if you want to end press 0");
           hour=input.nextInt();
           if(hour==0)
           {
               break;
           }
           else
           {
             hours.add(hour);
           }
        }
        System.out.println("playground price per hour ");
        float pricePerHour= in.nextInt();
        System.out.println("playground cancellation period ");
        float cancellationPeriod = in.nextInt();
        
        Playground playground= new Playground(name,location ,size, hours,pricePerHour ,cancellationPeriod);
        myPlaygrounds.add(playground);
        return playground;
    
    }
    /**
     * display Owner playground
     */
    public void checkPlaygrounds(){
        
        for(int i=0;i<myPlaygrounds.size();i++){
                System.out.println("playground name : "+myPlaygrounds.get(i).getName());
                System.out.println("ActivateState"+myPlaygrounds.get(i).isActivateState());
                System.out.println("playground size : "+myPlaygrounds.get(i).getSize());
                System.out.println(" playground location : "+myPlaygrounds.get(i).getLocation());
                System.out.println("playground price per hour : "+myPlaygrounds.get(i).getPriceperhour());
                System.out.println("playground cancellation period : "+myPlaygrounds.get(i).getCancellationperiod());
                System.out.println("playground Available hours : "+myPlaygrounds.get(i).getavailablehours());
            
                
        }
    }
}
