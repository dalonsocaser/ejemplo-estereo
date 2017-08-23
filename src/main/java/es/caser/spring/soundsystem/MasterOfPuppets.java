package es.caser.spring.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class MasterOfPuppets implements CompactDisc {
	private String title = "Master of Puppets";
	private String artist = "Metallica";
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
