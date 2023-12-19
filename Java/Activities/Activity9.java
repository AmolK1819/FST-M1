package Activities;

import java.util.ArrayList;

public class Activity9
{
    public static void main(String[]args)
    {
        ArrayList<String>myList=new ArrayList<String>();
        myList.add("Rohit");
        myList.add("Virat");
        myList.add("Rahul");
        myList.add("Surya");
        myList.add("Ishan");

        for(String names:myList)
        {
            System.out.println("Data in ArrayList is:"+names);

        }
        System.out.println("Name in 3rd index is:"+myList.get(3));
        System.out.println(myList.contains("Virat"));
        System.out.println("Size of Arralist is:"+myList.size());
        System.out.println("deleted name from arraylist is:"+myList.remove(3));
        System.out.println("Size of Arralist after removal 3rd index is:"+myList.size());




    }
}
