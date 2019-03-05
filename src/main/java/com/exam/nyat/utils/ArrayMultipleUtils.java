package com.exam.nyat.utils;

import java.util.HashMap;
import java.util.Map;

public class ArrayMultipleUtils {

    public Map<Integer, String> initArray(int arraySize) {
        Map<Integer, String> multipleMapArray = new HashMap<Integer, String>();
        for (int i = 0; i <= arraySize; i++) {
            multipleMapArray.put(i,new String());
        }
        return multipleMapArray;
    }

    public Map<Integer, String> updatingArray(int multiple, String variable, Map<Integer, String> multipleMapArray){
        for (Map.Entry<Integer, String> entry : multipleMapArray.entrySet()) {
            if(entry.getKey() % multiple == 0) {
                multipleMapArray.replace(entry.getKey(), entry.getValue().concat(variable));
            }
        }

        return multipleMapArray;
    }
}
