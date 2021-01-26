package Assignment-2.OrganisatinSalaries;

public class Employee {
    int incentive=5000;
    int overTime=500;
    int mangerCount=5;
    int labourCount=5*mangerCount;

}
public class Manager extends Employee{
   @Override
    void Salary(int workingDays){
       System.out.println("The salary of manager = "+(workingDays*incentive));
    }
}
public class Labour extends Employee{
    @Override
    void Salary(int workingDays){
        System.out.println("The salry of labour ="+(workingDays*overTime));
    }

