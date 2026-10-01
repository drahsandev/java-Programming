/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testaccount;

/**
 *
 * @author Ahsan Ullah
 */
public class Account {
    private long accNO;
    private double accBal;
    private boolean accStatus;
    
    public void setAccNo(long m)
    {
        this.accNO = m;
    }
    public void setAccBal(double m)
    {
        this.accBal = m;
    }
    public void setAccStatus(boolean m)
    {
        this.accStatus = m;
    }
    public void deposit(double amt)
    {
        accBal = accBal + amt;
    }
    public void withdraw(double amt)
    {
        accBal = accBal - amt;
    }
    public void accInformation()
    {
        System.out.printf("Account No       :     %d\n",this.accNO);
        System.out.printf("Account Balance  :     %f\n",this.accBal);
        System.out.printf("Account Status   :     %b\n",this.accStatus);
    }
}
