package zubkov.loadtest;

import java.util.*;

public class Sets {
    public static void main(String[] args )
    {
        Date startTime = new Date();
        Set<String> hashSet = new HashSet<>();
        int k=100000;
        for(int i = 0; i < k; i++) {
            hashSet.add("Lorem ipsum dolor sit amet" + i);

        }
        Date finishTime = new Date();
        long resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("HashSet "+ resultTime);

        startTime = new Date();
        Set<String> treeSet = new TreeSet<>();

        for(int i = 0; i < k; i++) {
            treeSet.add("Lorem ipsum dolor sit amet" + i);
        }
        finishTime = new Date();
        resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("TreeSet " + resultTime);

        System.out.println("Поиск");
        startTime = new Date();
        Iterator<String> it = hashSet.iterator();
        while(it.hasNext()){
            it.next();
        }
        finishTime = new Date();
        resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("HashSet " + resultTime);

        startTime = new Date();
        it = treeSet.iterator();
        while(it.hasNext()){
            it.next();
        }
        finishTime = new Date();
        resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("TreeSet " + resultTime);

        System.out.println("Удаление");
        startTime = new Date();
        it = hashSet.iterator();
        String element = null;
        while(it.hasNext()){
            element = it.next();
            it.remove();
        }
        finishTime = new Date();
        resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("HashSet " + resultTime);

        startTime = new Date();
        it = treeSet.iterator();
        while(it.hasNext()){
            element = it.next();
            it.remove();
        }
        finishTime = new Date();
        resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("TreeSet " + resultTime);



    }
}
