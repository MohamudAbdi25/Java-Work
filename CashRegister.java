class CashRegister {

    private RetailItem item;
    private int noOfUnitsBuying;


    CashRegister(RetailItem item, int noOfUnitsBuying) {
        this.item = item;
        this.noOfUnitsBuying = noOfUnitsBuying;
    }


    public RetailItem getItem() {
        return item;
    }

    public void setItem(RetailItem item) {
        this.item = item;
    }

    public int getNoOfUnitsBuying() {
        return noOfUnitsBuying;
    }

 
    public void setNoOfUnitsBuying(int noOfUnitsBuying) {
        this.noOfUnitsBuying = noOfUnitsBuying;
    }


 

    public double getSubtotal() {

        return item.getPrice() * noOfUnitsBuying;

    }


    /*
    According to the textbook you need to get: The getTax method should return the amount of sales tax on the purchase.
    The sales tax rate is 6 percent of a retail sale.
     */
    public double getTax() {

        return getSubtotal() * 0.06;

    }


    /*
    According to the textbook you need to get: The getTotal method should return the total of the sale, which is the
    subtotal plus the sales tax.
     */
    public double getTotal() {

        return getSubtotal() + getTax();
    }
}
