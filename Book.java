/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbook;

/**
 *
 * @author Ahsan Ullah
 */
public class Book {
    private String booktittle;
    private double bookprice;
    private int bookpages;
    
    public void setbooktittle(String m)
    {
        this.booktittle = m;
    }
    public void setbookprice(double m)
    {
        this.bookprice = m;
    }
    public void setbookpages(int m)
    {
        this.bookpages = m;
    }
    public String gettittle()
    {
        return this.booktittle;
    }
    public void BookInformation()
    {
        System.out.println("=================================================");
        System.out.println("                  Book Inforamtion               ");
        System.out.println("=================================================");
        System.out.printf("Book Tittle  %s\n",this.booktittle);
        System.out.printf("Book Price   %f\n",this.bookprice);
        System.out.printf("Book Pages   %d\n",this.bookpages);
         
    }
    
}
