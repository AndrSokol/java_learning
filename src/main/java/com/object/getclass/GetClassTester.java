package com.object.getclass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GetClassTester {

    public static void main(String[] args) {
        GetClassTester getClassTester = new GetClassTester();
        System.out.println(getClassTester.getClass());

        List<String> arrList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println(arrList.getClass());
        System.out.println(linkedList.getClass());
    }
}
