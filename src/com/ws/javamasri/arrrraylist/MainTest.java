package com.ws.javamasri.arrrraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class MainTest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Master Java");
        list.add("Master System Design");
        list.add("Master Rust");

        list.add(1, "Master Game Dev");
        System.out.println(list);

        list.set(0, "Master Java Java");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("===> " + iterator.next());
        }

    }
}
