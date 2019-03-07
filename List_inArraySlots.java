/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields 
	private int numElements;	//number of elements in the array (not including null elements)
	private int arraySize;      //The size of the array that is used to represent the list
	private int[] masterArray;	//main array referred to in UserOfList

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
		numElements = 0; //start at position 0
		arraySize = 1; 
		masterArray = new int[arraySize]; //initiates masterArray to have 1 slot
    }


    /** 
      @return the number of elements in this list
     */
    public int size() {
		return numElements;
    }


     /** 
       @return a string representation of this list,
       in [a,b,c,] format
      */ 
    public String toString() {
		String output = "["; 
		//prints out all elements in the "list", but not the entire capacity
		for (int pos = 0; pos < numElements; pos++){ 
			output += masterArray[pos] + ",";
		}	
		output += "]";
		return output;
    }

    
    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
		 numElements++; //add one slot to the "list"
		 if (numElements == masterArray.length)
			 expand(); //doubles the capacity if there is no space left for the value
		 
		 masterArray[numElements - 1] = value; //inputs the value for the added slot
		 return true;
     }


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
     private void expand() {
		 System.out.println("expand ... (for debugging)");
		 
		 arraySize *= 2; //doubles the size of the capacity
		 int[] tempArray = new int[arraySize]; //new array with double the capacity of masterArray
		 
		 for (int pos = 0 ; pos < masterArray.length ; pos++){
			 tempArray[pos] = masterArray[pos]; // preserving the existing data in masterArray
		 }
		 masterArray = tempArray; 
     }
}