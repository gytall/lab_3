public class LibraryTest {
	public static void main(String[] args) {
			Library library = new Library();

			// Создание книг
			Book book1 = new Book("1984", "George Orwell", 5);
			Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 3);

			// Добавление книг в библиотеку
			library.addBook("9780451524935", book1);
			library.addBook("9780060935467", book2);

			// Проверка количества книг
			System.out.println("Количество книг в библиотеке: " + library.getSize()); // 2

			// Поиск книги
			Book foundBook = library.getBook("9780451524935");
			System.out.println("Найдена книга: " + foundBook);

			// Удаление книги
			library.removeBook("9780060935467");
			System.out.println("Количество книг после удаления: " + library.getSize()); // 1

			// Проверка, пуста ли библиотека
			System.out.println("Библиотека пуста? " + library.isEmpty()); // false
	}
}