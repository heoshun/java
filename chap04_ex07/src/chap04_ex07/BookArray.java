package chap04_ex07;

import java.util.Scanner;

public class BookArray {

	private static Scanner Scanner;

	public static void main(String[] args) {

		Book[] book = new Book[2];
		
		Scanner = new Scanner(System.in);
		
		for (int i = 0; i < book.length; i++) { // Quiz : book.length = 2

			System.out.print("�����Է�>>");

			String title = Scanner.nextLine();

			System.out.print("�����Է�");

			String author = Scanner.nextLine();

			book[i] = new Book(title, author);
	}
			for (int i = 0; i < book.length; i++)

				System.out.print(book[i].title + book[i].author);


	}

}
