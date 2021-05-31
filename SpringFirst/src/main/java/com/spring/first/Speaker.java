package com.spring.first;

public class Speaker {
	private String brand;
	private int maxVolume;
	private int currentVolume;
	
	
	public Speaker(String brand,int maxVolume) {
		super();
		this.brand=brand;
		this.maxVolume = maxVolume;
		System.out.printf("----%s 스피커 생성--\n",this.brand);
	}

	public String getBrand() {
		return brand;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	public int getMaxVolume() {
		return maxVolume;
	}
	
	public void volumeUp() {
		if(currentVolume<maxVolume) {
			currentVolume++;		
		}
		System.out.printf("%s -speaker: %d\n",brand,currentVolume);
	}
	public void volumeDown() {
		if(currentVolume>0) {
			currentVolume--;		
		}
		System.out.printf("%s -speaker: %d\n",brand,currentVolume);
	}

}
