public class Year{
    private int year;

    public Year(int year){
        this.year=year;
    }

    public boolean isLeapYear(){
        if(this.year%4==0){
            if(this.year%100==0){
                return this.year%400==0;
            }
            return true;
        }
        return false;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year=year;
    }
}