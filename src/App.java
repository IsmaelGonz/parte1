import controller.DataController;

public class App {
    public static void main(String[] args) {
        DataController controller = new DataController();
        controller.run("data.txt");
    }
}
