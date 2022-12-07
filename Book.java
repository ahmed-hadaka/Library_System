package projects.librarySystem;

public class Book {
	int quantity;
	int id;
	String name;
	String[] Who_Borrowed_me;
	int length;

	public Book() {
		name = "";
		length = 0;
	}

	public Book(String name, int id, int quantity) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		Who_Borrowed_me = new String[quantity];
		for (int i = 0; i < quantity; i++) {
			Who_Borrowed_me[i] = "";
		}
	}

	boolean isMatch(String pattern) {
		for (int i = 0; i < pattern.length(); i++)
			if (name.charAt(i) != pattern.charAt(i))
				return false;
		return true;
	}

	void show_who_borrowed_you() {
		for (int i = 0; i < length; i++) {
			System.out.println(Who_Borrowed_me[i]);
		}
	}

	void add_to_borrow_me(String userName) {
		Who_Borrowed_me[length++] = userName;
		quantity--;
	}

	void removeUser(String userName) {
		int i = 0;
		for (; i < length; i++) {
			if (Who_Borrowed_me[i] == userName)
				break;
		}
		for (int j = i; j < length - 1; j++) { // shifting
			Who_Borrowed_me[j] = Who_Borrowed_me[j + 1];
		}
		length--;
		quantity++;
	}
}
