public class tuna{
    private int hour, min, sec;

    public void setTime(int h, int m, int s){
        hour=((h>=0 && h<24)? h:0);
        min=((m>=0 && m<60)? m:0);
        sec=((s>=0 && s<60)? s:0);
    }

    public String convertTo12h(){
        return String.format("%d:%02d:%02d %s", ((hour==12 || hour ==0)? 12:hour%12), min, sec, ((hour>12)? "PM":"AM"));
    }






}