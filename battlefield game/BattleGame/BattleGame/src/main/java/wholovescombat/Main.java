package wholovescombat;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Absaka solder_1 = new Absaka(4, 2, 20);
        Carmika solder_2 = new Carmika(3, 5, 15, false, 0, false);
        combat(solder_1, solder_2);
    }

    private static void combat(Absaka solder_1, Carmika solder_2) {
    }

    Characters c1 = new Carmika("r2u2"); // upcast
    Absaka c2 = new Absaka("u2r2");
    {
        Carmika c3 = new Carmika(0, 0, 0, false, 0, false);
        System.out.println(c1.attack()); //
        System.out.println(c2.attack());
        System.out.println(c3.attack());
        c1 = new Characters("a2b2"); // upcast
        System.out.println(c1.attack());

        Characters c4 = new Characters("u2u2");
        System.out.println(c4.attack());
        {

        }

    }
}
