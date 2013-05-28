package ru.lev.cojp;

public class Test1 {
    static int i[];
    public static void main(String... args)
    {
        int eye[] = new int[0];
        try
        {
            try{
                System.out.println(i.length);
            }
            finally{
                i = eye;
            }
        }
        catch (RuntimeException e)
        {
            e.printStackTrace();
            System.err.println(i.length);
        }
    }
}
