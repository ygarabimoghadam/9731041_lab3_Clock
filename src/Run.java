import java.time.LocalDateTime;

public class Run {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int second =  now.getSecond();
        int minute = now.getMinute();
        int hour = now.getHour();
        ClockDisplay myClock = new ClockDisplay(hour,minute,second);
        myClock.print();
        myClock.timeTick();
        myClock.print();
        myClock.setTime(1,59,59);
        myClock.timeTick();
        myClock.print();

    }
}
