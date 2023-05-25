
package problem2;

public class Date {
    private String day;
    private String month;
    private String year;

    public Date(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    public void setMonth(String month) {
        this.month = month;
    }

    public void formateDate()
    {
        String formatDate;
        formatDate = this.day+","+this.month+","+this.year;
    }
    
}
