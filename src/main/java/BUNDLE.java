enum BUNDLE{
    twoBooks(0.05),
    threeBooks(0.10),
    fourBooks(0.15),
    fiveBooks(0.25),
    sixBooks(0.30),
    sevenBooks(0.35);

    private double discount;
    BUNDLE(double discount){
        this.discount= discount;
    }

    public double getDiscount() {
        return discount;
    }
}
