/*Prison Labor Dodgers
====================

Commander Lambda is all about efficiency, including using her bunny prisoners for manual labor. But no one's been properly monitoring the labor shifts for a while, and they've gotten quite mixed up. You've been given the task of fixing them, but after you wrote up new shifts, you realized that some prisoners had been transferred to a different block and aren't available for their assigned shifts. And manually sorting through each shift list to compare against prisoner block lists will take forever - remember, Commander Lambda loves efficiency!

Given two almost identical lists of prisoner IDs x and y where one of the lists contains an additional ID, write a function solution(x, y) that compares the lists and returns the additional ID.

For example, given the lists x = [13, 5, 6, 2, 5] and y = [5, 2, 5, 13], the function solution(x, y) would return 6 because the list x contains the integer 6 and the list y doesn't. Given the lists x = [14, 27, 1, 4, 2, 50, 3, 1] and y = [2, 4, -4, 3, 1, 1, 14, 27, 50], the function solution(x, y) would return -4 because the list y contains the integer -4 and the list x doesn't.

In each test case, the lists x and y will always contain n non-unique integers where n is at least 1 but never more than 99, and one of the lists will contain an additional unique integer which should be returned by the function.  The same n non-unique integers will be present on both lists, but they might appear in a different order, like in the examples above. Commander Lambda likes to keep her numbers short, so every prisoner ID will be between -1000 and 1000.

Languages
=========

To provide a Python solution, edit solution.py
To provide a Java solution, edit Solution.java

Test cases
==========
Your code should pass the following test cases.
Note that it may also be run against hidden test cases not shown here.

-- Python cases --
Input:
solution.solution([13, 5, 6, 2, 5], [5, 2, 5, 13])
Output:
    6

Input:
solution.solution([14, 27, 1, 4, 2, 50, 3, 1], [2, 4, -4, 3, 1, 1, 14, 27, 50])
Output:
    -4

-- Java cases --
Input:
Solution.solution({13, 5, 6, 2, 5}, {5, 2, 5, 13})
Output:
    6

Input:
Solution.solution({14, 27, 1, 4, 2, 50, 3, 1}, {2, 4, -4, 3, 1, 1, 14, 27, 50})
Output:
    -4
    */

package FooBar;

import java.util.HashSet;

class Level1 {


    public static int check(int[] gr, int[] sm){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<sm.length; i++){
            set.add(sm[i]);
        }
        
        for(int i=0; i<gr.length; i++){
            if(!set.contains(gr[i]))
                return gr[i];
        }
        return -1;
    }
    
    
    public static int solution(int[] x, int[] y) {
        // Your code here
        int lenx = x.length;
        int leny = y.length;
        
        if(lenx > leny)
            return check(x, y);
        else
            return check(y, x);
    }


    public static void main(String args[]){
        int[] i = new int[]{14, 27, 1, 4, 2, 50, 3, 1}; 
        int[] j = new int[]{2, 4, -4, 3, 1, 1, 14, 27, 50};

        System.out.println(solution(i, j));

    }

}


/*

public class Solution {
    
      static int extraElement(int gr[], int sm[], int n)  
    {  
      
        int ans = 0;  
      
        for (int i = 0; i < n; i++)  
            ans ^= sm[i];  
        for (int i = 0; i < n + 1; i++)  
            ans ^= gr[i];  
      
        return ans;  
    } 
    
    public static int solution(int[] x, int[] y) {
        // Your code here
        int lenx = x.length;
        int leny = y.length;
        
        int sumx = 0, sumy = 0;
        
        if(lenx > leny)
            return extraElement(x, y, leny);
        else
            return extraElement(y, x, lenx);
        
    }
}
*/