package controller;

import model.*;
import view.ConsoleView;

public class DataController {
    private ConsoleView view = new ConsoleView();
    private DataAnalyzer analyzer = new DataAnalyzer();

    public void run(String filePath) {
        try {
            int[] data = analyzer.loadData(filePath);

            MyArray array = new MyArray(data.length);
            MyLinkedList list = new MyLinkedList();
            MyArray duplicates = new MyArray(data.length);

            long startTime = System.currentTimeMillis();
            int duplicateCount = analyzer.findDuplicates(data, array, list, duplicates);
            long endTime = System.currentTimeMillis();

            view.showDuplicateCount(duplicateCount);
            view.showTime("Tiempo total", endTime - startTime);
        } catch (Exception e) {
            view.showMessage("Error: " + e.getMessage());
        }
    }
}
