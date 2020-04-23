package de.kohnlehome;

public class ParallelSortThreshold implements ISortAlgorithm {
    private IMerger merger;

    public ParallelSortThreshold(IMerger merger) {
        this.merger = merger;
    }

    @Override
    public int[] sort(int[] unsortedArray) {
        SortierenTaskThreshold sortierenTaskThreshold = new SortierenTaskThreshold(unsortedArray, merger, 1000);
        sortierenTaskThreshold.invoke();
        return sortierenTaskThreshold.join();
    }
}
