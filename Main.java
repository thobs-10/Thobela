package za.wrpv;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Task2();
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 0; i < num; i++) {
            if (num % i == 0) {
                return false;
            }

        }

        return true;
    }
    public  static void Inserted(int num,ArrayList factors)
    {
        int InsertIndex=factors.size();
        while (InsertIndex!=0 && (int)factors.get(InsertIndex-1)>num)
        {
            InsertIndex--;
            factors.add(InsertIndex,num);
        }
    }
        public static void Task2 ()
        {
            ArrayList numbers = new ArrayList();
            Menu mainMenu = new Menu("Menu:");

            //Clearing numbers to the list
            mainMenu.addChoice(new MenuCommand() {
                public String getText() {
                    return "Clearing numbers";
                }

                public void run() {
                    numbers.clear();
                }
            });
            //displaying numbers
            mainMenu.addChoice(new MenuCommand() {
                @Override
                public String getText() {
                    return "Displaying numbers";
                }

                @Override
                public void run() {
                    if (numbers.isEmpty()) {
                        System.out.println("The list is empty");
                    }
                    for (Object cur : numbers
                    ) {
                        System.out.println("\t" + cur);
                    }
                }
            });
            //Add numbers to the list
            mainMenu.addChoice(new MenuCommand() {
                @Override
                public String getText() {
                    return "Adding numbers to the list";
                }

                @Override
                public void run() {
                    System.out.println("Enter number");
                    try {
                        Scanner in = new Scanner(System.in);
                        int num = in.nextInt();
                        numbers.add(num);
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                }
            });

            //Menu operations

            Menu operations = new Menu("Menu Operations");
            //display prime numbers
            operations.addChoice(new MenuCommand() {
                @Override
                public String getText() {
                    return "Displaying prime numbers";
                }

                @Override
                public void run() {
                    if (numbers.isEmpty()) {
                        System.out.println("the list is empty.");
                    } else {
                        for (Object cur : numbers
                        ) {
                            if (isPrime((int) cur)) {
                                System.out.println(cur);
                            }
                        }
                    }
                }

            });

            //displaying prime factors

            operations.addChoice(new MenuCommand() {
                ArrayList factors = new ArrayList();

                @Override
                public String getText() {
                    return "displaying prime factors";
                }

                @Override
                public void run() {

                    if (numbers.isEmpty()) {
                        System.out.println("the list is empty.");
                    } else {
                        try {


                            System.out.println("enter number");
                            Scanner in = new Scanner(System.in);
                            int num = in.nextInt();
                            for (int i = 0; i < num; i++) {
                                if (num % i == 0) {
                                    Inserted(num,factors);
                                }
                            }
                            String primeNumbers = " ";
                            for (Object cur : factors
                            ) {
                                if (isPrime((int) cur) && numbers.indexOf((int) cur) != -1) {
                                    primeNumbers += " " + factors + ";";
                                }
                            }
                            System.out.println("Prime factors : " + primeNumbers.substring(0, primeNumbers != " " ? primeNumbers.length() - 1 : 0));
                        } catch (Exception e) {
                            System.out.println(e.toString());
                        }

                    }
                }
            });
            mainMenu.addChoice(operations);
            mainMenu.run();

        }

    }
