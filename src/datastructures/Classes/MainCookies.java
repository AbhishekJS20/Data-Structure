package datastructures.Classes;

public class MainCookies {
    public static void main(String[] args)
    {
        Cookies co= new Cookies("Blue");
        Cookies coo=new Cookies("Green");

        co.setColor("Yollow");

        System.out.println(co.getColor());
        System.out.println(coo.getColor());
    }
}
