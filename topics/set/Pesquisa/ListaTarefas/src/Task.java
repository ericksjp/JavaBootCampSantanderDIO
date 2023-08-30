public class Task {
    private String description;
    private Boolean taskState;
    
    public Task(String description) {
        addDescription(description);
        this.taskState = false;
    }

    public void addDescription(String description){
        if (description == null || description.isEmpty() || description.isBlank()){
            throw new RuntimeException("Task without description");
        } else 
            this.description = description;
    }

    public void taskState(Boolean taskState){
        if (taskState != null){
            this.taskState = taskState;
        }
    }

    public String getDescription() {
        return description;
    }

    public Boolean getTaskState() {
        return taskState;
    }
}
