package za.wrpv;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu implements  MenuCommand{

    private String title;
    private ArrayList<MenuCommand> choices= new ArrayList<>();
    Boolean running;

    public Menu(String T)
    {
        title=T;
    }

    public String getText()
    {
        return title;
    }
    public void run()
    {
        running=true;
        while (running)
        {
            System.out.println(title+" : ");
            displayChoices();
            System.out.println(">");


            try {
                Scanner in = new Scanner(System.in);
                int choice= in.nextInt();
                if(choice>=1 && (choice> obtainChoice()+1))
                {
                    processChoice(choice);
                }
                else {
                    System.out.println(in);
                    System.out.println("Invalid choice");
                }
            }catch (Exception e){
                System.out.println(e.toString());
            }
        }
    }
     public void addChoice(MenuCommand choice)
     {
         choices.add(choice);
     }
     protected int obtainChoice()
     {
         return choices.size();
     }
     protected  void displayChoices()
     {
         for (int i = 0; i <= obtainChoice(); i++)
         {
             System.out.println(String.format("%s" + choices.get(i).getText() + (choices.get(i) instanceof Menu ? " (submenu) " : ""),i+1 ));
             System.out.println(String.format("%s. Exit",obtainChoice()+1));
         }
     }
     protected void processChoice(int choice)
     {
         if(choice>=1 && choice<=obtainChoice()+1)
         {
             if(choice==obtainChoice()+1)
             {
                 running=false;
             }
             choices.get(choice-1).run();
         }

     }
}
