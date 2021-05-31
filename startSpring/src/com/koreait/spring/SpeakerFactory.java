package com.koreait.spring;

import com.koreait.java.AppleSpeaker;
import com.koreait.java.SonySpeaker;
import com.koreait.java.Speaker;

public class SpeakerFactory {
	
	public static Speaker ChoiceSpeaker(String brand) {
		switch(brand){
		case "apple":
			return new AppleSpeaker(30);
		case "sony":
			return new SonySpeaker(40);
		}
		return null;
	}
	
}
