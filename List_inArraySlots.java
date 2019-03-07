/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields 
	private int numElements;	//number of elements in the array
	private int[] masterArray;	//main array referred to in UserOfList
	private int[] tempArray;	//array used to add capacity to masterArray

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
		numElements = 1; 
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
			if (element == null)
				break
			else
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
		 this.expand(); // doubles capacity
		 //System.out.println(masterArray.toString());
		 masterArray[(masterArray.length / 2)] = value;  //Inputs the new value in the last slot
		 return true;
     }


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
     private void expand() {
		 System.out.println("expand ... (for debugging)");
		 
		 numElements *= 2; //doubles the size of the capacity
		 tempArray = new int[numElements];
		 for (int pos = 0 ; pos < masterArray.length ; pos++){
			 tempArray[pos] = masterArray[pos];
		 }
		 masterArray = tempArray;
     }
}