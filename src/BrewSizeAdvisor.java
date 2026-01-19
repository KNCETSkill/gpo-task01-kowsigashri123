import java.util.Scanner;

public class BrewSizeAdvisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int volume = sc.nextInt();
        {
            if (volume > 350)
            {
                System.Out.Print("Large")
            }
            if else (volume >= 200 && volume <= 350)
            {
                System.Out.Print("Mediam")
             }
            if else (volume < 200)
            {
                System.Out.Print("Small")
            }
            else
            {
                System.Out.Print("IV")
            }
        }
            sc.close();
    }
}

