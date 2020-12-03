package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //given
        Random random = new Random();
        Library library = new Library("Library 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.addBook(new Book("Title " + n, "Author" + n, LocalDate.of(random.nextInt(20)+2000, random.nextInt(12)+1, random.nextInt(28)+1))));


        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Title " + 11, "Author" + 11, LocalDate.of(random.nextInt(20)+2000, random.nextInt(12)+1, random.nextInt(28)+1)));

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        assertEquals(11, library.getBooks().size());
        assertEquals(11, clonedLibrary.getBooks().size());
        assertEquals(10, deepClonedLibrary.getBooks().size());
        assertEquals(library.getBooks(), clonedLibrary.getBooks());
        assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());


    }
}