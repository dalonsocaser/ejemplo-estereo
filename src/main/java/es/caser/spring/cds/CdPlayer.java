package es.caser.spring.cds;

import es.caser.spring.media.MediaPlayer;

public class CdPlayer implements MediaPlayer {
	
	private CompactDisc cd;
	public void play() {
		cd.play();
	}
	
	public CdPlayer() {
		super();
		
	}

	public CompactDisc getCd() {
		return cd;
	}
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	
}
