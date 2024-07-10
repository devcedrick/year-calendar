public class Month{
    private int monthNumber;

    public Month(int monthNumber){
        this.monthNumber=monthNumber;
    }

    public String getMonthName(){
        switch(this.monthNumber){
            case 1: 
                return "January ";
            case 2:
                return "February ";
            case 3:
                return "March ";
            case 4: 
                return "April ";
            case 5:
                return "May ";
            case 6:
                return "June ";
            case 7:
                return "July ";
            case 8:
                return "August ";
            case 9: 
                return "September ";
            case 10: 
                return "October ";
            case 11:
                return "November ";
            case 12: 
                return "December ";
            default: 
                return "Invalid integer input."; 
        }
    }

    public int getNumOfDays(Year year){
        int m=this.monthNumber;
        if(m==2){
            return year.isLeapYear() ? 29:28;
        }else if(m==4 || m==6 || m==9 || m==11){
            return 30;
        }else{
            return 31;
        }
        
    }
}


