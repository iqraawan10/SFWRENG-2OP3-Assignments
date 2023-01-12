/* Assignment 10 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (60 marks in total)
    use an Integer array to implement the following set named m_SetByArray
    you cannot use JCF provided set.
 */

import java.util.Arrays;
import java.util.Set;

class m_SetByArray {
    // Use m_array to store all the items in the set.
    // This is a strict mandatory requirement of this assignment.
    // To keep it simple, we use a fixed length array with 100 items.
    Integer[] m_array = new Integer[100];
    int number_of_items = 0; // this variable keep track of how many items are in the set.

    // Question 2.1 (5 marks): implement method size().
    // Returns the number of elements in this set (its cardinality).
    // You can ONLY modify the body of this method including the return statement.
    public int size() {
        number_of_items = 0;
        for(Integer i: m_array){
            number_of_items++;
        }
        return number_of_items;
    }

    // Question 2.2 (5 marks): implement method isEmpty()
    // Returns true if this set contains no elements, otherwise return false.
    // You can ONLY modify the body of this method including the return statement.
    public boolean isEmpty() {
        if (size() == 0){
            return true;
        }
        else {
            return false;
        }
    }

    // Question 2.3 (10 marks): implement method contains()
    /* Returns true if this set contains the specified element. More formally,
    returns true if and only if this set contains an element e such that Objects.equals(o, e).
    Parameters:
        o – element whose presence in this set is to be tested
    Returns:
        true if this set contains the specified element
    */
    // You can ONLY modify the body of this method including the return statement.
    public boolean contains(Integer o) {
        for (Integer val : m_array) {
            if (val == o) {
                return true;
            }
        }
        return false;
    }

    // Question 2.4 (15 marks): implement method add()
    /* Adds the specified element to this set if it is not already present.
     * If this set does not contain the element, add the element to this set
     * and return true.
     * If this set already contains the element, the call leaves the set
     * unchanged and return false.
     */
    // You can ONLY modify the body of this method including the return statement.
    public boolean add(Integer e) {
        int n = m_array.length;

        Integer[] temp = new Integer[n];
        for (int i = 0; i< n; i++){
            if(contains(e)){
                return false;
            }
            temp[i] = m_array[i];
        }
        m_array = new Integer[n + 1];
        for (int j = 0; j<n; j++){
            m_array[j] = temp[j];
        }
        m_array[n] = e;
        return true;
    }

    // Question 2.5 (15 marks): implement method remove()
    /* Removes the specified element from this set if it is present.
     * Returns true if this set contained the element.
     * Returns false if this set does not contain the element
     */
    // You can ONLY modify the body of this method including the return statement.
    public boolean remove(Integer o) {
        int n = m_array.length;
        int index = 0;

        Integer[] temp = new Integer[n];
        for(int i = 0; i<n; i++){
            if(!contains(o)){
                return false;
            }
            temp[i] = m_array[i];

            if(temp[i] == o){
                index = i;
            }
        }
        m_array = new Integer[n-1];
        for(int i=0,j=0; i<n;i++,j++){
            if(i==index)
                i++; //skip over the element
            m_array[j] = temp[i];
        }
        return true;
    }

    // Question 2.6 (5 marks): implement method clear()
    /* Removes all of the elements from this set. The set will be empty after this call returns. */
    // You can ONLY modify the body of this method including the return statement.
    public void clear() {
        m_array = new Integer[0];
    }

    // Question 2.7 (5 marks): print the set items
    public void printSet() {
        System.out.print("[");
        for(Integer i : m_array) {
            if(i != null)   //doesn't print null
                System.out.print("" + (Integer) i+", ");
        }
        System.out.println("]");
    }
}

public class Q2_SetByArray {

    public static void main(String[] args) {
        System.out.println("******************************");
        System.out.println("Start testing with Integer ...");
        m_SetByArray test_integer = new m_SetByArray();
        System.out.println("Is empty? " + test_integer.isEmpty());
        System.out.println("Size is: " + test_integer.size());
        test_integer.add(1);
        test_integer.add(2);
        test_integer.add(3);
        test_integer.printSet();
        System.out.println("Testing on adding duplicate items");
        System.out.println("Can we add a duplicate item valued 2? " + test_integer.add(2));
        System.out.println("Can we remove value 2? " + test_integer.remove(2));
        test_integer.printSet();
        System.out.println("Can we add an old item valued 2 after removing? " + test_integer.add(2));
        test_integer.printSet();
        System.out.println("Can we clear all? ");
        test_integer.clear();
        test_integer.printSet();
    }
}
