public class Book {
	private String title;
	private String author;
	private int copies;

	public Book(String title, String author, int copies) {
			this.title = title;
			this.author = author;
			this.copies = copies;
	}

	public String getTitle() {
			return title;
	}

	public String getAuthor() {
			return author;
	}

	public int getCopies() {
			return copies;
	}

	public void setCopies(int copies) {
			this.copies = copies;
	}

	@Override
	public String toString() {
			return "Book{" +
							"title='" + title + '\'' +
							", author='" + author + '\'' +
							", copies=" + copies +
							'}';
	}
}