package FunctionalInterfaces;

public class Assignment4Q3 {
    public static void main(String[] args){
        Supplier<Integer> supplier = () -> new Integer((int) (Math.random() * 1000D));
        Consumer<Integer> consumer = (value) -> System.out.println(value);
        Predicate predicate = (t) -> t != null;
        Function f= (i)->{System.out.println(i);};
    }
}
