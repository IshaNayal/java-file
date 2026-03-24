class WrapperDemo{
    int num1, num2,sum,product;
WrapperDemo(String str1, String str2) {
    num1 = Integer.parseInt(str1);
    num2 = Integer.parseInt(str2);
sum = num1 + num2;
product = num1 * num2;
System.out.println("First Number:" + num1);
System.out.println("Second Number:" + num2);
}
void display(){
    System.out.println("sum:" + sum);
    System.out.println("product:" + product);
}
public static void main(String[] args)
{
    WrapperDemo obj = new WrapperDemo("15", "10");
    obj.display();
}
}