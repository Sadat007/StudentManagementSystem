package com.company;

interface A {

    public int abc();

    public default int def()
    {
        return 1;
    }

    public static int ghi()
    {
        System.out.print("This is static Method and return :  ");
        return 2;
    }
    public default int jkl()
    {
        return 3;
    }
    public static void main(String[] args)
    {
        System.out.println(A.ghi());
        C c = new C();
        System.out.println(c.abc());
        System.out.println(c.jkl());
        System.out.println(c.mno());
        System.out.println(c.def());


    }
}
interface B extends A
{
    public int mno();
}
class C implements B
{

    public int abc() {
        return 4;
    }


    public int mno() {
        return 5;
    }

    @Override
    public int jkl() {
        System.out.print("This is jkl default method rerutn 3 but overriden by 10 return  : ");
        return 10;
    }
}
