//program to check if the sum of all the 10's in the array is exactly 30.
//The program returns false if the condition does not satisfy, otherwise returns true.

package Activities;

import java.util.Arrays;

public class Activity2
{
    public static void main(String[]args)
    {
        int[]numArr={10,77,10,54,-11,10};
        System.out.println("Given Array Is:"+ Arrays.toString(numArr));

        int searchNum=10;
        int FixedSum=30;

        System.out.println("Result Is:"+ result(numArr,searchNum,FixedSum));
    }

    public static boolean result(int[] numbers,int searchNum,int FixedSum)

    {
        int tempSum=0;
        for(int number:numbers)
        {
            if(number==searchNum)
            {
                tempSum+=searchNum;
            }
            if(tempSum>FixedSum)
            {
                break;
            }
        }
        return tempSum==FixedSum;

    }

}
