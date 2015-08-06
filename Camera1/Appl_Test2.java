class Appl_Test2 extends Main.Appl
{
    Logger logger;
    Kernel kernel;
    Appl_Test2(Logger logger_, Kernel kernel_) {
        logger = logger_;
        kernel = kernel_;
    }
    
    int cnt = 5;
    
    void start() { logger.q("2: Start"); }
    void end() { logger.q("2: End"); }
    boolean onTimer(int seconds) { logger.q("2: Timer"); return --cnt > 0; }
}
