class Date2 {
    private int year;
    private int month;
    private int day;
    
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }


    public Date2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    protected boolean isLeap() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public String testLeapYears() {
        if (isLeap()==true) {
            return year + "년은 윤년입니다.";
        } else {
            return year + "년은 윤년이 아닙니다.";
        }
    }
}

public class Practice27 {
    public static void main(String[] args) {
        Date2 date1 = new Date2(2004, 1, 1);	//new Date(2004)
        Date2 date2 = new Date2(1997, 1, 1);	//new Date(1997)
        Date2 date3 = new Date2(1900, 1, 1);
        Date2 date4 = new Date2(2000, 1, 1);

        System.out.println(date1.testLeapYears());
        System.out.println(date2.testLeapYears());
        System.out.println(date3.testLeapYears());
        System.out.println(date4.testLeapYears());
    }
}
