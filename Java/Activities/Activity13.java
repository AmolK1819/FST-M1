package Activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<Integer>();
        Random rnd= new Random();

        System.out.println("Enter Integer numbers: ");
        System.out.println("(EOF or non-integer to terminate): ");

        while (sc.hasNextInt())
        {
            list.add(sc.nextInt());
        }

        Integer nums []=list.toArray(new Integer[0]);
        int index=rnd.nextInt(nums.length);

        System.out.println("Index value generated:"+index);
        System.out.println("value in array at generated index:"+nums[index]);

        sc.close();




    }
}
