public class ProjectTest {
    public static void main(String [] args) {
        Project project = new Project("george");
        System.out.println(project.getName());
        System.out.println(project.getDesc());
        System.out.println(project);
    }
}