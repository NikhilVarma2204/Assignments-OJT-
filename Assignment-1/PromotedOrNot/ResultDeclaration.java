package Assignment1.PromotedOrNot;

public class ResultDeclaration {
    public String declareResult(double sub1,double sub2,double sub3){
        
        if(sub1>60&sub2>60&sub3>60){
            System.out.println("the student is passed");
        }
        if((sub1>60&sub2>60)||(sub2>60&sub3>60)||(sub3>60&sub1>60)){
            System.out.println("the student is promoted");
        }
        if(sub1+sub2<60||sub2+sub3<60||sub3+sub1<60){
            System.out.println("failed");
        }
        
        return null;
    }
}
