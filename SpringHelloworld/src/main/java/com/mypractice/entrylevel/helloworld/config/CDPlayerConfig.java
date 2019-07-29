package com.mypractice.entrylevel.helloworld.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.mypractice.entrylevel.helloworld.beans.soundsystem.CDPlayer;
import com.mypractice.entrylevel.helloworld.beans.soundsystem.CompactDisc;
import com.mypractice.entrylevel.helloworld.beans.soundsystem.MediaPlayer;
import com.mypractice.entrylevel.helloworld.beans.soundsystem.SgtPeppers;

@Configuration
//@ComponentScan("com.mypractice.entrylevel.helloworld.beans.soundsystem")
//@ComponentScan(basePackageClasses = {CompactDisc.class})
public class CDPlayerConfig {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	@Bean
	@Scope()
	public MediaPlayer cdPlayer(CompactDisc cd) {
		return new CDPlayer(cd);
		
	}
	
	
}
