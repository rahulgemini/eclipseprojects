package com.mypractice.entrylevel.helloworld.beans.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	
	private CompactDisc cd;
	
	public CDPlayer(CompactDisc cd) {
		this.cd=cd;
	}

	public void play() {
		System.out.println(cd);
		cd.play();
	}
	
	public CompactDisc getCD() {
		return cd;
	}

}
