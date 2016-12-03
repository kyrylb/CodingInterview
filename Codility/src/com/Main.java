package com;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] A = {5, 3, 8};
        int[] B = {4, 2, 5, 1, 2, 5};

        Solution sol = new Solution();
        System.out.println(sol.solution(A, B));
    }
}


/*
  TODO:
  Change no more than 2 lines.
  time complexity: O((N+M)log(N+M))
  space complexity: O(log(N+M))
 */
class Solution {
    int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            if (i < m - 1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }
}
