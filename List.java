package com.company;

public interface List <E> {

    void add(E e);
    void add(int index, E e);
    int get(int index);
    void clear();
    boolean remove(int index);
    boolean removeElement(E e);
    void set(int index, E e);
    int size();

}