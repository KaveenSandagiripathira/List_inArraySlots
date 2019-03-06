
# List_inArraySlots
by Kaveen Sandagiripathira and Rachael Cheung

## List_inArraySlots Class
#### Fields:
```
// integer number of elements in list which is non-constant
private int numElements;
// An array for whose slots we use to represent our list. This array is referenced by the field masterArray
private int[] masterArray;
//An array for whose slots we used to temporarily store data while creating a new array. This array is referenced by tempArray
private int[] tempArray;
```

#### Constructor(s):
```
// Constructor that makes masterArray reference an array of an element size chosen by us.
public List_inArraySlots ()
```

#### Methods:
``` 
// Add element to specific position
public void addElement (int pos)

// Access element at specific position
public [elementType] getElement (int pos)

// Ascertain the length of the list
public int listLength ()

// Change the value of element at specific position
public void changeElement (int pos)

// Remove an element at specific posistion
public void removeElement(int pos)
```

## UserOfList class:
- For testing 
 

