
public class main
{
     public static void main(String []args){
        System.out.println("Hello World");
        
        inputFromConsole con = new inputFromConsole();
        String input = con.nextInput();
        
        inputCollector ic = new inputCollector();
        inputInfo info = new inputInfo();
        info.test_integer = 6;
        info.test_string = input;
        ic.doInput(info);
     }
}
