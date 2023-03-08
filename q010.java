public class q010{
  public static void main(String[] args){
  
  int loop = 8; 
  
  for(int i=1;i <= loop;i++){
    for(int j=0;j<i;j++){
      System.out.print("■.");
    }
    System.out.println("a");
  }
  
  // 模範解答
  // int n = 8;  // 繰り返しの数
  
  // for (int i = 0; i < n; i++) {    // 行ループ
  //   for (int j = 0; j < i + 1; j++) {    // 列ループ
  //     System.out.print('■');
  //   }
  //   System.out.println(); // 列ループが終われば改行
  // }
  
  }
}