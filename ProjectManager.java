// ProjectManager.java

import java.util.ArrayList;
import java.util.List;

public class ProjectManager {

    private List<String> projects;

    public ProjectManager() {
        this.projects = new ArrayList<>();
    }

    public void addProject(String projectName) {
        projects.add(projectName);
    }

    public void removeProject(String projectName) {
        projects.remove(projectName);
    }

    public List<String> getProjects() {
        return projects;
    }

    public void displayProjects() {
        if (projects.isEmpty()) {
            System.out.println("No projects available.");
        } else {
            System.out.println("Projects:");
            for (String project : projects) {
                System.out.println("- " + project);
            }
        }
    }
}