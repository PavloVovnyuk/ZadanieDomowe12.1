

public class Product {
    String nazwa;
    String producent;
    double cena;

    public Product(String nazwa, String producent, double cena) {
        this.nazwa = nazwa;
        this.producent = producent;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nazwa='" + nazwa + '\'' +
                ", producent='" + producent + '\'' +
                ", cena=" + cena +
                '}';
    }
}

