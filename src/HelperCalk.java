

public class HelperCalk {
    private double maxWartość;
    private double sum;
    private String prod;

    Product[] products;

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public double maxCena(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (maxWartość < products[i].cena) {
                maxWartość = products[i].cena;
            }
        }
        return maxWartość;
    }

    public double sumaCen(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            sum = sum + products[i].cena;
        }
        return sum;
    }

//    public String producentPopular(Product[] products) {
//        for (int i = 0; i < products.length; i++)
//            if (products[i].producent == products[i].producent) {
//                prod = prod + products[i].producent;
//
//            }
//        return prod;
//    }
}