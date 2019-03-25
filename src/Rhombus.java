import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rhombus {
	public void rhombusDisplay() {
		// exc 1.2
		System.out.println("Write size of Rhombus");
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			int border = Integer.parseInt(reader.readLine());
			float center = border / 2;

			for (int i = 0; i < border; i++) {
				System.out.println();
				for (int j = 0; j < border; j++) {
					System.out.print((i <= center) ? (j >= center - i && j <= center + i) ? "*" : " " :
							(j >= center + i - border + 1 && j <= center - i + border - 1) ? "*" : " ");
				}
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}}
