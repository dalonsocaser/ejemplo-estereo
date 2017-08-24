package es.caser.spring.cds;

import org.springframework.stereotype.Component;

@Component(value="masterOfPuppets")
public class MasterOfPuppets implements CompactDisc {
	private String title = "Master of Puppets";
	private String artist = "Metallica";
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
