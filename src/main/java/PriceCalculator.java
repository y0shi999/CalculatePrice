class PriceCalculator {

    public static final int SINGLE_FULL_PRICE = 610;
    public static final int TWIN_FULL_PRICE = 510;

    static int calculatePrice(Formula choice) {
        if (choice.equals(Formula.TWIN))
            return TWIN_FULL_PRICE;
        return SINGLE_FULL_PRICE;
    }
}
