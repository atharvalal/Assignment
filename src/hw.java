import java.util.Scanner;
public class hw {
    public static void main(String[] args) {
        System.out.println("enter a rupees digit : ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        int hundred =0;
        int ten =0;
        int five =0;


        if(userInput > 1000) {
            hundred=(userInput-((userInput/1000)*1000));
            System.out.println(userInput-hundred);
        }
        if(hundred > 500 && hundred < 1000) {
            ten = (hundred-((hundred/500)*500));
            System.out.println(hundred-ten);
        }
        if(ten > 100) {
            five = (ten-((ten/100)*100));
            System.out.println(ten-five);
        }


        }


    }

