package fr.lcdlv.promo5;

class CheckIn {
    private Days day;

    CheckIn(Days day) {
        this.day = day;
    }

    boolean isAfter(Days day) {
        return !this.day.equals(day);
    }
}
