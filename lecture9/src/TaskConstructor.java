
public class TaskConstructor {

	/**
	 Create a class Book, which:
◦ has fields: author, pages, title.
◦ has constructor which defines all fields
◦ has constructor which allows to define title, but author and pages are set to
default
◦ has constructor which reuses another one 
	 */
	
	class Book{
		private String author;
		private int pages;
		private String title;
		
		public Book(String author,int pages,String title){
			this.author=author;
			this.pages=pages;
			this.title=title;
			System.out.println("The book I have read: ");
		}
		
		public Book(String title){
			this("John",100,title);
		}
		public String getAuthor() {
			return author;
		}	
		public void setAuthor(String author) {
			this.author=author;
		}
		
		public int getPages() {
			return pages;
		}	
		public void setPages(int pages) {
			this.pages = pages;
		}
		public String getTitle() {
			return author;
		}	
		public void setTitle(String title) {
			this.title=title;
		}
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
