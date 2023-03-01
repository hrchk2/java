public class q008{
  public static void main(String[] args){
  
  int loopCount = 5 ; //行
  int col = 7; //列
  for(int i=1; i <= loopCount; i++){
    for(int j = 1; j <= col ;j++){
     if(j % 2 == 0){
      System.out.print(" ");
     }else{
      System.out.print("■");
     }
     }
    System.out.println();
  }
  // 模範解答
  // int row = 5;  // 行（縦方向）の数
  // int col = 7;  // 列（横方向）の数
        
  // for (int i = 0; i < row; i++) {    // 行ループ
  //  for (int j = 0; j < col; j++) {    // 列ループ
  //    if (j % 2 == 0) {    // 偶数列の場合のみ実行
  //      System.out.print('■');
  //    } else {             // 奇数列の場合のみ実行
  //      System.out.print('　'); // 全角スペースを表示
  //    }
  //  }
  //  System.out.println(); // 列ループが終われば改行
  // }
  }
}