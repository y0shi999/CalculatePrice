package fr.lcdlv.promo5;

class CheckOut {
    private final SeminarDays day;
    private int hour;

    CheckOut(SeminarDays day, int hour) {

        this.day = day;
        this.hour = hour;
    }

    boolean isBefore(SeminarDays limitDay, int hour) {
        return (this.day.equals(limitDay) && this.hour < hour) || this.day.isBefore(limitDay);
    }
}
