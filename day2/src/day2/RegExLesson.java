package day2;

public class RegExLesson {
	public static void main(String[] args) {
		String s = "Java";
		if(s.matches("Java")) {
			System.out.println("Match!");
		}
		if(s.matches("J.va")) {
			System.out.println("Match!");
		}
		if("Jaaaaaaaava".matches("Jai*va")) {
			System.out.println("Match!");
		}
		if("ãããxx019".matches(".*")) {
			System.out.println("Match!");
		}
		if("url".matches("[a-z]{3}")) {
			System.out.println("Match!");
		}
		s = "abc,def:ghi";
		String[] words = s.split("[,:]");
		for(String w:words) {
			System.out.print(w + "->");
		}
		String w = s.replaceAll("[beh]", "X");
		System.out.println(w);//aXc,dXf,gXi
		Method(3,5,7,9);
		Method();
		int sum = sumOf(3,6,8);
		System.out.println(sum);
		sum = sumOf(1,4,5,6);
	}


	public static void Method(int...args) {
		for(int i : args) {
		System.out.println(i);
		}
	}


	public static int sumOf(int...nums) {
		int sum = 0;
		for(int i : nums) {
			sum += i;
		}
		return sum;
	}

}
