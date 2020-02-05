import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/**
 * 
 * @author >>RanaSiroosian<<
 *
 */
public class MovieLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner (System.in);
		
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("**************************************");
		System.out.println("There are 100 of movies in this list.");
		System.out.println("**************************************");

		System.out.println();
		boolean loop = false;
		int menuOption;
		String category;
		String yesOrNo ="";

		ArrayList<Movie> movies = new ArrayList<>();
		for (int i =1; i<=100; i++) {
			movies.add(MovieIO.getMovie(i));
		}
		movies.sort(null);

		do {
			menuOption = Validator.getInt(scnr, "What category are you interested in?\n\n1- Drama\n2- Musical\n"
					+ "3- Animated\n4- Comedy\n5- Horror\n6- Scifi\n", 1, 6);
			System.out.println();
			category =getCategory(menuOption);
//			System.out.println(category);
			category=category.toLowerCase();
			for (Movie movie : movies) {
				if(category.equals(movie.getCategory())) {
					System.out.println(movie);}
			}
			System.out.println();
			System.out.println("Would you like to continue? (enter \"y\" or \"n\").");
			yesOrNo = scnr.nextLine();
			if(yesOrNo.equalsIgnoreCase("y")) 
				loop = true;

		}while(loop);
	
		System.out.println("Thank you, Goodbye.");
		scnr.close();
		
	}
	
	public static TreeMap<Integer,String> movieMenu(){
		TreeMap<Integer,String> menu = new TreeMap<>(Map.of(1,"Drama",2,"Musical",3,
				"Animated",4,"Comedy",5,"Horror",6,"Scifi"));
		
		return menu;
	}
	
	public static String getCategory(int option) {
		TreeMap<Integer,String> menu = movieMenu(); 
		return menu.get(option);
	}
	
	public static void printMovies() {
		TreeMap<Integer,String> menu = movieMenu();
		for (Integer category1 : menu.keySet()) {
			System.out.println(category1 + "  " +menu.get(category1));
		}
	}
}
		

