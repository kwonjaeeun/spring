package com.koreait.java;

public class TvTest {

	public static void main(String[] args) {
		Tv tv = new LgTv(new AppleSpeaker(40));
		Tv tv2 = new SamsungTv(new SonySpeaker(30));
		System.out.println(tv);
		System.out.println(tv2);

		for (int i = 0; i < 63; i++) {
			tv.volumeUp();
			System.out.println(tv.getCurrentVolume()+"::");
			
			
		}
	}
}
