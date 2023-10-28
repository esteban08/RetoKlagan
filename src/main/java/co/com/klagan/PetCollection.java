package co.com.klagan;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetCollection {
    private List<pet> pets;

    public PetCollection(List<pet> pets) {
        this.pets = pets;
    }

    public Map<String, Integer> countSameNames() {
        Map<String, Integer> nameCounts = new HashMap<>();
        for (pet pet : pets) {
            String name = pet.getName();
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
        }
        return nameCounts;
    }
}