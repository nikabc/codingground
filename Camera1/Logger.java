class Logger
{
    static final int mask_stdout = 1;
    static final int mask_file = 2;
    
    private int mask = 0;
    private FileWorkerA file;
    
    Logger(int mask_)
    {
        mask = mask_;
        if(xFile())
          file = new FileWorkerA("test.txt");
    }
    
    private boolean xStd() {
        return (mask & mask_stdout) != 0;
    }
    
    private boolean xFile() {
        return (mask & mask_file) != 0;
    }
    
    private void log(String s)
    {
        if(xStd())
            System.out.println("LOG: " + s);
        if(xFile())
            file.write(s + "\n");
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
