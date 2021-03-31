package ArraySorting;

public class SearchArray {
    public void searchArray(int[]arr,int toCheckValue){
        boolean test= Arrays.asList(arr).contains(toCheckValue);
        System.out.println(toCheckValue+"is present in"+test);
    }
}
