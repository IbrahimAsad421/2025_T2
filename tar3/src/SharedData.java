//
//import java.util.ArrayList;
//
//public class SharedData {
//    private ArrayList<Integer> arrayList; // Use ArrayList instead of int[]
//    private boolean[] winArray;
//    private boolean flag;
//    private final int b;
//
//    public SharedData(ArrayList<Integer> arrayList, int b) {
//        this.arrayList = arrayList;
//        this.b = b;
//    }
//
//    public boolean[] getWinArray() {
//        return winArray;
//    }
//
//    public void setWinArray(boolean[] winArray) {
//        this.winArray = winArray;
//    }
//
//    public ArrayList<Integer> getArrayList() {
//        return arrayList;
//    }
//
//    public int getB() {
//        return b;
//    }
//
//    public boolean getFlag() {
//        return flag;
//    }
//
//    public void setFlag(boolean flag) {
//        this.flag = flag;
//    }
//}
import java.util.ArrayList;

/**
 * The {@code SharedData} class serves as a shared resource to store and manage data
 * for threads operating on a subset sum problem. It holds an {@code ArrayList<Integer>}
 * representing a list of integers, a boolean array indicating results for each index,
 * a flag to track if a solution has been found, and a target integer value {@code b}.
 */
public class SharedData {
    private ArrayList<Integer> arrayList; // Stores the list of integers
    private boolean[] winArray;          // Boolean array indicating the winning subset
    private boolean flag;                // Tracks whether a solution has been found
    private final int b;                 // Target value for the subset sum problem

    /**
     * Constructs a new {@code SharedData} object with the specified list of integers
     * and target value {@code b}.
     *
     * @param arrayList the list of integers
     * @param b the target value for the subset sum problem
     */
    public SharedData(ArrayList<Integer> arrayList, int b) {
        this.arrayList = arrayList;
        this.b = b;
    }

    /**
     * Returns the boolean array indicating which indices are part of the winning subset.
     *
     * @return the boolean array representing the winning subset
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Sets the boolean array indicating which indices are part of the winning subset.
     *
     * @param winArray the boolean array representing the winning subset
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Returns the list of integers stored in this shared data.
     *
     * @return the {@code ArrayList<Integer>} representing the data
     */
    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    /**
     * Returns the target value for the subset sum problem.
     *
     * @return the target value {@code b}
     */
    public int getB() {
        return b;
    }

    /**
     * Returns the flag indicating whether a solution has been found.
     *
     * @return {@code true} if a solution has been found, {@code false} otherwise
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Sets the flag indicating whether a solution has been found.
     *
     * @param flag {@code true} if a solution has been found, {@code false} otherwise
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
