package com.company;

import java.util.Arrays;

public class MostRepeatedNumber {
    static int mostFrequent(int arr[], int n)
    {

        // Sort the array
        Arrays.sort(arr);

        // find the max frequency using linear
        // traversal
        int max_count = 1, res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }

        // If last element is most frequent
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = arr[n - 1];
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = { 1,1,2,2,3,4,2,2,2,2,2,2,7,8,9,10 };
        int n = arr.length;

        System.out.println(mostFrequent(arr,n));



    }
}




