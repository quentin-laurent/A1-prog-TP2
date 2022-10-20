import java.util.Scanner;

public class Main
{
    public static void discriminant()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valeur de a:");
        int a = scanner.nextInt();

        System.out.println("Valeur de b:");
        int b = scanner.nextInt();
        System.out.println("Valeur de c:");
        int c = scanner.nextInt();

        int delta = (int) (Math.pow(b, 2) - 4 * a * c);

        int res1;
        int res2;

        if (delta < 0)
        {
            System.out.println("Delta < 0:");
            System.out.println("x0 = (" + (-1*b + " + i√" + delta*(-1) + ")/" + (2*a)));
            System.out.println("x1 = (" + (-1*b + " - i√" + delta*(-1) + ")/" + (2*a)));
        }

        else if(delta == 0)
            System.out.println("Delta = 0: x0 = " + (-1*b) + "/" + (2*a));
        else
        {
            System.out.println("Delta > 0:");
            System.out.println("x0 = " + (-1*b + Math.sqrt(delta)) + "/" + (2*a));
            System.out.println("x1 = " + (-1*b - Math.sqrt(delta)) + "/" + (2*a));
        }
    }

    public static void parite()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir un entier:");
        int val = sc.nextInt();
        StringBuilder res = new StringBuilder(val + " est ");

        if(val % 2 != 0)
            res.append("im");
        res.append("pair");

        System.out.println(res.toString());
    }

    public static void minmax()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un entier:");
        int a = sc.nextInt();
        System.out.println("Saisir un deuxieme entier:");
        int b = sc.nextInt();

        StringBuilder res = new StringBuilder("Max= ");

        if(a>b)
            res.append(a).append("\nMin= ").append(b);
        else
            res.append(b).append("\nMin= ").append(a);

        System.out.println(res.toString());
    }

    public static void egaliteStr()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir une chaine de caracteres s1: ");
        String s1 = sc.nextLine();
        System.out.println("Saisir une chaine de caracteres s2:");
        String s2 = sc.nextLine();

        if(s1.equals(s2))
            System.out.println("s1 = s2");
        else
            System.out.println("s1 != s2");
    }

    public static void factorielle()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un entier positif ou nul:");
        int n = scanner.nextInt();

        int factorielle = 1;
        for (int i = 1; i < n; i++)
            factorielle *= i+1;

        System.out.println(n + "! = " + factorielle);
    }

    public static void countdown()
    {
        for(int i = 10; i >= 0; i--)
            System.out.println(i);
        System.out.println("boom");
    }

    public static void carres()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un entier: ");
        int x = sc.nextInt();

        StringBuilder res = new StringBuilder();
        res.append(x).append('\t').append(x*x);
        System.out.println(res.toString());
    }

    public static void tableMultiplication()
    {
        for(int i = 1; i <= 10; i++)
        {
            for(int j = 1; j <= 10; j++)
            {
                System.out.print((i*j));
                System.out.print('\t');
            }
            System.out.println();
        }
    }

    public static void division()
    {
        Scanner sc = new Scanner(System.in);
        int dividende;
        int diviseur;

        System.out.println("Saisir le dividende:");
        dividende = sc.nextInt();

        do
        {
            System.out.println("Saisir le diviseur:");
            diviseur = sc.nextInt();
        } while(diviseur == 0);

        System.out.printf("%d/%d=%d%n", dividende, diviseur, dividende/diviseur);
    }

    private static void regle()
    {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Saisir un entier positif non-nul:");
            n = sc.nextInt();
        } while(n <= 0);

        for(int i = 0; i <= n; i++)
        {
            if(i % 10 == 0)
                System.out.print('|');
            else
                System.out.print('-');
        }
    }

    public static void nombrePremier()
    {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Saisir un entier positif non-nul:");
            n = sc.nextInt();
        } while(n <= 0);

        int i = 2;
        boolean premier = true;
        while(i < n && premier)
        {
            premier = ((n%i) != 0);
            i++;
        }

        StringBuilder res = new StringBuilder().append(n);
        if(premier)
            res.append(" est ");
        else
            res.append(" n'est pas ");
        res.append("un nombre premier");

        System.out.println(res.toString());
    }

    public static int[] initialisationTableau()
    {
        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier:");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }

        int min = tableau[0];
        int max = tableau[0];
        int somme = 0;
        StringBuilder elementsPairs = new StringBuilder("Elements pairs: ");
        StringBuilder elementsIndicePair = new StringBuilder("Elements d'indice pair: ");

        for(int i = 0; i < tableau.length; i++)
        {
            if(tableau[i] < min)
                min = tableau[i];
            if(tableau[i] > max)
                max = tableau[i];
            somme += i;
            if(tableau[i]%2 == 0)
                elementsPairs.append(tableau[i]).append(" ");
            if(i%2 == 0)
                elementsIndicePair.append(tableau[i]).append(" ");
        }

        System.out.printf("Mininmum: %d%n", min);
        System.out.printf("Maximum: %d%n", max);
        System.out.println(elementsPairs.toString());
        System.out.println(elementsIndicePair.toString());

        return tableau;
    }

    public static int[] inverseTableau(int[] tableau)
    {
        int[] res = new int[20];
        int length = tableau.length;
        for(int i = 0; i < length; i++)
            res[i] = tableau[(length - 1) - i];

        return res;
    }

    public static void afficherTableau(int[] tab)
    {
        StringBuffer res = new StringBuffer("[");
        for(int i = 0; i < tab.length; i++)
           res.append(tab[i]).append(",");
        res.deleteCharAt(res.length()-1);
        res.append("]");
        System.out.println(res.toString());
    }

    public static void menu()
    {
        String s = "Quel exercice ? Saisissez :\n" +
                "1. Discriminant\n" +
                "2. Parité d’un nombre\n" +
                "3. Calcul d’extremum\n" +
                "4. Égalité entre chaînes de caractères\n" +
                "5. Factorielle\n" +
                "6. Compte à rebous\n" +
                "7. Valeurs de carrés\n" +
                "8. Table de multiplication\n" +
                "9. Division d’entiers\n" +
                "10. Règle graduée\n" +
                "11. Nombres premiers\n" +
                "12. Manipulations sur un tableau";

        Scanner sc = new Scanner(System.in);
        int val;

        do {
            System.out.println(s);
            val = sc.nextInt();
        } while(val < 1 || val > 12);

        switch(val)
        {
            case 1:
                discriminant();
                break;
            case 2:
                parite();
                break;
            case 3:
                minmax();
                break;
            case 4:
                egaliteStr();
                break;
            case 5:
                factorielle();
                break;
            case 6:
                countdown();
                break;
            case 7:
                carres();
                break;
            case 8:
                tableMultiplication();
                break;
            case 9:
                division();
                break;
            case 10:
                regle();
                break;
            case 11:
                nombrePremier();
                break;
            case 12:
                int[] tab = initialisationTableau();
                afficherTableau(tab);
                tab = inverseTableau(tab);
                afficherTableau(tab);
                break;
        }
    }

    public static void main(String[] args)
    {
        menu();
    }
}
