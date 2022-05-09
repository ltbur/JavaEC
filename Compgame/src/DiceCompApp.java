import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class DiceCompApp {

	public static void main(String[] args) {
		Map<Integer,Integer>map = new TreeMap<>();
		int maxThrowCount = 0;
		for(int i = 0; i < 500; i++) {
			int diceThrowCount = diceCompCount();
			if(diceThrowCount > maxThrowCount) {
				maxThrowCount = diceThrowCount;

			}
			int count;
			if(map.containsKey(diceThrowCount)) {
				count = map.get(diceThrowCount)+1;

			}else {
				count = 1;
			}
			map.put(diceThrowCount, count);
		}
		System.out.println("***************************結果*****************************");
		for(int i = 1; i <= maxThrowCount; i++) {
			System.out.printf("%d(%d):%s%n",i,300*i,map.containsKey(i) ? createStar(map.get(i)):"");
		}
		System.out.printf("コンプ平均値:%d円%n",calcAvg(map));
		System.out.printf("モード(最頻値):%d回(%d円)%n",calcMode(map),calcMode(map)*300);
	}
	static int diceCompCount() {
		int count = 0;
		Random rand = new Random();
		Set<Integer> set = new HashSet<>();
		while(set.size()<6) {
			count++;
			int dice = rand.nextInt(6)+1;
			set.add(dice);

		}
		return count;
	}
	static String createStar(int count) {
		String star = "";
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < count; i++) {
			sb.append("*");
		}
		star = sb.toString();
		return star;
	}
	static int calcAvg(Map<Integer,Integer> map) {
		int avg = 0;
		int totalCount = 0;
		int sum = 0;
		for(int compCount : map.keySet()) {
			totalCount += map.get(compCount);
			sum += compCount * 300 * map.get(compCount);
		}
		avg = sum / totalCount;
		return avg;
	}
	static int calcMode(Map<Integer,Integer> map) {
		int mode = 0;
		int modeValue = 0;
		for(int compCount : map.keySet()) {
			if(modeValue < map.get(compCount)) {
				modeValue = map.get(compCount);
				mode = compCount;
			}
		}
		return mode;
	}
}
