import java.util.ArrayList;

class workInterval
{
    int in; //minutesFromDayStart;
    int out; //minutesFromDayStart;
    
    int value() {
        return out - in;
    }
}

class dayInfo
{
    private ArrayList<workInterval> intervals;
    
    dayInfo()
    {
       intervals = new ArrayList<workInterval>();
    }
    
    boolean isUsual() {
        return intervals.size() == 0;
    }
    
    boolean isSpec() {
        return intervals.size() > 0;
    }
    
    boolean isNullDay() {
        return isSpec() && intervals.size() == 1 && intervals.get(0).value() == 0;
    }
    
    void add_interval(int in, int out)
    {
        if(in > out)
            throw new AssertionError("IN > OUT!!!");
        workInterval w = new workInterval();
        w.in = in;
        w.out = out;
        intervals.add(w);
    }
    
    void cut_interval(int in, int out)
    {
        if(in > out)
            throw new AssertionError("IN > OUT!!!");
        if(isNullDay())
            return;
        ArrayList<workInterval> new_intervals = new ArrayList<workInterval>();
        int cnt = intervals.size();
        for(int i = 0; i < cnt; ++i)
        {
            workInterval old = intervals.get(i);
            
            if(old.in >= in && old.in < out)
                old.in = out;
            if(old.out >= in && old.out < out)
                old.out = in;
            if(old.in >= old.out)
                continue;
            workInterval w = new workInterval();
            w.in = old.in;
            w.out = old.out;
            new_intervals.add(w);
        }
        intervals = new_intervals;
    }
    
    void set_asNullDay() //job was not
    {
        intervals.clear();
        add_interval(0,0);
    }
}

class inputInfo
{
    int year;
    int month;
    
    dayInfo[] specDays;
    
    inputInfo()
    {
        specDays = new dayInfo[31];
        for(int i = 0; i < specDays.length; ++i)
            specDays[i] = new dayInfo();
    }
}

class inputCollector
{
    public void doInput(inputInfo info)
    {
        System.out.println("doInput");
        System.out.println("Year: " + info.year);
        System.out.println("Month: " + info.month);
        
        System.out.println("SpecDaysCnt: " + info.specDays.length);
        
        for(int i = 0; i < info.specDays.length; ++i)
        {
            dayInfo day = info.specDays[i];
            if(day.isUsual())
              day.add_interval(8 * 60, 16 * 60 + 45);
            if(day_hasLunch(day, i))
              day.cut_interval(12 * 60, 12 * 60 + 45);
        }
    }
    
    private boolean day_hasLunch(dayInfo day, int dayIndexInMonth)
    {
        return true;
    }
}
