package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class BookTest {

    @Test
    public void getNameTest(){
       Book book;
        book = new Book("Programming in C");

        String expected="Programming in C";
        String actual =  book.name;
        assertEquals(expected,actual);
    }
}
