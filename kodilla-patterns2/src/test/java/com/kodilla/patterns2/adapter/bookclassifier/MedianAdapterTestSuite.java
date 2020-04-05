package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookA = new HashSet<>();
        bookA.add(new Book("Adam Mickiewicz", "Pan Tadeusz", 1998, "AF0001"));
        bookA.add(new Book("Henryk Sienkiewicz", "Potop", 1980, "BZ0002"));
        bookA.add(new Book("Jan Brzechwa", "Akademia Pana Kleksa", 2000, "KS0021"));
        bookA.add(new Book("Aleksander Fredro", "Zemsta", 1977, "CF0256"));

        //When
        int median = medianAdapter.publicationYearMedian(bookA);

        //Then
        assertEquals(1998, median);
    }
}