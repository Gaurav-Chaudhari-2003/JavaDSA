package android.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Mutable Arrays (Dynamic Arrays)
        ArrayList<String> names = new ArrayList<>();
//        ArrayList<Integer> numbers = new ArrayList<>();
        names.add("A");
        names.add("B");
        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.size());
//        names.clear();

        names.remove("A");
//        names.remove(4);
        System.out.println(names.getFirst());
        System.out.println(names.contains("B"));
        System.out.println(names.isEmpty());
        names.add("A");
        System.out.println(names.indexOf("A"));
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

//        names.forEach(System.out::println);
//        for (String name : names) System.out.println(name);
        for(int i = 0; i<names.size(); i++) {
            System.out.println(names.get(i));
        }


        //Maps
        Map<String, String> emailList = new HashMap<>();
        emailList.put("Gaurav", "chaudharigaurav177@gmail.com");
        emailList.put("Jay", "chaudharigaurav179@gmail.com");
        System.out.println(emailList.get("Gaurav"));
        System.out.println(emailList.size());
        emailList.remove("Jay");
        System.out.println(emailList.size());
        System.out.println(emailList.containsKey("Jay"));
        System.out.println(emailList.containsValue("chaudharigaurav177@gmail.com"));
        emailList.put("Jay", "chaudharigaurav179@gmail.com");
        System.out.println(emailList.keySet());
        System.out.println(emailList.values());


        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("Gaurav", 46));
        students.add(new Students("jay", 47));
        for(Students s: students) System.out.println(s.getName() + "-" + s.getId());
    }
}
