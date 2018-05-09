package fr.lcdlv.promo5;

class Booking {
    public static final int MEAL_PRICE = 40;
    private final Accommodation accommodation;
    private final CheckIn checkIn;
    private final CheckOut checkOut;

    Booking(Accommodation accommodation, CheckIn checkIn, CheckOut checkOut) {
        this.accommodation = accommodation;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    int getPrice() {
        int price = accommodation.getNominalPrice();
        if (this.checkIn.isAfter(Days.THURSDAY)) {
            price= price - MEAL_PRICE;
        }
        if (this.checkOut.isBefore(Days.SUNDAY, 12)) {
            price = price - MEAL_PRICE;
        }
        return price;
    }
}
