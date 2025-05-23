public class Project {
    private String projectName;
    private List<String> tasks;

    public Project(String projectName) {
        this.projectName = projectName;
        this.tasks = new ArrayList<>();
    }

    public void addTask(String taskName) {
        tasks.add(taskName);
    }

    public int getTotalTasks() {
        return tasks.size();
    }
}
