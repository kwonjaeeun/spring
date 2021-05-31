package com.koreait.spring;

import com.koreait.java.AppleSpeaker;
import com.koreait.java.LgTv;
import com.koreait.java.SamsungTv;
import com.koreait.java.SonySpeaker;
import com.koreait.java.Speaker;
import com.koreait.java.Tv;

public class SpringTvTest {

	public static void main(String[] args) {
		Speaker s=SpeakerFactory.ChoiceSpeaker(args[0]);
		Speaker s2=SpeakerFactory.ChoiceSpeaker(args[1]);
		System.out.println(s.getBrand());
		System.out.println(s2.getBrand());
		Tv tv = new LgTv(s);
		Tv tv2 = new SamsungTv(s2);
		System.out.println(tv);
		System.out.println(tv2);

		for (int i = 0; i < 53; i++) {
			tv.volumeUp();
			tv2.volumeUp();
			System.out.println(tv.getCurrentVolume()+"::"+tv2.getCurrentVolume());
			
			
		}
	}

}
