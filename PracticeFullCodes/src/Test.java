

class Test
{
public static void main(String[] args)
{
PopCorn p=new PopCorn()
{
public void taste()
{
System.out.println("salty");
}
};
p.taste();//salty
PopCorn p1=new PopCorn();
p1.taste();//spicy
}
}

class PopCorn
{
public void taste()
{
System.out.println("spicy");
}
}