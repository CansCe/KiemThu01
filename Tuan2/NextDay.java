public class NextDay {
    public static void main(String[] args){
        int day = 31;
        int month = 12;
        int year = 2020;
        System.out.println("Input date");
        String result = nextDay(day, month, year);
        System.out.println(result);
    }
    public static String nextDay(int day, int month, int year) {
        // Check if the input date is valid
        if (!isValidDate(day, month, year)) {
            return "Invalid date";
        }

        if(!isLeapYear(year)){
            if(month == 2){
                if(day < 28){
                    day++;
                }else{
                    day = 1;
                    month++;
                }
            }else{
                if (day < 31) {
                    day++;
                } else {
                    day = 1;
                    if (month < 12) {
                        month++;
                    } else {
                        month = 1;
                        year++;
                    }
                }
            }
        }else {
            if(month == 2){
                if(day < 29){
                    day++;
                }else{
                    day = 1;
                    month++;
                }
            }else{
                if (day < 31) {
                    day++;
                } else {
                    day = 1;
                    if (month < 12) {
                        month++;
                    } else {
                        month = 1;
                        year++;
                    }
                }
            }

        }
        return "Next date: " + day + "/" + month + "/" + year;
    }

    public static boolean isValidDate(int day, int month, int year) {
        // Check if the year is within the valid range
        if (year < 1812 ) {
            return false;
        }

        // Check if the month is within the valid range
        if (month < 1 || month > 12) {
            return false;
        }

        // Check if the day is within the valid range for the given month
        if (day < 1 || day > getDaysInMonth(month, year)) {
            return false;
        }

        return true;
    }

    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check if it's a leap year and update the number of days in February
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 ==0);
    }
}
