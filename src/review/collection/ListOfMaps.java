package review.collection;

import java.util.*;

public class ListOfMaps {

    public static void main(String[] args) {
        List<Map<String, String>> listExpected = new ArrayList<>();

        Map<String, String> mapExpected1 = new LinkedHashMap<>();
        mapExpected1.put("A", "1");
        mapExpected1.put("B", "2");
        mapExpected1.put("C", "3");

        Map<String, String> mapExpected2 = new LinkedHashMap<>();
        mapExpected2.put("X", "1");
        mapExpected2.put("Y", "2");
        mapExpected2.put("Z", "3");

        listExpected.add(mapExpected1);
        listExpected.add(mapExpected2);

        List<Map<String, String>> listActual = new ArrayList<>();

        Map<String, String> mapActual1 = new LinkedHashMap<>();
        mapActual1.put("A", "1");
        mapActual1.put("B", "2");
        mapActual1.put("C", "3");

        Map<String, String> mapActual2 = new LinkedHashMap<>();
        mapActual2.put("D", "4");
        mapActual2.put("E", "5");
        mapActual2.put("F", "6");

        Map<String, String> mapActual3 = new LinkedHashMap<>();
        mapActual3.put("G", "7");
        mapActual3.put("H", "8");
        mapActual3.put("K", "9");

        listActual.add(mapActual1);
        listActual.add(mapActual2);
        listActual.add(mapActual3);

        boolean compareListOfMaps = listActual.containsAll(listExpected);
        System.out.println(compareListOfMaps);


    }

}



























