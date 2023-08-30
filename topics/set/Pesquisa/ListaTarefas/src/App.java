public class App {
    public static void main(String[] args) throws Exception {
        var taskList = new TaskList();
        taskList.addTask("Kill 1");
        taskList.addTask("Kill 2");
        taskList.addTask("Kill Bill");
        taskList.addTask("Shopping on the beach");

        System.out.println("\nTask List:");
        taskList.showTasks();
        System.out.println("---------------------------------------------------------------------------");

        taskList.removeTask("Kill Bill");

        System.out.println("\nTask List:");
        taskList.showTasks();

        System.out.println("Total tasks: " + taskList.countTasks() + "\n");

        taskList.setConcludedTask("Kill 2");
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("\nTask List:");
        taskList.showTasks();

        taskList.setNotConcludedTask("Kill 2");
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("\nTask List:");
        taskList.showTasks();
        System.out.println("\n---------------------------------------------------------------------------");

        taskList.setConcludedTask("Kill 2");
        taskList.setConcludedTask("Kill 1");

        System.out.println("\nConcluded Tasks:");
        for (Task task : taskList.getConcludedTasks()) {
            System.out.println("Task description: " + task.getDescription());
            System.out.print("Task status: Concluded\n");
        }
        System.out.println("\n---------------------------------------------------------------------------");

        System.out.println("\nNot Concluded Tasks:");
        for (Task task : taskList.getNotConcludedTasks()) {
            System.out.println("Task description: " + task.getDescription());
            System.out.print("Task status: Not Concluded\n\n");
        }

    }

}
