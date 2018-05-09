package fr.lcdlv.promo5;

enum Accommodation {
    SINGLE(610),
    TWIN(510);

    private final int fullPackPrice;

    Accommodation(int fullPackPrice) {
        this.fullPackPrice = fullPackPrice;
    }

    public int getFullPackPrice() {
        return fullPackPrice;
    }
}
