package com.spring.first;

public class MiTv {
	private Speaker speaker;
	public MiTv() {
		System.out.println("mitv 기본생성자");
	}
	public MiTv(Speaker speaker) {
		System.out.println("mitv speaker 생성자");
		this.speaker=speaker;
	}
	public void volumeUp() {
		if(speaker!=null) {			
			speaker.volumeUp();
		}
	}
	public Speaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
}
