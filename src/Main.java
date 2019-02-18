

import java.io.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int ilosc = 0;
        HelperCalk helperCalk = new HelperCalk ();
        File file = new File ("producty.csv");
        file.createNewFile ();
        Scanner scan = new Scanner (file);
        int iloscLinijek = 0;
        while (scan.hasNextLine ()) {
            scan.nextLine ();
            iloscLinijek++;
        }
        System.out.println (" iloscLinijek " + iloscLinijek);
        Product[] products = new Product[3];
        Scanner scanner = new Scanner (file);
        while (scanner.hasNextLine ()) {
            for (int i = 0; i < products.length; i++) {
                String nazwa = scanner.next ();
                String producent = scanner.next ();
                String cenaString = scanner.next ();
                double cena = Double.parseDouble (cenaString);
                Product product = new Product (nazwa, producent, cena);
                products[i] = product;
                System.out.println (products[i]);
            }
            System.out.println (" cena maksymalna wynosi " + helperCalk.maxCena (products));
            System.out.println ("suma cen wszystkich produktów : " + helperCalk.sumaCen (products));
        }

    }
}

