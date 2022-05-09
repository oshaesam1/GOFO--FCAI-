/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass4_code;

import java.util.Scanner;

/**
 *
 * @author Hoda
 */
public class ASS4_code {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choose ;
        system obj= new system() ;
        System.out.println("Please Enter System Name ");
        obj.setName(input.nextLine());
        while(true)
        {
            System.out.println("Enter 1 if Sign Up\n"
                         + "      2 if Sign In\n"
                         + "      3 end");
        choose=input.nextLine();
        User user1 ;
        if("1".equals(choose)){
            
            user1=obj.signUP();
           // System.out.println("---test---");
            //System.out.print(user1.getEmail());
            if(user1 instanceof PlaygroundOwner)
            {
                //System.out.println("---test---");
                System.out.println("Enter 1 Register Playground\n"
                                 + "      2 Check My Playground");
                Scanner inp = new Scanner(System.in);
                 String ch =inp.nextLine();
                 Playground temp=new Playground();
                if("1".equals(ch))
                {
                    System.out.print("Enter information to Register Playground \n ");
                    //((PlaygroundOwner) user1).registerPlayground(); 
                    temp=((PlaygroundOwner) user1).registerPlayground(); 
                    obj.addPlayground(temp);
                }
                else if("2".equals(ch))
                {
                    ((PlaygroundOwner) user1).checkPlaygrounds(); 
                }
                else System.out.println("invalid number"); 
                
                
                
            }
            else if(user1 instanceof User)
            {   
                System.out.print("Enter playground Location ");
                Scanner inp = new Scanner(System.in);
                String ch =inp.nextLine();
                System.out.println("loc "+ch);
                obj.bookPlayground(ch);
            }
         }

        else if ("2".equals(choose)){
            String email,password ;
            System.out.println("Enter Email :");
            email=input.nextLine();
            System.out.println("Enter Password :");
            password=input.nextLine();
            user1=obj.signIn(email, password);
            
             if(user1 instanceof PlaygroundOwner)
            {
                //System.out.println("---test---");
                System.out.println("Enter 1 Register Playground\n"
                                 + "      2 Check My Playground");
                Scanner inp = new Scanner(System.in);
                 String ch =inp.nextLine();
                 Playground temp=new Playground();
                if("1".equals(ch))
                {
                    System.out.print("Enter information to Register Playground \n ");
                    temp=((PlaygroundOwner) user1).registerPlayground(); 
                    obj.addPlayground(temp);
                }
                else if("2".equals(ch))
                {
                    ((PlaygroundOwner) user1).checkPlaygrounds(); 
                }
                else System.out.println("invalid number"); 
                
                
                
            }
             else if(user1 instanceof User)
            {   
                System.out.print("Enter playground Location ");
                Scanner inp = new Scanner(System.in);
                String ch =inp.nextLine();
                obj.bookPlayground(ch);
            }
        }
        else if("3".equals(choose))
        {
           break;
        }
           
        else     System.out.println("invalid number");   
    }
 }
}
        
    

