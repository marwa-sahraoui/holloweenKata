package fr.arolla;

import java.util.List;

public class Hollowin {

    public static String showHolowinResponse(int children, List<List<String>> listOfPaquets) {
    for(List<String> paquet: listOfPaquets){
        if(paquet.contains("bomb")){
            return "Trick or treat!";
        }
    }

        return "Thank you, strange uncle!";
    }
}
