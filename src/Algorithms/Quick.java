package Algorithms;

public class Quick {/*
    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);   // Устранение зависимости от входных данных
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if(hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        // Разбиение на a[lo..i-1], a[i], a[i+1..hi]
        int i = lo, j = hi + 1;
        Comparable v = a[lo];
        while(true) {
            while(less(a[++i], v)) if(i==hi) break;
            while(less(v, a[--j])) if(j==lo) break;
            if(i >= j) break;
            exch(a, lo, j); // Помещение v = a[j] на свое место
            return j;   // так что a[lo..j-1] <= a[j] <= a[j+1..hi]
        }
    }*/
}
