public class Lab03 {
    public static void main(String args[]) {
        int start = 10000;
        int hours = start / 3600;
        int left = start % 3600;
        int minute = left / 60;
        int secs = left % 60;

        System.out.println("Lab03, 80 Point Version\n");
        System.out.println("Starting seconds:  " + start);
        System.out.println("Hours:             " + hours);
        System.out.println("Minutes:           " + minute);
        System.out.println("Seconds:           " + secs);
        System.out.println("\n \n");


        int start2 = 10000123;
        int hours2 = start2 / 3600000;
        int left2 = start2 % 3600000;
        int minute2 = left2 / 60000;
        int left3 = left2 % 60000;
        int secs2 = left3 / 1000;
        int milli = left3 % 1000;

        System.out.println("Lab03, 100 Point Version\n");
        System.out.println("Starting milli-seconds:  " + start2);
        System.out.println("Hours:                   " + hours2);
        System.out.println("Minutes:                 " + minute2);
        System.out.println("Seconds:                 " + secs2);
        System.out.println("Milli Seconds:           " + milli);


    }

}