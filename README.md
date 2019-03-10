
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

// Accessor method for the list which returns the element at the given index
public int get( int index )

// Mutator method for the list which sets the element at the given index to the specified value
public int set( int index, int newValue )

// Adds the specified integer, "value", to the specified location, "index"
public void add( int index, int value)

// Removes the element at the specified location, "index"
public int remove( int index)
```

## UserOfList class:
- Creates an instance of List_inArraySlots
- Incrementally adds elements to the list using list.add()
- Has several helper methods such as setTest and addAtTest which puts into string form the new functionality. 
 

