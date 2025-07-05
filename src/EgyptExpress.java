import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EgyptExpress implements ShippingService {
    public void shipItems(ArrayList<Shippable> items) {
        HashMap<Shippable, Integer> map = new HashMap<>();
        double totalWeight = 0d;
        for (Shippable item : items) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        for (Map.Entry<Shippable, Integer> entry : map.entrySet()) {
            Shippable item = entry.getKey();
            Integer quantity = entry.getValue();
            System.out.println(quantity + "x " + item.getName());
            totalWeight += item.getWeight();
        }
        totalWeight = Math.round(totalWeight * 100d) / 100d;
        System.out.println("Total weight is " + totalWeight + "KG");
    }
}
