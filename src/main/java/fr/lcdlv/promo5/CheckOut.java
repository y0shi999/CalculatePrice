package fr.lcdlv.promo5;

class CheckOut {
    private final String day;
    private int hour;

    CheckOut(String day, int hour) {

        this.day = day;
        this.hour = hour;
    }

    boolean isBefore(String day, int hour) {
        return day.equalsIgnoreCase("Sunday") && this.hour < hour;
    }
}
