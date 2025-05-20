package model;

import java.io.BufferedReader;
import java.io.FileReader;

public class DataAnalyzer {

    public int[] loadData(String filePath) throws Exception {
        int[] data = new int[15000];
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        int index = 0;

        while ((line = reader.readLine()) != null && index < 15000) {
            data[index++] = Integer.parseInt(line.trim());
        }

        reader.close();
        return data;
    }

    public int findDuplicates(int[] data, MyArray array, MyLinkedList list, MyArray duplicates) {
        int duplicateCount = 0;

        for (int value : data) {
            if (array.contains(value) || list.contains(value)) {
                duplicates.add(value);
                duplicateCount++;
            } else {
                array.add(value);
                list.add(value);
            }
        }

        return duplicateCount;
    }
}
