package Exercises1_9;

public class Textbook {

	private String title;
	private int year;
	private String publisher;
	private int pages;
	
	public Textbook() {
		this.title = "Physics";
		this.year = 2014;
		this.publisher = "H&Co";
		this.pages = 594;
	}

	public Textbook(String title, int year, String publisher, int pages) {
		this.title = title;
		this.year = year;
		this.publisher = publisher;
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String outdated() {
		String upToDate = "";
		if (this.year < 2023) {
			upToDate = this.title + " is outdated";
		}
		if (this.year >= 2023) {
			upToDate = this.title + " is up to date";
		}
		return upToDate;
	}
	
	public String toString() {
		return "This book is " + this.title + ", published by " + this.publisher + 
				", pubished in " + this.year + " with " + this.pages + " pages.";
	}
	
	
	
	
	
}
