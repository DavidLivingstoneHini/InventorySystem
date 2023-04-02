package com.inventory.Algorithms;
import java.util.ArrayList;
import java.util.List;
public class Stack {
    @Override
    public String toString() {
        String items = null;
        return "Stack [items=" + null + "]";
    }
    private List<String> elements = new ArrayList<>();
    public String peek() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.get(elements.size() - 1);
    }

    public String pop() {
        if (elements.isEmpty()) {
            return null;
        }
        String top = elements.get(elements.size() - 1);
        elements.remove(elements.size() - 1);
        return top;
    }
    public void push(String element) {
        elements.add(element);
    }
    public int size() {
        return elements.size();
    }
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public static void main(String[] args) {

        Stack stack = new Stack();

    }
}