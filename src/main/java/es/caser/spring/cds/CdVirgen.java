package es.caser.spring.cds;

public class CdVirgen implements CompactDisc {

	private String title;
	private String artist;

	public CdVirgen(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
