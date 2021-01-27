package Assignment2.Q6;

public class Assignmnet2Q6 {
    public static void main(String[] args) {
    	FilePersistence f=new FilePersistence();
    	DatabasePersistence d=new DatabasePersistence();
        f.persist();
        d.persist(); 	
    }
}
