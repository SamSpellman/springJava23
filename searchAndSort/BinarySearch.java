/**
 * Author: Samuel Spellman
 *
 * This will be a static class that will perform a binary search on valid lists
 * or iterable, comparable objects.
 *
 **/

public class BinarySearch<T extends Iterable<T>> {
	// TODO: Search for an item the data given.
	// Uses bounded generics to be able to iterate through type passed
	T toSearchThrough;

	/** class to represent an element in the iterable object
	 * The purpose of creating a new Class for item is to extend 
	 * furnctionality eventually.
	 * Will parameterize Item with java.lang.Comparable
	 * to allow for code reusability
	 **/
	public class Item {
		// The datum that is comparable for searching through
		Integer datum = 0; 

		// Class Constructor
		public Item(Integer datum) {
			// initialize the item instance	
			this.datum = datum;
		}	

		/** compare to another item object
		 *
		 * @param Item forCompare will be compared to "this"
		 * @return int 1: "this" is greater than
		 * 	0: "this" is equal to
		 * 	-1: "this" is less than
		 **/
		public int compareTo(Item forCompare) {
			// TODO write comparisons
			return -1;	
		}

		// We want to write methods to be able to compare items passed
		public String toString() {
			return("Value of this item: " + this.datum);
		}
	}

}


