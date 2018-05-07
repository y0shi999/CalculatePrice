package fr.lcdlv.promo5;

enum  Formula {
     SINGLE(610),
    TWIN(510);

    private final int price;

    Formula(int price) {
        this.price = price;
    }

    public int getNominalPrice() {
        return price;
    }
}
