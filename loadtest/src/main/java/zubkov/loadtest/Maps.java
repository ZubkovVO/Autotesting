package zubkov.loadtest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Date startTime = new Date();
        Map<Integer, String> hashMap = new HashMap<>();
        int k = 100000;
        for (int i = 0; i < k; i++) {
            hashMap.put(i,"Lorem ipsum dolor sit amet" + i);

        }
        Date finishTime = new Date();
        long resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("hashMap " + resultTime);

        startTime = new Date();
        Map<Integer, String> treeMap = new TreeMap();

        for (int i = 0; i < k; i++) {
            treeMap.put(i,"Lorem ipsum dolor sit amet" + i);
        }
        finishTime = new Date();
        resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("treeMap " + resultTime);

        System.out.println("Поиск");
        startTime = new Date();
        for (int i = 0; i < k; i++) {
            hashMap.get(i);
        }
        finishTime = new Date();
        resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("hashMap " + resultTime);

        startTime = new Date();
        for (int i = 0; i < k; i++) {
            treeMap.get(i);
        }
        finishTime = new Date();
        resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("treeMap " + resultTime);

        System.out.println("Удаление");
        startTime = new Date();
        for (int i = 0; i < k; i++) {
            hashMap.remove(i);
        }
        finishTime = new Date();
        resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("hashMap " + resultTime);

        startTime = new Date();
        for (int i = 0; i < k; i++) {
            treeMap.remove(i);
        }
        finishTime = new Date();
        resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("treeMap " + resultTime);
    }
}