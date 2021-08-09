# Sorting

## 1. Bubble Sort 
    Complexity : O(n^2)
    Stable Algo : YES
    Adaptive Algo : By Default No but it can be made Adaptive
 
 ## 2. Insertion Sort 
    Complexity : O(n^2)
    Stable Algo : YES
    Adaptive Algo : YES
   
 ## 3. Selection Sort 
    Complexity : O(n^2)
    Stable Algo : NO But it can be stable
    Adaptive Algo : NO

## Stable Algorithm 
  A Stable Sort is one which preserves the original order of input set, where the comparison algorithm does not distinguish between two or more items. 
  A Stable Sort will guarantee that the original order of data having the same rank is preserved in the output.
  
    ### Example 
      Insertion Sort, Merge Sort and Bubble Sort 
    ### Non Example
      Quick Sort, Heap Sort
      
## Internal & External Algorithm    
    ### Internal : 
    All the data is loaded into the memory. The sorting in which there is no need to use another storage 
    structure as the data is managable enough in the RAM. This is possible whenever the data to be sorted is small enough to all be held in the main memory.
        ### Example : 
        Insertion Sort, Bubble Sort, Selection Quick, Heap, Radix 
        
    ### External : 
    All the data is not loaded into the memory
        ### Example : 
        Merge Sort
        
 ## Adaptive Algorithm  
    Already sorted data takes less time
    
 ## Note
  1. Bubble sort, insertion sort, and selection sort are in-place sorting algorithms. Because only swapping of the element in the input array is required.
  2. Bubble sort and insertion sort can be applying as stable algorithms but selection sort cannot (without significant modifications).
  3. Merge sort is a stable algorithm but not an in-place algorithm. It requires extra array storage.
  4. Quicksort is not stable but is an in-place algorithm.
  5. Heap sort is an in-place algorithm but is not stable.

