import java.io.File;

class Logger
{
    static final int mask_stdout = 1;
    static final int mask_file = 2;
    
    private int mask = 0;
    
    Logger(int mask_)
    {
        mask = mask_;
    }
    
    private void log(String s)
    {
        if((mask & mask_stdout) != 0)
            System.out.println("LOG: " + s);
        if((mask & mask_file) != 0)
        {
            //file.write(s + "\n");
        }
    }
    
    void q(String s)
    {
        log(s);
    }
    
    void q(int v)
    {
        String str = new String();
        str += v;
        log(str);
    }
}