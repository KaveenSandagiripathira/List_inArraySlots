/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields 
	private int numElements;	//number of elements in the array
	private int sizeArray;      //The size of the array that is used to represent the list.
	private int[] masterArray;	//main array referred to in UserOfList

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
		numElements = 0; 
		sizeArray = 1;
		masterArray = new int[numElements];
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
		if (numElements == 0){
			output += "]";
		}
		else{
			for (int pos = 0; pos < numElements; pos++){
				output += masterArray[pos] + ",";
			}
			output += "]";
		}
		return output;
    }

    
    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
		 numElements++;
		 if (numElements == masterArray.length)
			 expand();
		 masterArray[numElements - 1] = value;
		 return true;
     }


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
     private void expand() {
		 System.out.println("expand ... (for debugging)");
		 int[] tempArray;
		 sizeArray *= 2; //doubles the size of the capacity
		 tempArray = new int[sizeArray];
		 for (int pos = 0 ; pos < masterArray.length ; pos++){
			 tempArray[pos] = masterArray[pos];
		 }
		 masterArray = tempArray;
     }
}