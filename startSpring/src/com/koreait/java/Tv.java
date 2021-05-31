package com.koreait.java;

public abstract class Tv {
	
	private int inch;
	private int maxChannel;
	private int maxVolume;
	private int currentChannel=1;
	private int currentVolume;
	private String brand;
	private Speaker speaker;
	

	public Tv(String brand,Speaker speaker, int inch, int maxChannel, int maxVolume) {
		super();
		this.brand = brand;
		this.speaker = speaker;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getInch() {
		return inch;
	}

	public int getMaxChannel() {
		return maxChannel;
	}

	public int getMaxVolume() {
		return maxVolume;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public void setCurrentChannel(int currentChannel) {
		this.currentChannel = currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}

	public Speaker getSpeaker() {
		return speaker;
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public void channelUp() {
		currentChannel++;
		if(currentChannel>maxChannel) {
			currentChannel-=maxChannel;
		}
	}
	public void channelDown() {
		currentChannel--;
		if(currentChannel<1) {
			currentChannel=maxChannel;
		}
	}

	public void volumeUp() {
		if(currentVolume<maxVolume) {
			currentVolume++;
			speaker.volumeUp();
		}
	}

	public void volumeDown() {
		if(currentVolume>0) {
			currentVolume--;
			speaker.volumeDown();
		}
	}

	@Override
	public String toString() {
		return String.format("%s %d인치, %d채널, %d볼륨", getBrand(), getInch(), getMaxChannel(), getMaxVolume());
	}

}
