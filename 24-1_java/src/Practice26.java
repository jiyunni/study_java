class Date1 {
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


    public Date1() {
        this.year = 1990;
        this.month = 1;
        this.day = 1;
    }

    public Date1(int year) {
        this.year = year;
        this.month = 1;
        this.day = 1;
    }

    public Date1(int year, int month) {
        this.year = year;
        this.month = month;
        this.day = 1;
    }

    public Date1(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    

    public String toString() {
        return year + "년 " + month + "월 " + day + "일";
    }
}

public class Practice26 {
    public static void main(String[] args) {
        Date1 date1 = new Date1(2007, 2, 18);
        Date1 date2 = new Date1(2006, 3, 2);
        Date1 date3 = new Date1(2007, 2, 27);
        Date1 date4 = new Date1(2007, 3, 2);
        Date1 date5 = new Date1(2007, 4, 20);
        Date1 date6 = new Date1(2007, 4, 26);

        System.out.println("오늘은 " + date1 + "입니다.");
        System.out.println("내가 동덕여자대학교에 입학한 날짜는 " + date2 + "입니다.");
        System.out.println("2007학년도 개강일은 " + date3 + "에서 " + date4 + "로 변경되었습니다.");
        System.out.println("중간고사 기간은 " + date5 + "부터 " + date6 + "까지 입니다.");
    }
}
