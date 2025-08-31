package edu.practice.dp;

// You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps.
// In how many distinct ways can you climb to the top?
public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Distinct ways to climb to the top: " + climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int first = 1; // ways to reach step 1
        int second = 2; // ways to reach step 2
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = first + second;
            first = second;
            second = current;
        }

        return second;
    }

}
