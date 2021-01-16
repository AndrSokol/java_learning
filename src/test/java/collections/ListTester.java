package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListTester {

    private final static String ARRAY_LIST = "ArrayList";
    private final static String LINKED_LIST = "LinkedList";

    List<Integer> arrList = new ArrayList<>();
    List<Integer> linkList = new LinkedList<>();

    @BeforeEach
    void fillLists(){
        for (int i = 0; i < 10000; i++) {
            arrList.add(i);
            linkList.add(i);
        }
    }

    @Test
    void putElements(){
        List<Integer> emptyArrayList = new ArrayList<>();
        List<Integer> emptyLinkedList = new LinkedList<>();

        long arrStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            emptyArrayList.add(i);
        }
        long arrStop = System.nanoTime();
        printResult(ARRAY_LIST, arrStop - arrStart);

        long linkStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            emptyLinkedList.add(i);
        }
        long linkStop = System.nanoTime();
        printResult(LINKED_LIST, linkStop - linkStart);
    }

    @Test
    void putMiddleTest(){
        long arrStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrList.add(5000, i);
        }
        long arrStop = System.nanoTime();
        printResult(ARRAY_LIST, arrStop - arrStart);

        long linkStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkList.add(5000, i);
        }
        long linkStop = System.nanoTime();
        printResult(LINKED_LIST, linkStop - linkStart);
    }

    @Test
    void putZeroElementTest(){
        long arrStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrList.add(0, i);
        }
        long arrStop = System.nanoTime();
        printResult(ARRAY_LIST, arrStop - arrStart);

        long linkStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkList.add(0, i);
        }
        long linkStop = System.nanoTime();
        printResult(LINKED_LIST, linkStop - linkStart);
    }

    @Test
    void putLastElementTest(){
        long arrStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrList.add(i);
        }
        long arrStop = System.nanoTime();
        printResult(ARRAY_LIST, arrStop - arrStart);

        long linkStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkList.add(i);
        }
        long linkStop = System.nanoTime();
        printResult(LINKED_LIST, linkStop - linkStart);
    }

    @Test
    void getElementTest(){
        long arrStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrList.get(5000);
        }
        long arrStop = System.nanoTime();
        printResult(ARRAY_LIST, arrStop - arrStart);

        long linkStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkList.get(5000);
        }
        long linkStop = System.nanoTime();
        printResult(LINKED_LIST, linkStop - linkStart);
    }

    private void printResult(String listType, long result){
        System.out.println(String.format("Result for %s: %s", listType, result));
    }
}
