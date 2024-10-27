import java.util.Scanner;
import java.util.regex.*;

public class Main
{
    public static void main(String[] args)
    {
        Pattern p1 = Pattern.compile("(([a-f0-9])([a-f0-9])(:)){5}([a-f0-9])([a-f0-9])");
        while (true)
        {
            System.out.print("Введите MAC-адрес: ");
            Scanner sc1 = new Scanner(System.in);
            String address = sc1.next().toLowerCase();
            Matcher m1 = p1.matcher(address);
            String answer = (m1.matches()) ? "Вы ввели MAC-адрес!": "Это не MAC-адрес :(";
            System.out.println(answer);
        }
    }
}
