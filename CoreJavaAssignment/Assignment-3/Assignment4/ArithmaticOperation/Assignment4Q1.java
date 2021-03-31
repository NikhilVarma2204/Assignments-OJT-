package ArithmaticOperation;

public class Assignment4Q1 implements Operations {
    public static void main(String[] args){
        Operations o= new Operations();
        o.fun(3, 4);
}

@Override
	 public void fun(int a, int b) {
        
        System.out.println("add= "+(a+b));
        System.out.println("Sub= "+(a-b));
        System.out.println("Multiply= "+(a*b));
        System.out.println("Division is "+(a/b));
    }
}
