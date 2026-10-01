/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testaccount;
import java.util.Scanner;

/**
 *
 * @author Ahsan Ullah
 */
public class TestAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setAccBal(50.0);
        a1.setAccNo(334156552);
        a1.setAccStatus(true);
        System.out.println("Welcome");
        Scanner input= new Scanner(System.in);
        int option;
        while(true)
        {
                System.out.println("1) Deposit Money\n2) Withdraw Money\n3) Account Information\n4) Exit\n   Enter your choice : ");
            option = input.nextInt();
            if (option == 1)
            {
                double amount;
                System.out.println("Enter Amount : ");
                amount = input.nextInt();
                a1.deposit(amount);
            }
            else if (option == 3)
            {
                a1.accInformation();
            }
            else if (option == 2)
            {
                double amount;
                System.out.println("Enter Amount : ");
                amount = input.nextDouble();

                a1.withdraw(amount);
            }
            else if (option == 4)
            {
                break;
            }
        }
        
        // TODO code application logic here
    }
    
}
