package com.mypractice.entrylevel.helloworld;
import static org.mockito.Mockito.*;

import org.junit.Test;

import com.mypractice.entrylevel.helloworld.beans.BraveKnight;
import com.mypractice.entrylevel.helloworld.beans.Quest;

public class BraveKnightTest {
	
	@Test
	public void KnightShouldEmbarkOnQuest() {
		System.out.println("Testing..");
		Quest mockQuest=mock(Quest.class);
		BraveKnight knight=new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest,times(1)).embark();
		
	}
}
