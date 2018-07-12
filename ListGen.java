package com.company;

import java.util.Arrays;

public class ListGen<E> implements List<E> {

    private Object [] arr = new Object[10];
    private int size = 0;




    private void resize() {
        int newSize = arr.length * 3 / 2 + 1;
        System.out.println("newSize: " + newSize);
        Object[] newArr = new Object[newSize];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    @Override
    public boolean remove(int index) {
        System.arraycopy(arr, index + 1, arr, index, size - index - 1);
        size--;
        return true;
    }


    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public void set(int index, E e) {
        arr[index] = e;
    }

    @Override
    public boolean removeElement(E e) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == e) {
                System.arraycopy(arr, i + 1, arr, i, size - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(E e) {
        if (size >= arr.length) {
            resize();
        }
        arr[size] = e;
        size++;
    }



    @Override
    public void add(int index, E e) {
        if (size >= arr.length) {
            resize();
        }
        arr[index] = e;
        size++;
    }


    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        return (int) arr[index];
    }


    @Override
    public int size() {
        return size;
    }


}
