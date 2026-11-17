public class lambda{
    public static void main(String[]args){
   Calculator c=new Addition();
   int sum=c.Calculator(5,7);
   System.out.println(sum);
    }
    // public static void print(int a,int b,Calculator c)
}
@FunctionalInterface 
interface Calculator{
    int Calculator(int a,int b);

}
class Addition implements Calculator{
    @Override
    public int Calculator(int a, int b){
        return a+b;
    }
}