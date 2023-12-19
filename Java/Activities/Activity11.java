package Activities;

import java.util.HashMap;

public class Activity11
{
    public static void main(String[]args)
    {
        HashMap<Integer,String>colours=new HashMap<Integer,String>();
        colours.put(0,"Orange");
        colours.put(1,"Blue");
        colours.put(2,"Green");
        colours.put(3,"Red");
        colours.put(4,"White");

        System.out.println("given map is:"+colours);

        System.out.println("removing Red from list"+colours.remove(3));
        System.out.println("given map is:"+colours);

        //check if green exist in map
        if(colours.containsValue("Green"))
        {
            System.out.println("Green colour is present");
        }
        else
        {
            System.out.println("Green colour is not present");
        }

        System.out.println("updated Size of map is:"+colours.size());


    }
}
