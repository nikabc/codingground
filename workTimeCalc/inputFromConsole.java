import java.util.Scanner;

class inputFromConsole
{
    public String nextInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("wait input\n");
        String input;
        input = sc.nextLine();
        return input;
    }
    
}