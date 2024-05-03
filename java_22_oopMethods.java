class computer
{
    public void playMusic()
    {
        System.out.println("Music playing");
    }

    public String getMeAPen(int cost)
    {
        System.out.println("you gave me " + cost + " rupees");
        if(cost >= 10)
            return "take your PEN";

        return "this money is insufficient to buy a pen";
    }
}
public class java_22_oopMethods
{
    public static void main(String[] args)
    {
       computer obj = new computer();
       obj.playMusic();
       String str = obj.getMeAPen(2);
        System.out.println(str);
    }
}

