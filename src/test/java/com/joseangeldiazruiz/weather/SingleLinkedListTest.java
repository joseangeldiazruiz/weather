package com.joseangeldiazruiz.weather;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class SingleLinkedListTest {

    SingleLinkedList<Integer> list;

    @Before
    public void setup() {
        list = new SingleLinkedList<>();
    }

    @Test
    public void fifthElementFromTheEnd(){
        IntStream.range(0,10).forEach(list::add);
        assertEquals(new Integer(5), list.fifthElementFromTheEnd().get());
    }

    @Test
    public void fifthElementFromTheEnd_emptyList(){
        Optional<Integer> element = list.fifthElementFromTheEnd();
        assertFalse(element.isPresent());
    }

    @Test
    public void fifthElementFromTheEnd_listWithLessThanFiveElements(){
        IntStream.range(0,4).forEach(list::add);
        assertFalse(list.fifthElementFromTheEnd().isPresent());
    }

    @Test
    public void fifthElementFromTheEnd_listWithFiveElements(){
        IntStream.range(0,5).forEach(list::add);
        assertEquals(new Integer(0), list.fifthElementFromTheEnd().get());
    }






}