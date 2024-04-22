import java.util.LinkedList;

public class CosCumparaturi {
    private LinkedList<Produs> listaProduse;

    public CosCumparaturi() {
        listaProduse = new LinkedList<>();
    }

    public void adaugaProdus(Produs produs) {
        listaProduse.add(produs);
    }

    public double calculeazaTotal() {
        double total = 0;
        for (Produs produs : listaProduse) {
            total += produs.getPret();
        }
        return total;
    }

    public static void testCosCumparaturi() {
        CosCumparaturi cos = new CosCumparaturi();

        cos.adaugaProdus(new Produs("Manusi de box", 600));
        cos.adaugaProdus(new Produs("Sac de box", 1899));
        cos.adaugaProdus(new Produs("Aparatoare", 50));

        System.out.println("Totalul prețurilor: " + cos.calculeazaTotal());
    }
}
