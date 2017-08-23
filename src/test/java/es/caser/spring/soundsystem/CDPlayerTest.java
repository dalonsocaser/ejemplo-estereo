package es.caser.spring.soundsystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import es.caser.spring.cds.CDPlayerConfig;
import es.caser.spring.cds.CdPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	@Autowired
	private CdPlayer cd;
	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);		
	}
	@Test
	public void should_play_whenCalled() {
		assertNotNull(cd);
		cd.play();
	}
}
