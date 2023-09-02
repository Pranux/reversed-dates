public class Main {
    //Prints out the dates between two given years that remains the same, if numbers of the date are reversed
    public static void printBonusDatesBetween(int fromYear, int toYear) {

        //Checking if given years are correct
        boolean correctYear = (fromYear >= 0) && (toYear >= 0);

        if(correctYear) {
            //Going through every year
            for(int i = fromYear; i <= toYear; i++) {

                //Mathematically it does not make sense if year is smaller than 1000 or bigger than 9999
                if(i >= 1000 && i <= 9999) {

                    //Declaring first and second numbers of month and day
                    int month1 = i % 10;
                    int month2 = i % 100 / 10;
                    int day1 = i % 1000 / 100;
                    int day2 = i / 1000;

                    //Declaring month and day
                    int month = month1 * 10 + month2;
                    int day = day1 * 10 + day2;

                    //Checking if numbers of days in a month is less than or equal to 31
                    if(((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day <= 31)) ||
                            //Checking if numbers of days in a month is less than or equal to 30
                            ((month == 4 || month == 6 || month == 9 || month == 11 ) && (day <= 30)) ||
                            //Checking if numbers of days in February on a leap year is less than or equal to 29
                            ((month == 2) && (i%4 == 0) && (day <= 29)) ||
                            //Checking if numbers of days in February on a common year is less than or equal to 28
                            ((month == 2) && (i%4 != 0) && (day <= 28))
                            ) {
                        //I am not using "month" or "day" because then I could lose zeros
                        System.out.println(i + "-" + month1 + month2 + "-" + day1 + day2);
                    }
                }
            }
        } else {
            System.out.println("Given years must be more than or equal to '0'");
        }
    }

    public static void main(String[] args) {

    }
}