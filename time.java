/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testtime;

import java.util.Scanner;

/**
 *
 * @author Ahsan Ullah
 */
public class time {
    private int hrs;
    private int mins;
    private int secs;
    Scanner input = new Scanner(System.in);
    
    public void userInput()
    {
        
        System.out.println("Enter Hours : ");
        this.sethrs(input.nextInt());
        System.out.println("Enter Minutes : ");
        this.setMins(input.nextInt());
        System.out.println("Enter Seconds : ");
        this.setSec(input.nextInt());
        
        
    }
    
    public void sethrs(int h)
    {
        if(h>=0 && h<=23)
        {
        this.hrs = h;
        }
        else 
        {
            System.out.println("Invalid Hours");
            this.hrs = 0;
        }
    }
    public void setMins(int m)
    {
        if(m>=0 && m<=59)
        {
            this.mins = m;
        }
        else 
        {
            System.out.println("Invalid Minutes");
            this.mins = 0;
        }
    }
    public void setSec(int s)
    {
        if(s>=0 && s<=59)
        {
            this.secs = s;
        }
        else 
        {
            System.out.println("Invalid seconds");
            this.secs = 0;
        }
    }
        public int getMin()
        {
            return this.mins;
        }
        public int getSec()
        {
            return this.secs;
        }
        public int getHrs()
        {
            return this.hrs;
        }
        public void printTime()
        {
            System.out.println("========================================");
            System.out.printf("Hours        :       %02d\n",this.getHrs());
            System.out.printf("Minutes      :       %02d\n",this.getMin());
            System.out.printf("Seconds      :       %02d\n",this.getSec());
        }
        public time(int h , int m , int s)
        {
//            this.hrs = h;
//            this.mins = m;
//            this.secs = s;
            this.sethrs(h);
            this.setMins(m);
            this.setSec(s);
        }
        public time()
        {
            
        }
        public time(int h)
        {
//          this.hrs = h; 
            this(h,0,0);
        }
        public time(int h , int m)
        {
//         this.hrs = h;
//         this.mins = m;
           this(h,m,0);
        }
         
    }
    
    

