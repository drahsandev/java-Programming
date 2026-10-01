/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testtime;

 
public class TestTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        time t = new time();
        t.printTime();
        time t1 = new time(21);
        t1.printTime();
        time t2 = new time(22,45);
        t2.printTime();
        time t3 = new time(24,45,59);
        t3.printTime();
          time t4 = new time();
          t4.userInput();
          t4.printTime();
       // t.sethrs(23);
        //t.setMins(56);
        //t.setSec(50);
        /*System.out.printf("Hours        :       %d\n",t.getHrs());
        System.out.printf("Minutes      :       %d\n",t.getMin());
        System.out.printf("Seconds      :       %d\n",t.getSec());*/
         
        
    }
    
}
