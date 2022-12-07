import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        final List<String> cityNames = asList("Milano", "Napoli", "Canelli");

        /* Quando si prova ad aggiungere un elemento alla fine della lista genera un errore perchè stiamo
         * cercando di aggiungere un elemento stringa in una lista immutabile e quindi non modificabile.
         *
         * cityNames.add("Roma");
         */

        cityNames.set(1, "Tegucigalpa");
        System.out.println(cityNames);

        List<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Tarquinio il Superbo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marzio");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");

        System.out.println(kingsOfRome);

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);

        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        System.out.println(Arrays.toString(kingsOfRomeArray));

    }
}
