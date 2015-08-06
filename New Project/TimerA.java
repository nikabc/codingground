import java.util.*;

class TimerA
{
    java.util.Timer timer;
    TimerTask task;
    Main.Appl appl;
    final int tm = 1; //seconds
    
    TimerA(Main.Appl appl_)
    {
        appl = appl_;
        timer = new java.util.Timer();
        task = new TimerTask()
            {
                public void run()
                {
                    if(!appl.onTimer(tm))
                        stop();
                }
            };
        
        start();
    }
    
    void start()
    {
        appl.start();
        timer.schedule(task, 0, tm * 1000);
    }
    
    void stop()
    {
        timer.cancel();
        appl.end();
        //System.exit(0);
    }
}
