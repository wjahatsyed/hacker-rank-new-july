package com.wjahatsyed.hackerrank;

/**
 * Created by Syed Wajahat on 7/19/2020.
 */
class GFG_1
{
    // To find minimum sum
    // of unique elements.
    static int minSum(int arr[], int n)
    {
        int sum = arr[0];

        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1]) {

                // While current element is same as
                // previous or has become smaller
                // than previous.
                int j = i;
                while (j < n && arr[j] <= arr[j - 1])
                {
                    arr[j] = arr[j] + 1;
                    j++;
                }
            }
            sum = sum + arr[i];
        }

        return sum;
    }

    // Driver code
    public static void main (String[] args)
    {
        int arr[] = { 3,2,1,2,7};
        int n = arr.length;
        System.out.println(minSum(arr, n));
    }
}