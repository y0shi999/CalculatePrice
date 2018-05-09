package fr.lcdlv.promo5;

enum Accommodation {
    SINGLE(610),
    TWIN(510);

    private final int price;

    Accommodation(int price) {
        this.price = price;
    }

    public int getNominalPrice() {
        return price;
    }
}
