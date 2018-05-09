package zubkov.loadtest;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Lists
{
    public static void main(String[] args )
    {
        Date startTime = new Date();
        List<String> listArray = new ArrayList<>();
        int k=100000;
        for(int i = 0; i < k; i++) {
            listArray.add("Lorem ipsum dolor sit amet" + i);

        }
        Date finishTime = new Date();
        long resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("Array "+ resultTime);

        startTime = new Date();
        List<String> listLinked = new LinkedList<>();

        for(int i = 0; i < k; i++) {
            listLinked.add("Lorem ipsum dolor sit amet" + i);
        }
        finishTime = new Date();
        resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("Linked " + resultTime);

        System.out.println("Поиск");
        startTime = new Date();
        for(int i = 0; i < k; i++) {
            listArray.get(i);
        }
        finishTime = new Date();
        resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("Array " + resultTime);

        startTime = new Date();
        for(int i = 0; i < k; i++) {
            listLinked.get(i);
        }
        finishTime = new Date();
        resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("Linked " + resultTime);

        System.out.println("Удаление");
        startTime = new Date();
        for(int i = 0; i < k; i++) {
            listArray.remove(0);
        }
        finishTime = new Date();
        resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("Array " + resultTime);

        startTime = new Date();
        for(int i = 0; i < k; i++) {
            listLinked.remove(0);
        }
        finishTime = new Date();
        resultTime = finishTime.getTime() - startTime.getTime();
        System.out.println("Linked " + resultTime);



    }
}
