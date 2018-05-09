package fr.lcdlv.promo5;

public enum SeminarDays {
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isBefore(SeminarDays otherDay) {
        return this.ordinal() < otherDay.ordinal();
    }

    public boolean isAfter(SeminarDays otherDay) {
        return this.ordinal() > otherDay.ordinal();
    }
}
