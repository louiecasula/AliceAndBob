import java.util.Scanner;
//package AliceAndBob;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String... args ){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();

        Greeting greeting = new Greeting(name, null);

        System.out.print(greeting.getResponse(name));

    }
}
