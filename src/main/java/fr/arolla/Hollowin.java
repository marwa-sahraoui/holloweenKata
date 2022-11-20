package fr.arolla;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hollowin {


    public static String showHolowinResponse(int children, List<List<String>> listOfPaquets) {
        if (children > listOfPaquets.size()) {
            return "Trick or treat!";
        }

        List<String> paquetFiltredOnlyCandy;
        List<List<String>> bagFiltredOnlyCandy = new ArrayList<>();

        int maxAmount = 2;

        for (List<String> paquet : listOfPaquets) {

            paquetFiltredOnlyCandy = new ArrayList<>();

            for (int i = 0; i < paquet.size(); i++) {
                if (paquet.size() < 2 || paquet.contains("bomb")) {
                    return "Trick or treat!";
                }
                if (Objects.equals(paquet.get(i), "candy")) {
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
                return "Trick or treat!";
            }
        }

        return "Thank you, strange uncle!";
    }
}
