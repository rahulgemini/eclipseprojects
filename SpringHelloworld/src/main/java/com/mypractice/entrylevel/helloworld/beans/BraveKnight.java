package com.mypractice.entrylevel.helloworld.beans;

public class BraveKnight implements Knight{

	Quest quest;
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}
	public void embarkOnQuest() {
		// TODO Auto-generated method stub
		quest.embark();
		
	}

}
