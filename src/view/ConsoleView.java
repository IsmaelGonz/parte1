package view;

public class ConsoleView {

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showTime(String label, long timeInMs) {
        System.out.println(label + ": " + timeInMs + " ms");
    }

    public void showDuplicateCount(int count) {
        System.out.println("Total elementos duplicados: " + count);
    }
}
