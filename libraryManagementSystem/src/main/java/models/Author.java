public class Author {
	private int id;
	private String name;
	private String biography;
	private String nationality;
	
	public Author(int id,String name,String biography,String nationality) {
	   this.id = id;
	   this.name = name;
	   this.biography = biography;
	   this.nationality = nationality;
	}
	
	public int getID() {return id; }
	public void setID(int id) { this.id = id; }
	
	public String getName() { return name; }
	public void setName(String name) {this.name = name; }
	
	public String getBiography() { return name; }
	public void setBiography(String biography) { this.biography = biography; }
	
	public String getNationality() { return nationality; }
	public void setNationality(String nationality) {this.nationality = nationality; }
	
	@Override
	public String toString() {
		return "Author ID: " + id + ",Name: " + name +", Nationality: "+ nationality +", Bio: "+ biography;
	}
}
		