
/**
 * 
 * @author >>RanaSiroosian<<
 *
 */
public class Movie implements Comparable<Movie> {
	
	public String title; 
	public String category; 
	
	
	public Movie(String title, String category) {
		this.title = title;

		this.category = category;
	}
	public int compareTo(Movie m) {

		int compare;
		compare = title.compareTo(m.getTitle());
		return compare;
	}
	public String getCategory() {
		return category;
	}
	public String getTitle() {
		return title;
	}
	public String toString() {
		return "Movie [title= " + title + ", category= " + category + "]";
	}
}
