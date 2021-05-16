package timeConvrsion;
/*
 counvert
   1.Hours To Minutes
   2.Minutes To Hours
   3.Hours To Seconds
   4.Seconds to Hours
 */
public class TimeConverter
{
    public String hoursToMinutes(int hours)
    {
        long minutes=hours*60;
        return hours+" Hour\\s = "+minutes+" MINUTES";
    }
    public String minutesToHours(int minutes)
    {
        int hours=minutes/60;
        minutes=minutes%60;
        return minutes+" MINUTES ="+hours+" HOURS "+ minutes+" MINUTES";
    }
    public String hoursToSeconds(int hours)
    {
        long seconds=hours*3600;
        return hours+" Hour\\s = "+seconds+" SECONDS";
    }
    public String secondsToHours(int seconds)
    {
        int hours=seconds/3600;
        int minutes=(seconds%3600)/60;
        seconds=(seconds%3600)%3600;
        return minutes+" MINUTES ="+hours+" HOURS "+ minutes+" MINUTES"+ seconds +" SECONDS";
    }
}
