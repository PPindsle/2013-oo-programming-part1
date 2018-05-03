public class Product {
    private String nameAtStart;
    private double priceAtStart;
    private int amountAtStart;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        /*Product banana = new Product("Banana",1.1,13);
        banana.printProduct();*/
        this.nameAtStart = nameAtStart;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }
    public void printProduct() {
        System.out.println(this.nameAtStart + ", price " + this.priceAtStart + ", amount " + this.amountAtStart);
    }
}
