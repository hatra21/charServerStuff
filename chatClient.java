import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;

public class chatClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 2222);

        Scanner clientInput = new Scanner(s.getInputStream());
        String name = clientInput.nextLine();

        System.out.println("read: " + name);

        Scanner scan = new Scanner(System.in);
        String myName = scan.nextLine();

        PrintStream clientOutput = new PrintStream(s.getOutputStream());
        System.out.println("writing back to server the name: " + myName);
        clientOutput.println(myName);

    }
}
