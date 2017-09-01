package es.caser.spring.soundsystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import es.caser.spring.cds.CDPlayerConfig;
import es.caser.spring.cds.CompactDisc;
import es.caser.spring.cds.annotation.Metal;
import es.caser.spring.cds.annotation.Rock;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	@Autowired
	@Rock
	@Metal	
	private CompactDisc cd;
	@Autowired
	@Qualifier("enriqueIglesiasCd")
	private CompactDisc otroCd;
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);		
	}
	@Test
	public void should_play_whenCalled() {
		assertNotNull(cd);
		cd.play();
	}
	@Test
	public void cdEnriqueShouldNotBeNull() {
		assertNotNull(otroCd);		
	}
	@Test
	public void should_playEnrique_whenCalled() {
		assertNotNull(otroCd);
		otroCd.play();
	}
}
