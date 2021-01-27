package LambdaExpressions;

class Orders {
   int totalPrice;
   String status;
     Orders(int totalPrice){
      this.totalPrice=totalPrice;
    
   }
   void showData()
   {
      if(totalPrice>10000){
         System.out.println("status is checked");
      }else
      System.out.println("status is unchecked");
   }
    
}
