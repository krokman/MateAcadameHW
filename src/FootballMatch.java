public class FootballMatch {
	public static void main(String[] args) {
		int outScore = footballMatch(2, 4, 5, 6);
		System.out.println(outScore);
	}

	public static int footballMatch(int matchScore1, int matchScore2, int yourScore1, int yourScore2) {
		// exc 1.1
		System.out.println("Write match score X Y, and your score X Y");
		int outScore = ((matchScore1 == yourScore1 && matchScore2 == yourScore2) ? 2 :
				(matchScore1 > matchScore2 && yourScore1 > yourScore2) ? 1 :
						(matchScore1 < matchScore2 && yourScore1 < yourScore2) ? 1 : 0);
		return outScore;
	}
}

