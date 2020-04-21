import javax.swing.*;

public class Date212 {
    private int year;
    private int month;
    private int day;
    private String date;

    public Date212(String date) {
        this.date = date;
        year = Integer.parseInt(date.substring(0, 4));
        month = Integer.parseInt(date.substring(4, 6));
        day = Integer.parseInt(date.substring(6, 8));
    }

    private boolean isValid(String date) {
        if (date.length() != 8)// checks if digits are valid
            return false;
        // checks if they are all digits
        for (int i = 0; i < date.length(); i++) {
            if (!Character.isDigit(date.charAt(i)))
                return false;
        }
        year = Integer.parseInt(date.substring(0, 4));
        month = Integer.parseInt(date.substring(4, 6));
        day = Integer.parseInt(date.substring(6, 8));
        if (month < 1 || month > 12)// checks if month is valid
            return false;
        if (day < 1 || day > 31)
            return false;
        return true;
    }

    public String getDate() {
        return date;
    }

    public int getyear() {
        return year;
    }

    public int getmonth() {
        return month;
    }

    public int getday() {
        return day;
    }

    public void setyear(int y) {
        year = y;
    }

    public void setmonth(int m) {
        month = m;
    }

    public void setday(int d) {
        day = d;
    }

    public boolean equals(Date212 date) {
        if (this.getyear() == date.getyear()) {
            if (this.getmonth() == date.getmonth()) {
                if (this.getday() == date.getday()) {
                    return true;
                }
            }
        }

        return false;
    }

    public int compareTo(Dates212 date) {
        if (this.getyear() < date.getyear()) {
            return -1;
        } else if (this.getyear() > date.getyear()) {
            return 1;
        } else if (this.getmonth() < date.getmonth()) {
            return -1;
        } else if (this.getmonth() > date.getmonth()) {
            return 1;
        } else if (this.getday() < date.getday()) {
            return -1;
        } else if (this.getday() > date.getday()) {
            return 1;
        } else {
            return 0;
        }
    }

    // toString method should print the date in mm dd, yyyy
    // format (for example,
    // 20181002 would be returned as October 2, 2018.
    public String tostring() {
        String newMonth[] = { "January", "Febuary", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        return newMonth[month - 1] + " " + day + ", " + year;

    }
}
