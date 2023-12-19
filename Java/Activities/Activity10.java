package Activities;

import java.util.HashSet;

public class Activity10
{
    public static void main(String[]args)
    {
        HashSet<String>hs=new HashSet<String>();
        hs.add("Virat");
        hs.add("Rohit");
        hs.add("Rahul");
        hs.add("Surya");
        hs.add("Ishan");
        hs.add("Sachin");

        System.out.println("Original hashSet is:"+hs);
        System.out.println("Original hashSet size is:"+hs.size());

        //remove element from original list
        System.out.println("Removing Sachin from original list: " +hs.remove("Sachin"));

        //removing elemment which is not in original list
        if(hs.remove("Bumrah"))
        {
            System.out.println("Bumrah is removed from original lits");
        }
        else
        {
            System.out.println("Bumrah is not in original lits");
        }

        //check element in original list
        System.out.println("If Sachin is in oroginal list or not after removal: " +hs.contains("Sachin")); //false

        //print updated hashset
        System.out.println("updated hashset after processing is:"+hs);
    }

}
