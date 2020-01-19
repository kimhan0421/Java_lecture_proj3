package chap4;


public class Song {
	private String title;
	private String artist;
	private int year;
	
	public Song() {};
	
	public Song(String title, String artist, int year) {
		this.title = title;
		this.artist = artist;
		this.year = year;
	}
	
	public String getTitle() {
		return title;
		}
	
	public void setTitle(String title) {
		this.title = title;
		}
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", year=" + year + "]";
	}

	

	public static void main(String[] args) {
		Song s01 = new Song();
		Song s02 = new Song("Little Star", "스탠딩 에그",2011);
		
		s01.setTitle("선인장");
		s01.setArtist("에피톤프로젝트");
		s01.setYear(2010);
		
		System.out.println(s01.toString());
		System.out.println(s02.toString());

	}

}
