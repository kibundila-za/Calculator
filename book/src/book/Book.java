/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book;

/**
 *
 * @author PASSW
 */
public class Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        bookClass unknownbookClass = new bookClass("Alice in wonderland ", "kely kely");
        bookClass bookClass1 = new bookClass("fill in the void");
        bookClass bookClass2 = new bookClass("Alice in wonderland ", "kely kely");
        bookClass fullbookClass = new bookClass("life ", "john c", 2025);

        unknownbookClass.displayInfo();
        bookClass1.displayInfo();
        bookClass2.displayInfo();
        fullbookClass.displayInfo();

    }

}
