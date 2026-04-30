// Adding Imports
import java.util.*;

// Assigner Class: Ability to Add, Remove, and Orgnaize Tasks
public class Assigner {
    private LinkedList<Task> taskList;
    private HashMap<String, List<Task>> categoryMap;

    /*
     * Creation of Data Structures
     * - LinkedList
     * - HashMap
     */
    public Assigner() {
        taskList = new LinkedList<>();
        categoryMap = new HashMap<>();
    }

    // add: Adds data from inputted datas
    public void add(Task task) {
        taskList.add(task);
        categoryMap.computeIfAbsent(task.getCategory(), k -> new ArrayList<>()).add(task);
    }

    // remove: Removes data from inputted data
    public void remove(Task task) {
        taskList.remove(task);
        categoryMap.get(task.getCategory()).remove(task);
    }

    // getTask: Gets data from inputted data
    public List<Task> getTasks() {
        return taskList;
    }

    // sort: Organizes data from inputted data
    public void sort() {
        taskList = Sort.mergeSort(taskList);
    }
}