package com.mypractice.entrylevel.helloworld;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mypractice.entrylevel.helloworld.beans.soundsystem.CompactDisc;
import com.mypractice.entrylevel.helloworld.beans.soundsystem.MediaPlayer;
import com.mypractice.entrylevel.helloworld.config.CDPlayerConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
	
	@Autowired
	public CompactDisc cd;
	@Autowired
	public MediaPlayer cdPlayer;
	
	@Test
	public void cdshouldNotBeNull() {
		System.out.println("cd: "+cd);
		assertNotNull(cd);
	}
	
	@Test
	public void PlayershouldHaveCD() {
		System.out.println("playing cd..");
		cdPlayer.play();
	}
}
