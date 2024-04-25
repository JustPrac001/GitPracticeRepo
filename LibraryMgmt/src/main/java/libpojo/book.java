package libpojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String bookname;
	int bookamount;
	String authorname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getBookamount() {
		return bookamount;
	}
	public void setBookamount(int bookamount) {
		this.bookamount = bookamount;
	}
	public String getAuthor() {
		return authorname;
	}
	public void setAuthor(String authorname) {
		this.authorname = authorname;
	}
	
	

}
