package day1;

import java.util.HashMap;
import java.util.Map;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("World");

		Map<String,Integer> prefs = new HashMap<String,Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は、"+ tokyo);
				prefs.put("京都府", 255);
				System.out.println(prefs);
	}

}
