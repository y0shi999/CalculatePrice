package fr.lcdlv.promo5;

class Price {

    private static final int MEAL_PRICE = 40;
    private final Formula formula;

    static int of(Booking booking) {
        return booking.getPrice() - MEAL_PRICE;
    }

    private Price(Formula formula) {
        this.formula = formula;
    }
}
