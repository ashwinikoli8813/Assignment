import java.util.Scanner;
class Subtraction {
    public static void main(String[] args) 
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Any two number for subtraction");
        int number1 = s1.nextInt();
        int number2 = s1.nextInt();
        System.out.println("Subtraction is "+(number1 - number2));


    }
}