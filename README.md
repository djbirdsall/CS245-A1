��# CS245-A1
Explanation for "Fast" Merge Sort:
SPOILER: It's not faster. Essentially it takes the sorted arrays and starting with the first region, performs a regular merge with the first region and the second region. Then, it takes everything that has been sorted, and merges that with the next region. It probably isn't the most efficient strategy, but it works! I think that why it is so slow towards the end is because it is almost performing an insertion sort type deal by comparing single values against an entire sorted array.
