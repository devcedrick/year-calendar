public class Date {
    private Year year;

    public Date(Year year){
        this.year=new Year(year.getYear());
    }

    private int calculate_elapsed_days(){
        Year anchor=new Year(1000);
        int target=year.getYear();

        //Leap year counter
        int elapsedDays=0;
        for(int i=anchor.getYear(); i<target; i++){
            if(anchor.isLeapYear()){
                elapsedDays+=366;
                anchor.setYear(i+1);
                continue;
            }
            elapsedDays+=365;
            anchor.setYear(i+1);
        }
        return elapsedDays;
    }

    private int calculate_day_week(){
        return this.calculate_elapsed_days()%7;
    }

    public void displayCalendar(){
        System.out.println();

        int x=0;
        switch(this.calculate_day_week()){
            case 0: x=3;
                break;
            case 1: x=4;
                break;
            case 2: x=5;
                break;
            case 3: x=6;
                break;
            case 4: x=0;
                break;
            case 5: x=1;
                break;
            case 6: x=2;
                break;
        }

        for(int i=1; i<=12; i++){
            Month month=new Month(i);
            System.out.println(month.getMonthName()+ year.getYear() + " AD");

            System.out.println("Su Mo Tu We Th Fr Sa");
            
            int tempX=x;
            int offset=0;
            while(offset<x){
                System.out.print("   ");
                offset++;
            }

            int rowInx=0;
            for(int j=1; j<=month.getNumOfDays(this.year); j++){
                if(tempX+1>6){
                    tempX=0;
                }else{
                    tempX++;
                }
                System.out.printf("%2d ",j);
                if(rowInx<(6-x)){
                    rowInx++;
                }else{
                    System.out.println();
                    rowInx=0;
                    x=0;
                }
                
            }
            x=tempX;
            System.out.println("\n");
        }
    }
}
