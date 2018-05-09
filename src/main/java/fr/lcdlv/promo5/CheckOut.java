package fr.lcdlv.promo5;

class CheckOut {
    private final Days day;
    private int hour;

    CheckOut(Days day, int hour) {

        this.day = day;
        this.hour = hour;
    }

    boolean isBefore(Days day, int hour) {
        return day.equals(Days.SUNDAY) && this.hour < hour;
    }
}
