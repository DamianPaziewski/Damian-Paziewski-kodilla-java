package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        //creating the books
        Book book1 = new Book("Lord of the rings", "J.R.R. Tolkien", LocalDate.of(1954, Month.JULY, 29));
        Book book2 = new Book("The Godfather", "Mario Puzo", LocalDate.of(1969, Month.MARCH, 9));
        Book book3 = new Book("The Shining", "Stephen King", LocalDate.of(1977, Month.JANUARY, 28));
        Book book4 = new Book("Da Vinci Code", "Dan Brown", LocalDate.of(2000, Month.AUGUST, 10));

        //creating the library and assigning the books
        Library library = new Library("Library No 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        //making a shallow clone of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library No 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library No 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book3);

        //Then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}