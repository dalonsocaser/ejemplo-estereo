package es.caser.spring.cds;

import org.springframework.stereotype.Component;

import es.caser.spring.cds.annotation.Metal;
import es.caser.spring.cds.annotation.Rock;

@Component
@Metal
@Rock
public class MasterOfPuppets implements CompactDisc {
	private String title = "Master of Puppets";
	private String artist = "Metallica";
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
