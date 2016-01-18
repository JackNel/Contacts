package main.codewars;

/**
 * Created by Jack on 1/18/16.
 */

//Imagine there's a big cube consisting of n^3 small cubes. Calculate, how many small cubes are not visible from outside.
// For example, if we have a cube which has 4 cubes in a row, then the function should return 8,
// because there are 8 cubes inside our cube (2 cubes in each dimension)

public class CodeWars2 {
    public static void main(String[] args) {
        System.out.println(notVisibleCubes(-5L));
    }

    public static Long notVisibleCubes(Long n) {
        Long answer = (n-2)*(n-2)*(n-2);
        return answer;
    }
}