package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[size];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            if (items[index] != null) {
                rsl[size] = items[index];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item != null && item.getName().equals(key)) {
                rsl[size] = items[index];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }
}