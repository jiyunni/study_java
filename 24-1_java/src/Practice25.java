class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
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

    public String toString() {
        return year + "년 " + month + "월 " + day + "일";
    }
}

public class Practice25 {
    public static void main(String[] args) {
        Date date1 = new Date(2010, 8, 31);
        Date date2 = new Date(1998, 9, 15);

        System.out.println(date1.toString());	//.toString()생략 가능
        System.out.println(date2.toString());
    }
}
