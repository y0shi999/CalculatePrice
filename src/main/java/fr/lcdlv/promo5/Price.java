package fr.lcdlv.promo5;

class Price {

    private final Formula formula;

    static int of(Formula formula) {
        final Price price = new Price(formula);
        if (price.isFor(formula))
            return Formula.TWIN.getNominalPrice();
        return Formula.SINGLE.getNominalPrice();
    }

    static int of(Booking booking) {
        if (!booking.isSingle()){
            return 470;
        }
        return 570;
    }

    private boolean isFor(Formula formula) {
        return formula.equals(Formula.TWIN);
    }

    private Price(Formula formula) {
        this.formula = formula;
    }
}
