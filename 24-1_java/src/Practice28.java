
class Date3 {
    private int year;
    private int month;
    private int day;

    public Date3(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }


    public String printWestern() {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[month] + " " + day + ", " + year;
    }

    public String toString() {
        return year + "년 " + month + "월 " + day + "일";
    }
}

public class Practice28 {
    public static void main(String[] args) {
        Date3 date1 = new Date3(2010, 9, 2);
        Date3 date2 = new Date3(1997, 4, 1);

        System.out.println(date1.toString());
        System.out.println(date1.printWestern());
        System.out.println(date2.toString());
        System.out.println(date2.printWestern());
    }
}
