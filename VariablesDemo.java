public class VariablesDemo {
int instanceVar=10;
static String staticVar="Iam static";
public void showVariables()
{
    int localVar=5;
    System.out.println("instance variable:"+instanceVar);
    System.out.println("static Variable:"+staticVar);
    System.out.println("local Variable:"+localVar);
}
public static void main(String[]args)
{
    VariablesDemo obj1=new VariablesDemo();
    obj1.showVariables();
    System.out.println("Accesing static variable via class:"+VariablesDemo.staticVar); 
}
}