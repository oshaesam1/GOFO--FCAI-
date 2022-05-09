/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass4_code;

import java.util.*;
//import java.util.ArrayList;

/**
 *
 * @author Hoda
 */

    
    public class system {
     String Name ;
     ArrayList<Playground> playgrounds;
     ArrayList<User> users;
     BookingPlayground bookPlayground;
    
     /**
      * default constructor
      */
     public system() {
        playgrounds = new ArrayList<>();
        users = new ArrayList<>(); 
        bookPlayground= new BookingPlayground();
    }
    /**
      * parameterized constructor to set System name 
      */
    public system(String Name) {
        this.Name=Name;
        playgrounds = new ArrayList<>();
        users = new ArrayList<>(); 
        bookPlayground= new BookingPlayground();
    }
    /**
     * get Name of system 
     * @return Name of system 
     */
    public String getName() {
        return Name;
    }
    /**
     * set Name of system 
     * @param Name of system 
     */
    public void setName(String Name) {
        this.Name = Name;
    }
    
    
    /**
     * sign up new user
     * @return User who sign UP
     */
    public User  signUP(){
        User user=null;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int choose;
        
        while(true)
        {
            System.out.println("Press 1 if Player\n"
                             + "      2 if Playground Owner");
            choose=input.nextInt();
            if(choose==1)
            {
                user=new User();
                
                break;
            }
            else if(choose==2)
            {
                user=new PlaygroundOwner();
                
                break;
            }
            else
            { 
                System.out.println("Please Enter valid input");
            }
        }
       
        System.out.print("Please Enter User's data\n"
                           + "Name : ");
            user.setName(input2.nextLine());
            System.out.print("User Email : ");
            user.setEmail(input2.nextLine());
            System.out.print("User Password : ");
            user.setPassword(input2.nextLine());
            System.out.print("User Phone Number : ");
            user.setPhone(input2.nextLine());
            System.out.print("Address : ");
            user.setDefaultlocation(input2.nextLine());
            user.increamentId();
            users.add(user);
            return user;
           
        
    }
    /**
     * to signIn exist user
     * @param email of user
     * @param password of user
     * @return User who sign In
     */
    public User signIn(String email,String password){
         User user=null;
         int flag=0;
        for(int i=0;i<users.size();i++){
            if(users.get(i).email.equals(email) && users.get(i).password.equals(password) ){
                user=users.get(i);
                System.out.print("successfully signin\n");
                flag=1;
                break;
            }
        }
        if (users.size()==0 || flag==0){System.out.print(" NO Users Found\n");}
        return user;
    }
    
     /**
      * add playground to system 
      * @param playground 
      */
     public void addPlayground(Playground playground){
         playgrounds.add(playground);
         
     }
     /**
      * book Playground
      * @param location 
      */
      public void bookPlayground(String location){
         bookPlayground.Booking(playgrounds,location);
         
     }
     
     
}

