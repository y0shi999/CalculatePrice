package fr.lcdlv.promo5;

class Booking {
    private final Formula formula;
    private final CheckIn checkIn;
    private final CheckOut checkOut;

    Booking(Formula formula, CheckIn checkIn, CheckOut checkOut) {
        this.formula = formula;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    int getFormulaNominalPrice() {
        return this.formula.getNominalPrice();
    }
}
