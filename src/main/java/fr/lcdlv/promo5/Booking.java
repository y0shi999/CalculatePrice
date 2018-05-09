package fr.lcdlv.promo5;

class Booking {
    public static final int MEAL_PRICE = 40;
    public static final int NOON = 12;
    private final Accommodation accommodation;
    private final CheckIn checkIn;
    private final CheckOut checkOut;

    Booking(Accommodation accommodation, CheckIn checkIn, CheckOut checkOut) {
        this.accommodation = accommodation;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    int getPrice() {
        return fullPackPrice() - discount();
    }

    private int fullPackPrice() {
        return accommodation.getFullPackPrice();
    }

    private int discount() {
        int discount=0;
        if (isLateCheckIn()) {
            discount+=MEAL_PRICE;
        }
        if (isLateCheckOut()) {
            discount+=MEAL_PRICE;
        }
        return discount;
    }

    private boolean isLateCheckOut() {
        return this.checkOut.isBefore(SeminarDays.SUNDAY, NOON);
    }

    private boolean isLateCheckIn() {
        return this.checkIn.isAfter(SeminarDays.THURSDAY);
    }
}
