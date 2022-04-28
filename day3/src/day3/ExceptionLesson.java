package day3;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionLesson {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					;
				}
			}
		}
		try(FileWriter fw2 = new FileWriter("data.txt");){
			fw2.write("hello2");
		}catch(Exception e) {
			System.out.println("何らかの例外が発生");
		}

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}



		try{
			String s = null;
			System.out.println(s.length());
		}catch(NullPointerException e){
			System.out.println("例外が発生");
			System.out.println("スタックトレース");
			e.printStackTrace();
			System.out.println("スタックトレース");
		}

		try {
			int i = Integer.parseInt("三");
			}catch(NumberFormatException e) {
				System.out.println("例外が発生");
			}



	}
	static void sleep() throws InterruptedException {
		Thread.sleep(3000);

	}
}