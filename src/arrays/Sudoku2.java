/*
    cheborca @2018
 */
package arrays;

import java.util.HashSet;
import java.util.Set;

public class Sudoku2 {

    /*Implement an algorithm that will check whether the given grid of numbers 
      represents a valid Sudoku puzzle*/
    boolean sudoku2(char[][] grid) {

        for (int i = 0; i < 3; ++i) {

            for (int j = 0; j < 3; ++j) {
                Set<Character> exist = new HashSet<>();
                for (int k = 0; k < 3; ++k) {
                    int row = i * 3 + k;
                    for (int k2 = 0; k2 < 3; ++k2) {
                        int col = j * 3 + k2;
                        char c = grid[row][col];
                        if (c != '.') {
                            if (exist.contains(c)) {
                                return false;
                            }
                            exist.add(c);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 9; ++i) {
            Set<Character> existOne = new HashSet<>();
            Set<Character> existTwo = new HashSet<>();
            for (int j = 0; j < 9; ++j) {
                char c = grid[i][j];
                if (c != '.') {
                    if (existOne.contains(c)) {
                        return false;
                    }
                    existOne.add(c);
                }
                char c2 = grid[j][i];
                if (c2 != '.') {
                    if (existTwo.contains(c2)) {
                        return false;
                    }
                    existTwo.add(c2);
                }
            }
        }

        return true;

    }
}
