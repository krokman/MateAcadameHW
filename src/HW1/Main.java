package HW1;

import java.io.*;

public class Main{
/*
*
 */
	public static final Main start = new Main();
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, CloneNotSupportedException{
	    start.footballMatch(); //exс 1.1
        start.rhombusDisplay(); //exc 1.2
        start.degreeOf(); //exc 1.3
        start.recursionDisplay(); //exc 1.4
        start.matrixMinMaxOut(); //exc 1.6

        ObjectDeepClone object = new ObjectDeepClone("Tall ", 14, new DeepClone());
        ObjectDeepClone objectClone = object.clone();
        objectClone.setName("Nick ");
        System.out.println("\n" + object.getName() + object.getAge() + "\n" + objectClone.getName() + objectClone.getAge()); //exc 1.7
    }

    public void footballMatch() throws IOException{
        // exc 1.1
        System.out.println("Write match score X Y, and your score X Y");

            int sc1 = Integer.parseInt(reader.readLine());
            int sc2 = Integer.parseInt(reader.readLine());
            int us1 = Integer.parseInt(reader.readLine());
            int us2 = Integer.parseInt(reader.readLine());

            int x = (sc1 == us1 && sc2 == us2 ? 2 : sc1 > sc2 && us1 > us2 ? 1 : sc1 < sc2 && us1 < us2 ? 1 : 0);
            System.out.println(x);
    }

    public void rhombusDisplay() throws IOException{
        // exc 1.2
        System.out.println("Write size of Rhombus");

        int N = Integer.parseInt(reader.readLine());
        float center = N / 2;

        for (int i = 0; i < N; i++) {
            System.out.println();
            for (int j = 0; j < N; j++) {
                if (i <= center) {
                        // Top half rhombus
                    if (j >= center - i && j <= center + i)
                            System.out.print("*");
                    else
                            System.out.print(" ");
                } else {
                        // Lower half rhombus
                    if (j >= center + i - N + 1 && j <= center - i + N - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
        }
    }

    public void degreeOf() throws IOException{
        // exc 1.3
        System.out.println("\nWrite number and degree");

        int n = Integer.parseInt(reader.readLine());
        int degree = Integer.parseInt(reader.readLine());
        int buff = n;

        if (degree == 0){n = 1;}
        for (int i = 0; i < degree - 1; i++){
            n *= buff;
        }
        System.out.println(n);
    }



    public int factorial(int n){
        int result;

        if (n == 1) return 1;

        result = factorial(n-1) * n;
        return result;
    }

    public long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int taylor(int n) {
        if (n == 0) return 1;
        return n * taylor(n-1);
    }

    public void recursionDisplay() throws IOException{
        System.out.println("Number for recursions");
        int n1 = Integer.parseInt(reader.readLine());

        System.out.println("Fibonacci");
        for (int i = 0; i <= n1; i ++){
            System.out.print(start.fibonacci(i) + " ");
        }

        System.out.println("\nTaylor sentence");
        for (int i = 0; i <= n1; i ++){
            System.out.print(start.taylor(i) + " ");
        }

        System.out.println("\nFactorial");
        System.out.println(start.factorial(n1));
    }

    public void matrixMinMaxOut(){
       // exc 1.6
        int n = 4;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++){ //initializing matrix with random numbers < 50
            for (int j = 0; j < n; j++){
                matrix[i][j] = (int)(Math.random()*50);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        int min = matrix[0][0];
        int max = matrix[0][0];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(matrix[i][j] > max){max = matrix[i][j];}
                if(matrix[i][j] < min){min = matrix[i][j];}
            }
        }
        System.out.println("\nMax = " + max + " Min = " + min);
    }

}