package gestion.armas.policia3f;

public class Main {
    public static void main(String[] args) {
        Policia policia1 = new Policia("Juan", "Pérez", 123);
        ArmaCorta armaCorta1 = new ArmaCorta(policia1, 15, 150, "Glock", 9, "EN USO", true);
        ArmaLarga armaLarga1 = new ArmaLarga(policia1, 30, 800, "Remington", 12, "EN USO", true, "Francotirador", 4);
        ArmaLarga armaLarga2 = new ArmaLarga(policia1, 20, 600, "Barrett", 12, "NUEVA", false, "Infantería", 3);

        System.out.println(armaCorta1.enCondiciones()); // true
        System.out.println(armaCorta1.disparaMas200m()); // false
        System.out.println(armaLarga1.enCondiciones()); // true
        System.out.println(armaLarga1.compareTo(armaLarga2)); // 1 (armaLarga1 es mayor que armaLarga2)
    }
}
