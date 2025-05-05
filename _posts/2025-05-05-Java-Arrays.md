# Java - Array 

- The application of the array structure
- Constructing an array
- Traversing an array
- Initializing an array
- Array and methods
- Comparing arrays
- Value semantics
- Reference semantics

## The application of the array structure

- Arrays store multiple values in one variable, improving efficiency over individual variables
- They're foundational for complex data structures (e.g., stacks/queues) and sorting algorithms
- Multi-dimensional arrays (2D/3D) handle tabular data like matrices

## Constructing an array
```
int[] numbers;  // Declaration
numbers = new int[5];  // Allocation

```
 ## Traversing an array
 ```
for(int i=0; i<numbers.length; i++) {
    System.out.println(numbers[i]);
}
```
## Initializing an array
```
int[] a = {1,2}, b = {1,2};
boolean equal = Arrays.equals(a, b);[5][6]

```
## Array and methods

- Arrays use reference semantics - passing to methods allows modification of original data. 
- Contrast with primitive value semantics where copies are passed

## Comparing Array
```
int[] a = {1,2}, b = {1,2};
boolean equal = Arrays.equals(a, b);[5][6]
```
## Value semantics
```
Value: Primitives create copies on assignment (int x = y;)
```
## Reference semantics
```
Reference: Array assignments share data (int[] arr2 = arr1;).
Changes via one reference affect all.
```
