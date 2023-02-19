public class q002{
  public static void main(String[] args){
  
  for(int i=1 ;i <= 5;i++){
   System.out.println("■.");
  }
  
  // 別解答
  for (int i = 0; i < 5; i++) {
    System.out.print('■'); // ここでは改行しない
    System.out.println(); // 引数無しprintln()で改行
  }
  
  int ii = 1000;
  System.out.print(ii);
  }
}