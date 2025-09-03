package models;

public class book {
	private int Id;
	private String Title;
	private int AuthorID;
	private int year;
	private int copies;
	public book(int Id,String Title,int AuthorID,int year,int copies){
		this.Id=Id;
		this.Title=Title;
		this.AuthorID=AuthorID;
		this.year=year;
		this.copies=copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	public int getId() {
		return Id;
	}
	public String getTitle() {
		return Title;
	}
	public int getAuthorID() {
		return AuthorID;
	}
	public int getYear() {
		return year;
	}
	public int getCopies() {
		return copies;
	}
	@Override
	public String toString() {
		return Id+";"+Title+"("+year+")copies"+copies;
	}

}
