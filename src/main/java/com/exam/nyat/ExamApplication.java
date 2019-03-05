package com.exam.nyat;

import com.exam.nyat.utils.ArrayMultipleUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Nyam Exam
 * @author Harif Velarde Ortiz
 *
 */
public class ExamApplication {
    public static void main(String[] args) {
        ArrayMultipleUtils utils = new ArrayMultipleUtils();
        Map<Integer, String> multipleMap;
        multipleMap = utils.initArray(100);
        multipleMap = utils.updatingArray(3, "Foo", multipleMap);
        multipleMap = utils.updatingArray(5, "Bar", multipleMap);
        multipleMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
    }
}
