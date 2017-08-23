package es.caser.spring.cds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.caser.spring.media.MediaPlayer;
@Component
public class CdPlayer implements MediaPlayer {
	
	private CompactDisc cd;
	public void play() {
		cd.play();
	}
	
	public CdPlayer(@Autowired CompactDisc cd) {
		super();
		this.cd = cd;
	}

	public CompactDisc getCd() {
		return cd;
	}
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	
}
