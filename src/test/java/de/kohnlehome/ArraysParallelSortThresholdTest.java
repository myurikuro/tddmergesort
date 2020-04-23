package de.kohnlehome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ArraysParallelSortThresholdTest {

    private ISortAlgorithm arraysParallelSort;
    IMerger merger = new Merger();

    @BeforeEach
    public void init() {
        //Arrange
        arraysParallelSort = new ParallelSortThreshold(merger);
    }

    @Test
    public void test(){
        int[] unsorted = {5,3,1,2,4};
        //Act
        int[] sorted = arraysParallelSort.sort(unsorted);

        //Assert
        int[]expected = {1,2,3,4,5};
        assertThat(sorted).isEqualTo(expected);
    }
}
