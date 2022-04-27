package day2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;

public class HighScoreGame {

	public static void main(String[] args) {
		final String FILE = "score.csv";
		final int MAX = 100000;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		boolean isHighScore = false;
		System.out.println("****乱数ゲーム****");
		HighScore hs = readFile(FILE);
		int highScore;
		if(hs == null) {
			System.out.println("HighScore 0");
			highScore = 0;

		}else {
			System.out.println("HighScore " + hs);
			highScore = hs.getScore();
		}
		while(true) {
			System.out.print("やりますかyes...y no...n>");
			String select = scan.next();
			if(select.equals("n")) {
				System.out.print("アプリを終了します");
				if(isHighScore) {
					Date today=new Date();
					          SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
					          String date=sdf.format(today);
					          hs=new HighScore(highScore,date);
					          writeRecord(FILE,hs);
				}
				scan.close();
				break;
			}
			int no=rand.nextInt(MAX)+1;
			System.out.println(no);
			      if(no > highScore) {
			        highScore=no;
			        isHighScore=true;
			        System.out.println("new Record");
			      }

		}
	}
	public static HighScore readFile(String file) {
		    HighScore hs=null;
		    BufferedReader br=null;
		    try {
		      FileInputStream fis=new FileInputStream(file);
		      InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
		      br=new BufferedReader(isr);
		      String line=br.readLine();
		      if(line!=null && !line.equals("")) {
		        String[] data=line.split(",");
		        hs=new HighScore(Integer.parseInt(data[0]),data[1]);
		      }
		    } catch (FileNotFoundException e) {
		          e.printStackTrace();
		    } catch (UnsupportedEncodingException e) {
		      e.printStackTrace();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		    return hs;

		  }


}
