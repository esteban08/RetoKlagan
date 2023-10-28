package co.com.klagan;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<pet> petsData = new ArrayList<>();
        petsData.add(new pet(1, "William"));
        petsData.add(new pet(2, "Pedro"));
        petsData.add(new pet(3, "William"));
        petsData.add(new pet(4, "Floyd"));
        petsData.add(new pet(5, "William"));
        petsData.add(new pet(6, "Pedro"));
        petsData.add(new pet(7, "Floyd"));
        petsData.add(new pet(8, "William"));

        PetCollection petCollection = new PetCollection(petsData);
        Map<String, Integer> result = petCollection.countSameNames();

        System.out.println(result);
    }
}