import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FootballMatch {
	public void footballMatch(){
		// exc 1.1
		System.out.println("Write match score X Y, and your score X Y");

		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
		int matchScore1 = Integer.parseInt(reader.readLine());
		int matchScore2 = Integer.parseInt(reader.readLine());
		int yourScore1 = Integer.parseInt(reader.readLine());
		int yourScore2 = Integer.parseInt(reader.readLine());

		int outScore = ((matchScore1 == yourScore1 && matchScore2 == yourScore2) ? 2 :
				(matchScore1 > matchScore2 && yourScore1 > yourScore2) ? 1 :
						(matchScore1 < matchScore2 && yourScore1 < yourScore2) ? 1 : 0);
		System.out.println(outScore);
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}
