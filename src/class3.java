import java.util.Scanner;
public class class3 {
  public static void main(String[] args) {
//        for (int i = 0; i <=100; i++) {
//            System.out.println(i);
//        }
//        for(int j=2;j<=100;j=j+2){
//            System.out.println(j);
//
//        }
//        for(int j=0;j<=100;j++){
//            j++;
//            System.out.println(j);
//
//
//        }
       Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number");
//        int a = sc.nextInt();
//        for(int i =0;i<=a;i++){
//            System.out.println("Ram");
//        }
      int i =0;
      while(i<=100){
          System.out.println(i);
          i++;

      }
      int j = 2;
      while (j<=100)
      {
          System.out.println(j);
          j=j+2;
      }
      int y=0;
      while (y<100){
          y++;
          System.out.println(y);
          y++;
      }
      System.out.println("enter a number : ");
      int a = sc.nextInt();
      int x = 0;
      while (x<a){
          System.out.println("ram");
          x++;
      }
    }
}
