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

    int getPrice() {
        if(this.checkIn.isAfter("Thursday")) {
            return formula.getNominalPrice() - 40;
        }

        if(this.checkOut.isBefore("Sunday",12)) {
            return formula.getNominalPrice() - 40;
        }
        return formula.getNominalPrice();
    }
}
