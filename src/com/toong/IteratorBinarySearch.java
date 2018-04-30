package com.toong;

// Pseudo code
// Initial first = 0
// Initial last = array size - 1
// While first <= last
// Get the center of first and last
// centerChar = array[(first + last)/2];
// If (centerChar == searchValue)
//     return (first + last) / 2;
// If the center character is less than search value
//     first = (first + last) / 2 + 1;
// Else
//     last = (first + last) / 2 - 1;
// Return -1
public class IteratorBinarySearch {

    static char[] strings = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'o', 'p'};

    public static int binarySearch(char value) {
        int first = 0;
        int last = strings.length-1;
        while (first <= last) {
            int centerPos = (first + last) / 2;
            if (strings[centerPos] == value) {
                return centerPos;
            }
            if (strings[centerPos] < value) {
                first = centerPos + 1;
            } else {
                last = centerPos - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println(binarySearch('b'));
        System.out.println(binarySearch('h'));
    }
}
