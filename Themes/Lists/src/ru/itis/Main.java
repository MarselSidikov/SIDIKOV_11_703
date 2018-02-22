package ru.itis;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	    List<String> list = new ArrayList<>();
	    list.add("Даша");
	    list.add("Ирина");
	    list.add("Ильяс, просто так");
	    list.add("Анита");
        list.add("Денис");
        list.add("Марсель");

//        Iterator<String> iterator = list.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        for (String name : list) {
            System.out.println(name);
        }
    }
}
