/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testbook;

/**
 *
 * @author Ahsan Ullah
 */
public class TestBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Book b1 = new Book();
    Book b2 = new Book();
    Book b3 = new Book();
    b1.setbooktittle("Programming Fundamental");
    b1.setbookprice(235.5);
    b1.setbookpages(200);
    b1.BookInformation();
    
    b2.setbooktittle("OOP IN Java");
    b2.setbookprice(565.5);
    b2.setbookpages(250);
    b2.BookInformation();
    
    b3.setbooktittle("DSA");
    b3.setbookprice(435.5);
    b3.setbookpages(500);
    b3.BookInformation();
        // TODO code application logic here
    }
    
}
