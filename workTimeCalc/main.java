
public class main
{
     public static void main(String []args){
        System.out.println("Hello World");
        
        inputFromConsole con = new inputFromConsole();
        String input = con.nextInput();
        
        inputCollector ic = new inputCollector();
        inputInfo info = new inputInfo();
        info.year = 2015;
        info.month = Integer.parseInt(input);
        ic.doInput(info);
     }
}
