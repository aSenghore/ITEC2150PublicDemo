package Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Movie implements Comparable<Movie> {
	
	private double rating;
	private String name;
	private int year;
	
	
	public Movie(double rating, String name, int year) {
		this.rating = rating;
		this.name = name;
		this.year = year;
	};
	
	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int compareTo(Movie m) {
		return(this.year > m.year? 1: (this.year < m.year? -1:0));
	}
	
	public String toString() {
		return "\nMovie Title: " + this.name + "\nRating: " + this.rating 
				+ "\nReleasedYear: " + this.year;
	}
	
	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		//Rush Hour, 10, 1998
		//Madame Webb, 1, 2024
		//Lion King, 7, 1994
		list.add(new Movie(10, "Rush Hour", 1998));
		list.add(new Movie(1, "Madame Web", 2024));
		list.add(new Movie(7, "Lion King", 1994));
		
		Collections.sort(list);
		
		System.out.println(list);
		
		System.out.println("///sorting by rating////");
		RatingCompare rc = new RatingCompare();
		Collections.sort(list,rc);
		System.out.println(list);
		
		System.out.println("///sorting by movie title////");
		NameCompare nc = new NameCompare();
		Collections.sort(list,nc);
		System.out.println(list);
	}
}


class RatingCompare implements Comparator<Movie> {
	public int compare(Movie m1, Movie m2) {
		return m1.getRating() > m2.getRating()? -1: (m1.getRating() > m2.getRating()? -1:0);
	}
}

class NameCompare implements Comparator<Movie>{
	public int compare(Movie m1, Movie m2) {
		//compareToIgnoreCase
		return m1.getName().compareToIgnoreCase(m2.getName());
	}
}
