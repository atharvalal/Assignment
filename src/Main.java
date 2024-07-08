import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two different numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);

        System.out.println("enter radius : ");
        float radius = sc.nextFloat();
        float pi = 3.14f;
        float area = radius * radius * pi;
        System.out.println("the area is "+area);

        System.out.println("enter a number : ");
        int num = sc.nextInt();
        if( num%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}