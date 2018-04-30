package com.toong;

// Pseudo code
//

public class RecursiveBinarySearch {

    static char[] strings = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'o', 'p'};

    private static int binarySearch(char value, int first, int last) {
        if (first > last) {
            return -1;
        }
        int center = (first + last) / 2;
        if (strings[center] == value) {
            return center;
        }
        if (strings[center] > value) {
            return binarySearch(value, first, center - 1);
        } else {
            return binarySearch(value, center + 1, last);
        }
    }

    public static void main(String[] args) {
        System.out.println(binarySearch('b', 0, strings.length));
        System.out.println(binarySearch('h', 0, strings.length));
    }
}
