package fr.lcdlv.promo5;

class CheckIn {
    private String day;

    CheckIn(String day) {
        this.day = day;
    }

    boolean isAfter(String day) {
        return !this.day.equalsIgnoreCase(day);
    }
}
