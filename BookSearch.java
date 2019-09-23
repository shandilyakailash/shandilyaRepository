/*2. find number of books in a bookstore using program
 clue String books="Shakespear,sherlockHolmes,LOTR,amazingBook";..answer here will be 4
stretch goal:   Create a interactive program to search a book in books library.If present then answer saying "Your book is available"*/
package HomeWork;

import java.util.Scanner;

public class BookSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		  Scanner scan = new Scanner(System.in);
		  //String books="shakespear,LOTR,Startkkdk";
		  //System.out.println(books.split(",").length);
		    System.out.println("How many Books would you like to enter?");
		    int n = scan.nextInt();
		    System.out.println("Enter the " + n + "Book names: ");

		    String [] bookName = new String[n];
		 
		    for (int i = 0; i < n ; i++)
		    {
		         bookName[i] = scan.next();
		     }
		    System.out.println("You have enter "+bookName.length+" Books.\n They are:-");
		    
		    for (int i=0; i < bookName.length; i++)
		    {
		        
		    	System.out.println(bookName[i]);
		    }  
		    System.out.println("Enter book name you want to search");
		    String search = scan.next();
		    for (int i=0; i < bookName.length; i++)
		    {
		    	//if(books.contains(Search)
		        if(bookName[i].equalsIgnoreCase(search))
		        {
		        	System.out.println("You have "+bookName[i]+" book");
		        }
		        else
		        {
		        	System.out.println("Sorry no book available for this name.");
		        }
		    } 
	}

}
