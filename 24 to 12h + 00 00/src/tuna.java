public class tuna{
    private int hour, minute, second;

    public tuna(int h, int m, int s){
        setTime(h,m,s);
    }

    public tuna(){
        this(0,0,0);
    }

    public tuna(int h){
        this(h,0,0);
    }
    public tuna(int h, int m){
        this(h,m,0);
    }

    public void setTime(int h, int m, int s){
        setHour(h);
        setMin(m);
        setSec(s);
    }

    public void setHour(int h){
        hour=((h>=0 && h<24)? h:0);
    }
    public void setMin(int m){
        minute=((m>=0 && m<60)? m:0);
    }
    public void setSec(int s){
        second=((s>=0 && s<60)? s:0);
    }


    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }

    public String display12h(){
        return String.format("%d:%02d:%02d %s", ((getHour()==0 || getHour()==12)? 12:getHour()%12), getMinute(), getSecond(), ((getHour()>12)? "PM":"AM"));
    }








}