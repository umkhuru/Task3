package za.ac.cput.project3;

import java.util.*;

/**
 * Created by student on 2016/03/13.
 */
public class CollectionImpl implements CollectionInterface {

    @Override
    public List<String> names() {

        List names = new ArrayList();
        names.add("Ethon");
        names.add("Owen");
        names.add("Breyten");

        return names;
    }

    @Override
    public Set<String> clours() {

        Set colours = new HashSet();
        colours.add("Blue");
        colours.add("Black");
        colours.add("Red");

        return colours;
    }

    @Override
    public Map<String, String> brands() {

        Map brands = new HashMap();
        brands.put("Nike","AirMax");
        brands.put("Puma","BMW");
        brands.put("Jordan","Air");

        return brands;
    }
}
