package day2;

public class HighScore {
	private int score;
	private String date;
	public HighScore(int score,String date) {
		this.score = score;
		this.date =date;
	}
		@Override
		public String toString() {
			return this.score + " " + this.date;
		}
		public String toCSV() {
			return this.score + "," + this.date;



		}
		public int getScore() {
			    return this.score;
		}
	}


