/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields 
	private int numElements;	
	private int[] masterArray;
	private int[] tempArray;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
		numElements = 0;
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
		for (int element : masterArray){
			output += element + ",";
		}
		output += "]";
		return output;
    }

    
    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
		 numElements++;
		 tempArray = new int[numElements];
		 for (int pos = 0 ; pos < masterArray.length ; pos++){
			 tempArray[pos] = masterArray[pos];
		 }
		 tempArray[tempArray.length - 1] = value;
		 masterArray = tempArray;
		 return true;
     }


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
     private void expand() {
		 System.out.println("expand ... (for debugging)");
		 numElements *= 2;
		 tempArray = new int[numElements];
		 for (int pos = 0 ; pos < masterArray.length ; pos++){
			 tempArray[pos] = masterArray[pos];
		 }
		 masterArray = tempArray;
     }
}