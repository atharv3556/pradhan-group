import java.util.*;
class circle
{
float r,area;
circle()
{
r=0;
area=1;
}
circle(float i)
{
r=i;
}
void cal_area()
{
area=1;
area=3.14f*r*r;
}
void display()
{
System.out.println("area="+area);
}
}
class constructor
{
public static void main(String args[])
{
circle c=new circle(10);
c.cal_area();
c.display();
}
}