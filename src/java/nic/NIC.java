package nic;
// Index no - 110546M
import java.util.Scanner;
import java.util.Calendar;

public class NIC {

    public int getYear(String input){
        String bday = input;
        String year = bday.substring(0, 2);
        int year1 = Integer.parseInt(year);
        year1 = year1 + 1900;
        return year1;
    }

    public int getMonth(String input) {
        String bday = input;
        String days = bday.substring(2, 5);
        int days1 = Integer.parseInt(days);
        if (days1 > 500) {
            days1 = days1 - 500;
        }
        Calendar c = Calendar.getInstance();
        c.set(c.DAY_OF_YEAR, days1);
        int month = c.get(c.MONTH) + 1;
        return month;
    }

    public int getDate(String input) {
        String bday = input;
        String days = bday.substring(2, 5);
        int days1 = Integer.parseInt(days);
        if (days1 > 500) {
            days1 = days1 - 500;
        }
        Calendar c = Calendar.getInstance();
        c.set(c.DAY_OF_YEAR, days1);
        int mydate = c.get(c.DATE) - 1;
        return mydate;
    }

    public String gender(String input) {
        String index = input.substring(2, 5);
        int gender = Integer.parseInt(index);
        if (gender >= 500) {
            return "Female";
        } else {
            return "Male";
        }
    }

    public boolean isVoter(String input) {
        if (this.getYear(input) <= 1993) {
            return true;
        } else {
            return false;
        }
    }
}
