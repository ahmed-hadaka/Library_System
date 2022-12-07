package projects.librarySystem;

public class User {

	final int MAX_BORROWED_BOOKS = 7 * 10;
	int id;
	String name;
	int[] borrowed_books;
	int borrowed_books_length;

	public User() {
		id = 0;
		name = "";
		borrowed_books = new int[MAX_BORROWED_BOOKS];
		borrowed_books_length = 0;
	}

	public User(String name, int id) {
		borrowed_books = new int[MAX_BORROWED_BOOKS];
		this.id = id;
		this.name = name;
	}

	void borrow_book(int bookId) {
		borrowed_books[borrowed_books_length++] = bookId;
	}

	void removeBook(int bookId) {
		int i = 0;
		for (; i < borrowed_books_length; i++) {
			if (borrowed_books[i] == bookId)
				break;
		}
		for (int j = i; j < borrowed_books_length - 1; j++) {
			borrowed_books[j] = borrowed_books[j + 1];
		}
		borrowed_books_length--;
	}

	void print_user_books() {
		for (int i = 0; i < borrowed_books_length; i++) {
			System.out.println(borrowed_books[i] + " ");
		}
	}

}
