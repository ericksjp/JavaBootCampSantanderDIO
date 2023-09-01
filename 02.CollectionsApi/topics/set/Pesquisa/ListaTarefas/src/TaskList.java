import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TaskList {
    private Set<Task> taskList;

    public TaskList() {
        taskList = new HashSet<>();
    }

    public TaskList(Set<Task> tasks) {
        taskList = (HashSet<Task>) tasks;
    }

    public void addTask(String description) {
        if (taskList.stream().anyMatch(x -> x.getDescription().equalsIgnoreCase(description))) {
            throw new RuntimeException("Task already in list");
        } else
            taskList.add(new Task(description));
    }

    public void removeTask(String description) {
        Task task = taskList.stream().filter(x -> x.getDescription().equalsIgnoreCase(description)).findAny()
                .orElseThrow(() -> new RuntimeException("Task not in the list"));
        taskList.remove(task);
    }

    public void showTasks() {
        for (Task task : taskList) {
            System.out.printf("Task Description: %s\n", task.getDescription());
            System.out.print("Task Status: ");
            if (task.getTaskState() == false) {
                System.out.println("Not concluded\n");
            } else {
                System.out.println("Concluded\n");
            }
        }
    }

    public HashSet<Task> getConcludedTasks() {
        return taskList.stream().filter(x -> x.getTaskState() == true).collect(Collectors.toCollection(HashSet::new));
    }

    public HashSet<Task> getNotConcludedTasks() {
        return taskList.stream().filter(x -> x.getTaskState() == false).collect(Collectors.toCollection(HashSet::new));
    }

    public int countTasks() {
        return taskList.size();
    }

    public void setConcludedTask(String description) {
        Task task = taskList.stream().filter(x -> x.getDescription().equalsIgnoreCase(description)).findAny()
                .orElseThrow(() -> new RuntimeException("Task not in the list"));
        task.taskState(true);
    }

    public void setNotConcludedTask(String description) {
        Task task = taskList.stream().filter(x -> x.getDescription().equalsIgnoreCase(description)).findAny()
                .orElseThrow(() -> new RuntimeException("Task not in the list"));
        task.taskState(false);
    }

    public void cleanTaskList() {
        taskList.removeAll(taskList);
    }
}
