package com.exam.nyat;

import com.exam.nyat.utils.ArrayMultipleUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ArrayMultipleUtilsTest {


    ArrayMultipleUtils testUtils;

    @Before
    public void setUp(){
        testUtils = mock(ArrayMultipleUtils.class);
    }

    @Test
    public void initArrayTest(){
        Map<Integer, String> multipleMapTest = new HashMap<Integer, String>();
        multipleMapTest.put(1,"");
        multipleMapTest.put(2,"");
        multipleMapTest.put(3,"");
        multipleMapTest.put(4,"");
        multipleMapTest.put(5,"");
        multipleMapTest.put(6,"");
        multipleMapTest.put(7,"");
        multipleMapTest.put(8,"");
        multipleMapTest.put(9,"");
        multipleMapTest.put(10,"");
        multipleMapTest.put(11,"");
        multipleMapTest.put(12,"");
        multipleMapTest.put(13,"");
        multipleMapTest.put(14,"");
        multipleMapTest.put(15,"");
        when(testUtils.initArray(15)).thenReturn(multipleMapTest);
        assertEquals(testUtils.initArray(15), multipleMapTest);
    }

    @Test
    public void updatingArrayTest(){
        Map<Integer, String> multipleMapTest = new HashMap<Integer, String>();
        multipleMapTest.put(1,"");
        multipleMapTest.put(2,"");
        multipleMapTest.put(3,"Foo");
        multipleMapTest.put(4,"");
        multipleMapTest.put(5,"");
        multipleMapTest.put(6,"Foo");
        multipleMapTest.put(7,"");
        multipleMapTest.put(8,"");
        multipleMapTest.put(9,"Foo");
        multipleMapTest.put(10,"");
        multipleMapTest.put(11,"");
        multipleMapTest.put(12,"Foo");
        multipleMapTest.put(13,"");
        multipleMapTest.put(14,"");
        multipleMapTest.put(15,"Foo");
        when(testUtils.updatingArray(3, "Foo", multipleMapTest)).thenReturn(multipleMapTest);
        assertEquals(testUtils.updatingArray(3, "Foo", multipleMapTest), multipleMapTest);
    }
}
