public class q007{
  public static void main(String[] args){
  
  int loopCount = 5 ; //行
  for(int i=1; i <= loopCount; i++){
   if((i - 1) % 2 == 0){
    for(int j = 1; j <= 7;j++){
     System.out.print("◆"); 
     }
  // }else{
  //   for(int j = 1; j <= 7;j++){
  //   System.out.print("◇"); 
  //   }
    }
    System.out.println();
  }
  
  //模範解答
  // int row = 5;  // 行（縦方向）の数
  // int col = 7;  // 列（横方向）の数
        
  // for (int i = 0; i < row; i++) {    // 行ループ
  //   if (i % 2 == 0) {    // 偶数行の場合のみ実行
  //     for (int j = 0; j < col; j++) {    // 列ループ
  //       System.out.print('■');
  //     }
  //   }
  // System.out.println(); // 列ループが終われば改行
  
  }
}