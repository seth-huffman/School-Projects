// Adding Imports
import java.util.LinkedList;

/* 
 * Sort Class: Organizes data in the list
 * - Sorting algorithm
 */ 
public class Sort {
    public static LinkedList<Task> mergeSort(LinkedList<Task> tasks) {
        if (tasks.size() <= 1) return tasks;

        int mid = tasks.size() / 2;
        LinkedList<Task> left = new LinkedList<>(tasks.subList(0, mid));
        LinkedList<Task> right = new LinkedList<>(tasks.subList(mid, tasks.size()));

        return merge(mergeSort(left), mergeSort(right));
    }

    // Sorting is recursive, then it merges together in sorted order
    private static LinkedList<Task> merge(LinkedList<Task> left, LinkedList<Task> right) {
        LinkedList<Task> sorted = new LinkedList<>();
        while (!left.isEmpty() && !right.isEmpty()) {
            Task a = left.peek();
            Task b = right.peek();
            if (compareTasks(a, b) <= 0) {
                sorted.add(left.poll());
            } else {
                sorted.add(right.poll());
            }
        }
        sorted.addAll(left);
        sorted.addAll(right);
        return sorted;
    }

    /*
     * Compares the tasks based upon how important they are
     * If both are importnt then compare date
     */ 
    private static int compareTasks(Task a, Task b) {
        if (a.importnat() && !b.importnat()) return -1;
        if (!a.importnat() && b.importnat()) return 1;
        return a.getdate().compareTo(b.getdate());
    }
}