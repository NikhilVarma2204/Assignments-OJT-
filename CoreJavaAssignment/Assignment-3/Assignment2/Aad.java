package Assignment2;



public class Aad {
   static int Add(int a,int b){
        System.out.println(a+b);
    return 0;
    }
    public static void main(String[] args){
      Add(3,4);

    }
    @Test
    void testAdd(int a,int b){
        assertEquals(7,(3,4));
    }
}
