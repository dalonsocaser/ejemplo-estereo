package es.caser.spring.cds;

import java.util.List;

public class CdVirgen implements CompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;
	public CdVirgen(String title, String artist,List<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		for (String track : tracks) {
			System.out.println("-Track: " + track);
		}
	}

}
