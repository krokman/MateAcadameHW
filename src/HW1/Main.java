package HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static final Main start = new Main();
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, CloneNotSupportedException{
	    start.footballMatch(); // exс 1.1
        start.rhombusDisplay(); // exc 1.2
        start.degreeOf(); // exc 1.3
        start.recursionDisplay(); // exc 1.4
        start.matrixMinMaxOut(); // exc 1.6

        ObjectDeepClone object = new ObjectDeepClone("Tall ", 14, new DeepClone());
        ObjectDeepClone objectClone = object.clone();
        objectClone.setName("Nick ");
        System.out.println("\n" + object.getName() + object.getAge() + "\n" + objectClone.getName() + objectClone.getAge()); //exc 1.7
    }

    public void footballMatch() throws IOException{
        // exc 1.1
        System.out.println("Write match score X Y, and your score X Y");

            int matchScore1 = Integer.parseInt(reader.readLine());
            int matchScore2 = Integer.parseInt(reader.readLine());
            int yourScore1 = Integer.parseInt(reader.readLine());
            int yourScore2 = Integer.parseInt(reader.readLine());

            int outScore = ((matchScore1 == yourScore1 && matchScore2 == yourScore2) ? 2 :
                        (matchScore1 > matchScore2 && yourScore1 > yourScore2) ? 1 :
                                (matchScore1 < matchScore2 && yourScore1 < yourScore2) ? 1 : 0);
            System.out.println(outScore);
    }

    public void rhombusDisplay() throws IOException{
        // exc 1.2
        System.out.println("Write size of Rhombus");

        int border = Integer.parseInt(reader.readLine());
        float center = border / 2;

        for (int i = 0; i < border; i++) {
            System.out.println();
            for (int j = 0; j < border; j++) {
                System.out.print((i <= center)?(j >= center - i && j <= center + i)?"*":" ":
                        (j >= center + i - border + 1 && j <= center - i + border - 1)?"*":" ");
            }
        }
    }

    public void degreeOf() throws IOException{
        // exc 1.3
        System.out.println("\nWrite number and degree");

        int number = Integer.parseInt(reader.readLine());
        int degree = Integer.parseInt(reader.readLine());
        int buff = number;

        if (degree == 0){
            number = 1;
        }
        for (int i = 0; i < degree - 1; i++){
            number *= buff;
        }
        System.out.println(number);
    }

    public int factorial(int number){
        int result;
        if (number == 1) {
            return 1;
        }
        result = factorial(number-1) * number;
        return result;
    }

    public long fibonacci(int number){
        if (number <= 1) {
            return number;
        }
        else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    public int taylor(int number){
        if (number == 0) {
            return 1;
        }
        return number * taylor(number-1);
    }

    public void recursionDisplay() throws IOException{
        System.out.println("Number for recursions");
        int number = Integer.parseInt(reader.readLine());

        System.out.println("Fibonacci");
        for (int i = 0; i <= number; i++) {
            System.out.print(start.fibonacci(i) + " ");
        }

        System.out.println("\nTaylor sentence");
        for (int i = 0; i <= number; i++) {
            System.out.print(start.taylor(i) + " ");
        }

        System.out.println("\nFactorial");
        System.out.println(start.factorial(number));
    }

    public void matrixMinMaxOut(){
       // exc 1.6
        int border = 4;
        int[][] matrix = new int[border][border];

        for (int i = 0; i < border; i++) { //initializing matrix with random numbers < 50
            for (int j = 0; j < border; j++) {
                matrix[i][j] = (int)(Math.random() * 50);
            }
        }

        for (int i = 0; i < border; i++) {
            System.out.println();
            for (int j = 0; j < border; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        int min = matrix[0][0];
        int max = matrix[0][0];

        for (int i = 0; i < border; i++) {
            for (int j = 0; j < border; j++) {
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("\nMax = " + max + " Min = " + min);
    }
}