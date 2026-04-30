package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

/**
 * Unit test: Task and Category classes
 */
public class TaskAndCategoryTest extends TestCase {
    public TaskAndCategoryTest(String testName) {
        super(testName);
    }

    //Test: Task getters
    public void testTaskGetters() {
        LocalDate date = LocalDate.of(2025, 6, 2);
        Task task = new Task("Walk on the moon", date, false, "Job");

        assertEquals("Walk on the moon", task.getName());
        assertEquals(date, task.getdate());
        assertTrue(task.importnat());
        assertEquals("Job", task.getCategory());
    }

    // Test: Task toString
    public void testTaskToString() {
        LocalDate date = LocalDate.of(2025, 6, 2);
        Task task = new Task("Walk on the moon", date, false, "Job");

        String output = task.toString();
        assertTrue(output.contains("Walk on the moon"));
        assertTrue(output.contains("Job"));
        assertTrue(output.contains(date.toString()));
    }

    // Test: Category getters
    public void testCategoryGetName() {
        Category category = new Category("Job");
        assertEquals("Job", category.getName());
    }
}
