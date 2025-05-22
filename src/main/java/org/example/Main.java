package org.example;

import org.example.entity.Priority;
import org.example.entity.Status;
import org.example.entity.Task;
import org.example.entity.TaskData;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Task> annsTasks = new HashSet<>();
        Task taskAnn = new Task("workintech", "java project", "ann", Status.IN_PROGRESS, Priority.HIGH);
        annsTasks.add(taskAnn);

        Set<Task> bobsTasks = new HashSet<>();
        Task bobsTask = new Task("workintech", "java project2", "bob", Status.IN_PROGRESS, Priority.HIGH);
        bobsTasks.add(bobsTask);


        Set<Task> carolsTasks = new HashSet<>();
        Task carolsTask = new Task("workintech", "java project3", "carol", Status.IN_PROGRESS, Priority.HIGH);
        carolsTasks.add(carolsTask);


        Set<Task> unassignedTasks = new HashSet<>();
        Task unassignedTask = new Task("workintech", "java project4", null, Status.IN_PROGRESS, Priority.HIGH);
        unassignedTasks.add(unassignedTask);

        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);
        System.out.println("bobstasks: " + taskData.getTasks("bob"));
        System.out.println("annstasks: " + taskData.getTasks("ann"));
        System.out.println("alltasks: " + taskData.getTasks("all"));

        System.out.println("unassigned "  + taskData.getDifferences(unassignedTasks, taskData.getTasks("ann")));
    }
}
