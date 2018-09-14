public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(){
        hour = 12;
        minute = 0;
        second = 0;
    }

    public Time(int h, int m, int s){
        if(h >= 0 && h <= 23) hour = h;
        else hour = 0;

        if(m >= 0 && m <= 59) minute = m;
        else minute = 0;

        if(s >= 0 && s<=59) second = s;
        else second = 0;
    }

    public String toUniversal(){
        String hourS;
        String minuteS;
        String secondS;
        if(hour >= 0 && hour < 10)
            hourS = "0" + hour;
        else hourS = "" + hour;

        if(minute >= 0 && minute < 10)
            minuteS = "0" + minute;
        else minuteS = "" + minute;

        if(second >= 0 && second < 10)
            secondS = "0" + second;
        else secondS = "" + second;

        return hourS + ":" + minuteS + ":" + secondS;
    }

    public String toStandard(){
        String minuteS;
        String secondS;

        if(minute >= 0 && minute < 10)
            minuteS = "0" + minute;
        else minuteS = "" + minute;

        if(second >= 0 && second < 10)
            secondS = "0" + second;
        else secondS = "" + second;

        if(hour >= 0 && hour <= 11){
            return hour + ":" + minuteS + ":" + secondS + " AM";
        }

        else if(hour == 12) return hour + ":" + minuteS + ":" + secondS + " PM";

        else{
            hour = hour - 12;
            return hour + ":" + minuteS + ":" + secondS + " PM";
        }
    }

}
