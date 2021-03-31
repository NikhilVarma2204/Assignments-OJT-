package StudentAvg;

public class Student {
   private int subjectA;
    private int subjectB;
    private int subjectC;
    void studentsTotalMarks(int A,int B,int C){
        
        System.out.println(A+B+C);

    }
    void studentsAvgMarks(int A,int B,int C){
       
         System.out.println((A+B+C)/3);
    }
    public int subjectATotalByStudents(int[] marks) {
       int sum=0;
        for(int i=0;i<marks.length;i++){
         sum=sum+marks[i];
       }
       System.out.println("The Sum of subjectA is= "+sum);
    }
    public double subjectBAverageByStudents(int[] marks) {
        int sum=0;
        for(int i=0;i<marks.length;i++){
         sum=sum+marks[i];
       }
       System.out.println("the average of SubjectB = "+sum/3);
       }
       public double subjectCAverageByStudents(int[] marks) {
        int sum=0;
        for(int i=0;i<marks.length;i++){
         sum=sum+marks[i];
       }
       System.out.println("the average of SubjectC = "+sum/3);
       } 
    }
