package JavaBasicDS;

class Interest{
    void simpleInterest(int i,int r,int t){
          double si=i*(100+r*t)/100;
          System.out.println("simple interest= "+si);
    }
    void compoundInterest(int i,int r,int n,int t){
             double ci= i*Math.pow((n+r)/n,n*t);
             System.out.println("CI=" +ci);
    }
       
    
}
