import java.util.*;
public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(int hours, int minutes, int seconds) {
        setClock(hours, minutes, seconds);
    }

    public void tick() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            minutes++;
            if (minutes >= 60) {
                minutes = 0;
                hours++;
                if (hours >= 24) {
                    hours = 0;
                }
            }
        }
    }

    public void displayTime() {
        int hourIn12HourFormat = (hours == 0 || hours == 12) ? 12 : hours % 12;
        String ampm = (hours < 12) ? "AM" : "PM";
        System.out.printf("%02d:%02d:%02d %s%n", hourIn12HourFormat, minutes, seconds, ampm);
    }

    public void setClock(int hours, int minutes, int seconds) {
        if (isValidTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        } else {
            System.out.println("Invalid time. Clock set to default (12:00:00 AM).");
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
        }
    }

    private boolean isValidTime(int hours, int minutes, int seconds) {
        return hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60 && seconds >= 0 && seconds < 60;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: Sonu Kumar Sharma");
        System.out.println("Enrollment No.: AJU/220676");
        System.out.println("Enter the time (HH:MM:SS):");
        String inputTime = scanner.nextLine();
        scanner.close();

        String[] timeParts = inputTime.split(":");
        if (timeParts.length == 3) {
            int hours = Integer.parseInt(timeParts[0]);
            int minutes = Integer.parseInt(timeParts[1]);
            int seconds = Integer.parseInt(timeParts[2]);

            // Convert excess minutes to hours and excess seconds to minutes
            hours += minutes / 60;
            minutes = minutes % 60;
            minutes += seconds / 60;
            seconds = seconds % 60;

            Clock myClock = new Clock(hours, minutes, seconds);

            System.out.println("Entered time (24-hour format):");
            myClock.displayTime();

            for (int i = 0; i < 5; i++) { // Simulate more than 60 seconds
                myClock.tick();
                System.out.println("After one second:");
                myClock.displayTime();
            }
        }else{
            System.out.println("Invalid time format. Please use HH:MM:SS.");
        }
    }
}


