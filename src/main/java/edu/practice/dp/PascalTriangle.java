package edu.practice.dp;

import java.util.ArrayList;
import java.util.List;

 //     1
 //     1   1
 //     1   2   1
 //     1   3   3   1
 //     1   4   6   4   1
public class PascalTriangle {

     public static void main(String[] args) {
         int numRows = 5;
         List<List<Integer>> pascal = new PascalTriangle().generate(numRows);
         // Print Pascal's Triangle
         for (List<Integer> row : pascal) {
             System.out.println(row);
         }
     }

     public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> triangle = new ArrayList<>();
         for (int i = 0; i < numRows; i++) {
             List<Integer> row = new ArrayList<>();

             for (int j = 0; j <= i; j++) {
                 // First and last elements of each row are always 1
                 if (j == 0 || j == i) {
                     row.add(1);
                 } else {
                     // Middle elements are sum of the two numbers above it
                     int sum = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                     row.add(sum);
                 }
             }

             triangle.add(row);
         }
         return triangle;
     }


}
