enum  Formula {
     SINGLE(610),
    TWIN(510);

    private final int price;

    Formula(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
