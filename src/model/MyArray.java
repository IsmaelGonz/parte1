package model;

public class MyArray {
    private int[] data;
    private int size = 0;

    public MyArray(int capacity) {
        data = new int[capacity];
    }

    public void add(int value) {
        if (size < data.length) {
            data[size++] = value;
        }
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }
}
