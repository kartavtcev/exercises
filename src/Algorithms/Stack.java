package Algorithms;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {
    private Node first; // верхушка стека (узел, добавленный последним)
    private int N;  // количество элементов
    private class Node {
        // Вложенный класс для определения узлов
        Item item;
        Node next;
    }

    public boolean isEmpty() {return first == null;} // Или N == 0.
    public int size() { return N; }

    public void push(Item item){
        // Добавление элемента на верхушку стека
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop() {
        // Удаление элемента с верхушки стека.
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext() {
            return current != null;
        }
        public void remove () {}
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}