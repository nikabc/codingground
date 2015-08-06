public class Main
{
    abstract static class Appl
    {
        abstract void start();
        abstract void end();
        abstract boolean onTimer(int seconds_from_last_timer);
    }
    
    static class Appl_Test1 extends Appl
    {
        Logger logger;
        Appl_Test1(Logger logger_) {
            logger = logger_;
        }
        
        int cnt = 5;
        
        void start() { logger.q("Start"); }
        void end() { logger.q("End"); }
        boolean onTimer(int seconds) { logger.q("Timer"); return --cnt > 0; }
    }
    
    public static void main(String []args){
        Logger logger = new Logger(Logger.mask_stdout | Logger.mask_file);
        Kernel kernel = new Kernel(logger);
        /*****************************/
        Appl appl = new 
            //Appl_Test1
            Appl_Test2
        (logger, kernel);
        /*****************************/
        TimerA timer = new TimerA(appl);
     }
}
