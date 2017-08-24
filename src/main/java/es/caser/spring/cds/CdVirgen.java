package es.caser.spring.cds;

import java.util.List;

public class CdVirgen implements CompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;
	public CdVirgen(String title, String artist,List<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks=tracks;
	}

	
	public CdVirgen() {
		super();
		// TODO Auto-generated constructor stub
	}


	public List<String> getTracks() {
		return tracks;
	}


	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
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


	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
