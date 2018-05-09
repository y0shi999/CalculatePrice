package fr.lcdlv.promo5;

class CheckIn {
    private SeminarDays day;

    CheckIn(SeminarDays day) {
        this.day = day;
    }

    boolean isAfter(SeminarDays day) {
        return this.day.isAfter(day);
    }
}
