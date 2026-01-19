import java.util.Scanner;

public class BrewSizeAdvisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int volume = sc.nextInt();
        {
            if (volume > 350)
            {
                System.out.print("Large")
            }
            if else (volume >= 200 && volume <= 350)
            {
                System.out.print("Mediam")
             }
            if else (volume < 200)
            {
                System.out.print("Small")
            }
        }
            sc.close();
    }
}

