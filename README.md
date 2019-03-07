
# List_inArraySlots
by Kaveen Sandagiripathira and Rachael Cheung

## List_inArraySlots Class
#### Fields:
```
private int numElements;	  //number of elements in the list (elements not including null elements)
private int arraySize;     //The size of the array that is used to represent the list
private int[] masterArray;	//main array referred to in UserOfList

```

#### Constructor(s):
```
/** Constructor that: 
      -sets numElements to 0
      -sets arraySize to initial size of 1
      -initiates masterArray to have a size 1 */
public List_inArraySlots ()
```

#### Methods:
``` 
// Returns the number of elements in the list (not the capacity)
public int size() 

// Returns a String representation of the list (not including null elements)
public String toString()

// Appends an integer, "value", to the end of the list 
public boolean add (int value)

// Doubles the capacity, preserving existing data
private void expand()
```

## UserOfList class:
- Creates an instance of List_inArraySlots
- Incrementally adds elements to the list using list.add()
 

