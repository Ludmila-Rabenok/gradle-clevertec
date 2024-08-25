package plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class TestReportPlugin implements Plugin<Project> {

    @Override
    public void apply(Project target) {
        target.getTasks().register("runJacocoTest", task -> task.finalizedBy("test"));
    }
}