class PriceCalculator {

    static int calculatePrice(Formula choice) {
        if (choice.equals(Formula.TWIN))
            return Formula.TWIN.getPrice();
        return Formula.SINGLE.getPrice();
    }
}
