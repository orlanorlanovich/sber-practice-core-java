package day3_maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SorterTest {

    private Sorter sorter = new Sorter();

    @Test
    void testBubbleSort() {
        int[] input = {5, 2, 8, 1, 9};
        int[] expected = {1, 2, 5, 8, 9};
        assertArrayEquals(expected, sorter.bubbleSort(input));
    }

    @Test
    void testBubbleSortSorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sorter.bubbleSort(input));
    }

    @Test
    void testQuickSort() {
        int[] input = {5, 2, 8, 1, 9};
        int[] expected = {1, 2, 5, 8, 9};
        assertArrayEquals(expected, sorter.quickSort(input));
    }

    @Test
    void testQuickSortSorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sorter.quickSort(input));
    }
}