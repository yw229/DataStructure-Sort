Three Q(nlogn) Sort Methods

I. Merge sort is based on the divide-and-conquer paradigm. Its worst-case running time has a lower order of growth than insertion sort. Since we are dealing with subproblems, we state each subproblem as sorting a subarray A[p .. r]. Initially, p = 1 and r = n, but these values change as we recurse through subproblems.

To sort A[p .. r]:

1. Divide Step

If a given array A has zero or one element, simply return; it is already sorted. Otherwise, split A[p .. r] into two subarrays A[p .. q] and A[q + 1 .. r], each containing about half of the elements of A[p .. r]. That is, q is the halfway point of A[p .. r].

2. Conquer Step

Conquer by recursively sorting the two subarrays A[p .. q] and A[q + 1 .. r].

3. Combine Step

Combine the elements back in A[p .. r] by merging the two sorted subarrays A[p .. q] and A[q + 1 .. r] into a sorted sequence. To accomplish this step, we will define a procedure MERGE (A, p, q, r).

Note that the recursion bottoms out when the subarray has just one element, so that it is trivially sorted.

 

Algorithm: Merge Sort

To sort the entire sequence A[1 .. n], make the initial call  to the procedure MERGE-SORT (A, 1, n).

MERGE-SORT (A, p, r)

1.     IF p < r                                                    // Check for base case
2.         THEN q = FLOOR[(p + r)/2]                 // Divide step
3.                 MERGE (A, p, q)                          // Conquer step.
4.                 MERGE (A, q + 1, r)                     // Conquer step.
5.                 MERGE (A, p, q, r)                       // Conquer step.

II QuickSort
Good points

    It is in-place since it uses only a small auxiliary stack.
    It requires only n log(n) time to sort n items.
    It has an extremely short inner loop
    This algorithm has been subjected to a thorough mathematical analysis, a very precise statement can be made about performance issues.

Bad Points

    It is recursive. Especially if recursion is not available, the implementation is extremely complicated.
    It requires quadratic (i.e., n2) time in the worst-case.
    It is fragile i.e., a simple mistake in the implementation can go unnoticed and cause it to perform badly.

 

Quick sort works by partitioning a given array A[p . . r] into two non-empty sub array A[p . . q] and A[q+1 . . r] such that every key in A[p . . q] is less than or equal to every key in A[q+1 . . r]. Then the two subarrays are sorted by recursive calls to Quick sort. The exact position of the partition depends on the given array and index q is computed as a part of the partitioning procedure.

 

            QuickSort

                If p < r then
                    q Partition (A, p, r)
                    Recursive call to Quick Sort (A, p, q)
                    Recursive call to Quick Sort (A, q + r, r)


III HeapSort 
The root of the tree A[1] and given index i of a node, the indices of its parent, left child and right child can be computed
 

            PARENT (i)
                    return floor(i/2)
            LEFT (i)
                    return 2i
            RIGHT (i)
                    return 2i + 1

Heap Property

In a heap, for every node i other than the root, the value of a node is greater than or equal (at most) to the value of its parent.


        A[PARENT (i)] ≥ A[i]


Thus, the largest element in a heap is stored at the root.

 

 Four basic procedures on heap are

    Heapify, which runs in O(lg n) time.
    Build-Heap, which runs in linear time.
    Heap Sort, which runs in O(n lg n) time.
    Extract-Max, which runs in O(lg n) time.

 
