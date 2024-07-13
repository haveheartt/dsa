class BinarySearchList {

    public static boolean bs_list(int[] haystack, int needle) {
        int lo = 0;
        int hi = haystack.length;

        do {
            int m = (int) Math.floor(lo + (hi - lo) / 2);
            int v = haystack[m];

            if (v == needle) {
                return true;
            } else if (v > needle) {
                hi = m;
            } else {
                lo = m + 1;
            }
        } while (lo < hi);
        return false;
    }

    public static class QuickSort {

        public void qs(int[] arr, int lo, int hi) {
            if (lo >= hi) {
                return;
            }

            int pivotIdx = this.partition(arr, lo, hi);

            qs(arr, lo, pivotIdx - 1);
            qs(arr, pivotIdx + 1, hi);
        }

        public int partition(int[] arr, int lo, int hi) {

            int pivot = arr[hi];
            int idx = lo - 1;

            for (int i = lo; i < hi; ++i) {
                if (arr[i] <= pivot) {
                    ++idx;
                    int tmp = arr[i];
                    arr[i] = arr[idx];
                    arr[idx] = tmp;
                }
            }

            ++idx;
            arr[hi] = arr[idx];
            arr[idx] = pivot;

            return idx;
        }

        public void quick_sort(int[] arr) {
            this.qs(arr, 0, arr.length - 1);
        }
    }
}
