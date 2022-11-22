package fr.arolla;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hollowin {


    public static final String TRICK_OR_TREAT = "Trick or treat!";
    public static final String THANK_YOU_STRANGE_UNCLE = "Thank you, strange uncle!";
    public static final int MAX_AMOUNT = 2;
    public static final String BOMB = "bomb";
    public static final String CANDY = "candy";

    public static String showHolowinResponse(int children, List<List<String>> listOfPaquets) {

        if (children > listOfPaquets.size()) {
            return TRICK_OR_TREAT;
        }

        List<String> paquetFiltredOnlyCandy;
        List<List<String>> bagFiltredOnlyCandy = new ArrayList<>();

        int maxAmount = MAX_AMOUNT;

        for (List<String> paquet : listOfPaquets) {
            paquetFiltredOnlyCandy = new ArrayList<>();

            for (int i = 0; i < paquet.size(); i++) {

                if (paquet.size() < 2 || paquet.contains(BOMB)) {
                    return TRICK_OR_TREAT;
                }
                if (Objects.equals(paquet.get(i), CANDY)) {
                    paquetFiltredOnlyCandy.add(paquet.get(i));
                }
            }

            bagFiltredOnlyCandy.add(paquetFiltredOnlyCandy);

            if (maxAmount < paquetFiltredOnlyCandy.size()) {
                maxAmount = paquetFiltredOnlyCandy.size();
            }
        }

        for (List<String> paquet : bagFiltredOnlyCandy) {
            if (paquet.size() < maxAmount) {
                return TRICK_OR_TREAT;
            }
        }

        return THANK_YOU_STRANGE_UNCLE;
    }
}
